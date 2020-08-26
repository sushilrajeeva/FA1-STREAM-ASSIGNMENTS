package application;

public class RegularCourseCertification extends RRTechnicalCertification{
	
	private int courseDuration;
	
	public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration = courseDuration;
		generateRegistrationId();
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public void generateRegistrationId() {
		RRTechnicalCertification.counter += RRTechnicalCertification.counter % 2 == 0 ? 1 : 2;
		super.setRegistrationId(RRTechnicalCertification.counter);
	}

	@Override
	public double calculateFee() {
		int marks = super.getAdmissionTestMarks();
		double discount = marks >= 90 ? 0.9 : (marks >= 75 ? 0.95 : 1);
		return Certification.REGULAR_COURSE_FEE * discount * this.courseDuration;
	}	
}
