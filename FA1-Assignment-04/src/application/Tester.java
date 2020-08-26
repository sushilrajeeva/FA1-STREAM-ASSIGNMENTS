package application;

public class Tester {
	
	public static void main(String[] args) {
		RegularCourseCertification r1 = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name	:	" + r1.getStudentName());
		System.out.println("Course Name	:	" + r1.getCourseName());
		System.out.println("Course Duration	:	" + r1.getCourseDuration() + " months");
		System.out.println("Registration ID	:	" + r1.getRegistrationId());
		System.out.println("Fees		:	" + r1.calculateFee());
		System.out.println(r1.getAdmissionTestMarks());
		
		System.out.println("----------------------------------------");
		
		CrashCourseCertification c1 = new CrashCourseCertification("Roshan", "Angular", 71);
		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name	:	" + c1.getStudentName());
		System.out.println("Course Name	:	" + c1.getCourseName());
		System.out.println("Course Duration	:	2 months");
		System.out.println("Registration ID	:	" + c1.getRegistrationId());
		System.out.println("Fees		:	" + c1.calculateFee());
		System.out.println(c1.getAdmissionTestMarks());
		
		System.out.println("----------------------------------------");
		
	}
}
