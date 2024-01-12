package com.JavaCode;

public interface Faculty {
	
	int StudentStrength=30; // public+Static+final
	void teachingFac(); // Public+abstract
	void nonTeachingFac();// Public+abstract
	}
class Principal implements Faculty{

	@Override
	public void teachingFac() {
		System.out.println("This College 10 Teaching Fac is there");		
	}
	
	@Override
	public void nonTeachingFac() {
		//Faculty.StudentStrength=50;
System.out.println("This Colleger 5 non- Teaching FAC"+StudentStrength);		
	}	
}
class College{
	public static void main(String[] args) {
		Faculty fc=new Principal();
		fc.teachingFac();
		fc.nonTeachingFac();		
	}
}
