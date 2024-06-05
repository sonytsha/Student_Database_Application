package studentdatabaseapp;
import java.util.Scanner;
public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// constructor  : prompt user to enter students's name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.println("1- freshmen\n 2 - for sophmore\n 3 - junior\n 4- junior\n "
				+ "Enter student class level : ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		// System.out.println(firstName + " " + lastName + " " + gradeYear +" " + studentID);

	}
	
	// generate and id
	private void setStudentID() {
		//grade level + ID 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// enroll in courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
		
		System.out.print("enter course to enroll ( Q to quit) : ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance =  tuitionBalance + costOfCourse;
		}
		else { 
			break;
			}
		}
		while(1 !=0);
		
		// System.out.println("Enrolled in : " + courses);
		//System.out.println("Tuition Balance : " + tuitionBalance);
		
	}
	
	// view balance 
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance );
	}
	
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment : $");
Scanner sc = new Scanner(System.in);
int payment = sc.nextInt();
tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of : $" + payment);
		viewBalance();
	}
	
	// show status
	
	public String showInfo() {
		return "Name" + firstName + " " + lastName +
				"\nGrade Level : "+ gradeYear +
				"|nStudent ID : " +studentID +
				"\nCourses Enrolled : " + courses +
				"\nBalance is : $" + tuitionBalance;
	}
	
	

}
