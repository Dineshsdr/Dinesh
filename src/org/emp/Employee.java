package org.emp;

public class Employee {

	private void empid() {
		System.out.println("empid");
	}
	private void empName() {
		System.out.println("empName");
	}
	private void empDob() {
		System.out.println("empDob");
	}
	private void empPhone() {
		System.out.println("empPhone");
	}
	private void empEmail() {
		System.out.println("empEmail");
	}
	private void empAddress() {
		System.out.println("empAddress");
	}
	
	public static void main(String[] args) {
		Employee E = new Employee();
		E.empAddress();
		E.empDob();
		E.empEmail();
		E.empid();
		E.empName();
		E.empPhone();
		
	}
	
	
	
	
	
	
	
}
