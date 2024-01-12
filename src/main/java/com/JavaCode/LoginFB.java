package com.JavaCode;

public class LoginFB {

	public static void main(String[] args) {
		signoutFB fb=new signoutFB();
		fb.signUP();
		loginGmail lg =	new loginGmail() {
			public void signUP() {
				System.out.println(" Sign Up Successfully to Gmail ");		
			}
		};
		lg.signUP();
		//Lambda Expression by Using anonymous function
		int speed=100;
		loginGmail lgg =()-> {System.out.println(" Sign Up Successfully to insta");
		System.out.println("The Value of i is:"+speed);
		if(speed>100) 
			System.out.println("Medium Speed");
		else
			System.out.println("Maximum Speed");
		
	};
	lgg.signUP();		
	}
}
//@FunctionalInterface
interface loginGmail{
	void signUP();
		private static void signOUT() {
		
	}
	//protected void logOut() {
		
	//}
}

class signoutFB implements loginGmail{

	@Override
	public void signUP() {
		System.out.println(" Sign Up Successfully ");		
	}

}