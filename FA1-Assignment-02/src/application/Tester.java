package application;

public class Tester {
	public static void main(String[] args) {
		// Code here
		
		CourseRegistration c1 = new CourseRegistration();
		c1.setStudentName("Peter");
		c1.setRegistrationId(5001);
		c1.setQualifyingMarks(58);
		c1.setCourseId(1005);
		c1.setHostelRequired(true);
		c1.calculateCourseFee();
		
		CourseRegistration c2 = new CourseRegistration();
		c2.setStudentName("Peter");
		c2.setRegistrationId(5001);
		c2.setQualifyingMarks(68);
		c2.setCourseId(1006);
		c2.setHostelRequired(true);
		c2.calculateCourseFee();
		
		CourseRegistration c3 = new CourseRegistration();
		c3.setStudentName("Peter");
		c3.setRegistrationId(5001);
		c3.setQualifyingMarks(78);
		c3.setCourseId(1005);
		c3.setHostelRequired(false);
		c3.calculateCourseFee();
		
	}
}
