package com.JavaCode;

public class Customer {
	public static void main(String[] args) {
		
		//Employee ee=new Employee(); //won't create Object to Interface.
		Employee ee= new Salary();//Create - Class is an Object
		ee.empSalary();
		ee.empAge();
		System.out.println(Employee.emp);//Static Method directly call from interface
		System.out.println(Employee.age);
	}
}
class Salary implements Employee{
	//initializing Abstract Methods
	@Override
	public void empSalary() {
		//emp=6000; Final will declare one time.
		System.out.println("Employee salary is:"+emp);		
	}
	@Override
	public void empAge() {
		System.out.println("Employee Age is:"+age);		
	}

}
interface Employee {
	int emp=5000; //Public + Static + final
	int age=30;
	void empSalary();
	public abstract void empAge(); //Public + abstract

}
// calling - class to interface use - Implements Keyword
// calling - Class to Class Use - Extends keyword