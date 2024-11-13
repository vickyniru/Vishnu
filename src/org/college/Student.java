package org.college;

public class Student {
	public void studentName() {
		System.out.println("Akshatha");
	}
	public void studentID() {
		System.out.println("FDC3452");
}
	public void studentDept() {
		System.out.println("Computer Science");
	}
	public static void main(String[]args) {
		Student s = new Student();
		s.studentName();
		s.studentID();
		s.studentDept();
	}
}
		