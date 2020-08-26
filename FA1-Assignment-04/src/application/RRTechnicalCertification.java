package application;
	
public abstract class RRTechnicalCertification implements Certification{
	
	private String studentName;
	private String courseName;
	private int registrationId;
	private int admissionTestMarks;
	
	protected static int counter = 1000;
	
	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
	
	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}

	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public abstract void generateRegistrationId();

	@Override
	public abstract double calculateFee();
}
