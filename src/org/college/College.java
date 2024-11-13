package org.college;

public class College {
 
	public void collegeName() {
		System.out.println("SFR College");
	}
	public void collegeCode() {
	

		System.out.println("ABCD");
	}
	public void collegeRank() {
		System.out.println("6th Position");
	}
	
	public static void main(String[]args) {
	 College c = new College();
	 Student s = new Student();
	 Hostel h = new Hostel();
	 Dept d = new Dept();
	    d.deptName();
		 
	    h.hostelName();
		s.studentName();
		s.studentID();
		s.studentDept();
	    c.collegeName();
	    c.collegeRank();
	    c.collegeCode();
	}
}
	  

