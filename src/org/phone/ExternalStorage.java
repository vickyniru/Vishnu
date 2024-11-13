package org.phone;

public class ExternalStorage {
	public void Size() {
		System.out.println("128GB");
	}
	public static void main(String[]args) {
		ExternalStorage m = new ExternalStorage();
		 InternalStorage i = new InternalStorage();
		   i.ramSize();
		   i.processorname();
		m.Size();
	}

}
