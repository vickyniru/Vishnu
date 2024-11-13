package org.college;

public class New {
	public static void main(String[] args) {
		// widening casting

	long phoneNo = 765848848848L;
	System.out.println("Before narrowing casting : " + phoneNo);
	short myPhoneNo = (short) phoneNo;
	System.out.println("After narrowing casting : " + myPhoneNo);

	
	byte age = 30;
	System.out.println("Before widening casting : " + age);
	int myAge = age;
	System.out.println("After widening casting : " + myAge);

}

}
