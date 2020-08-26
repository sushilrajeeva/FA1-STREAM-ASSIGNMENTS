package application;

public class CrashCourseCertification extends RRTechnicalCertification{
	
	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		generateRegistrationId();
	}

	@Override
	public void generateRegistrationId() {
		RRTechnicalCertification.counter += RRTechnicalCertification.counter % 2 == 0 ? 2 : 1;
		super.setRegistrationId(RRTechnicalCertification.counter);
	}

	@Override
	public double calculateFee() {
		int marks = super.getAdmissionTestMarks();
		double discount = marks >= 90 ? 0.9 : (marks >= 75 ? 0.95 : 1);
		return Certification.CRASH_COURSE_FEE * discount *(1 + 12.36/100);
	}
}
