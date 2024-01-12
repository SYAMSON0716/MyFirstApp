package com.JavaCode;

public interface Office {
	void salaryadd();
}
interface StfRoom extends Office{
	void salSub();
}
class eceDept implements StfRoom{

	@Override
	public void salaryadd() {
		int a=10,  b=20,  c=a+b;
		System.out.println("Salary Addition "+c);
		}

	@Override
	public void salSub() {
		int  salary=6000;
		if(salary > 5000) {
			System.out.println("first month salary ");
		}
		else {
			System.out.println("Second month salary");
		}
		int a=30, b=10,  c=a-b;
		System.out.println("Salary Subtraction :"+c);
		
	}
	
}


