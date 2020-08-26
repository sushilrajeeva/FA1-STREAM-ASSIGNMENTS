package application;

import java.util.HashMap;

public class CourseRegistration {
	// Code here
	
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public int getCourseId() {
		return courseId;
	}
	
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	
	public boolean validateMarks() {
		if(this.qualifyingMarks >= 65) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validateCourseId() {
		if(this.courseId >= 1001 && this.courseId <= 1005) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void calculateCourseFee() {
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		m.put(1001, 55000);
		m.put(1002, 35675);
		m.put(1003, 28300);
		m.put(1004, 22350);
		m.put(1005, 115000);
		if(validateMarks() && validateCourseId()) {
			float a = this.qualifyingMarks;
			double discount = a < 65 ? 1 : (a <=69 ? 0.95 : (a <= 84 ? 0.9 : 0.85));
			double fee = m.get(this.getCourseId()) * discount;
			System.out.println("**************Course Allocation Details**************");
			System.out.println("Student Name			:	" + this.getStudentName());
			System.out.println("Course Id			:	" + this.getCourseId());
			System.out.println("Qualifying Exam Marks		:	" + this.getQualifyingMarks());
			System.out.println("Student's Registration Id	:	" + this.getRegistrationId()) ;
			System.out.println("Total course fee		:	" + fee);
			System.out.println("Hostel Required			:	" + this.isHostelRequired());
			System.out.println();
		}
		else if(! validateCourseId()) {
			System.out.println("Invalid Course Id. Please try again!!");
			System.out.println();
		}
		else if(! validateMarks()){
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
			System.out.println();
		}
		
		
	}
	
	
}
