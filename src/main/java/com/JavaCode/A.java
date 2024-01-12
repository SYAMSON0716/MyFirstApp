package com.JavaCode;

public interface A {
	
		 int x = 10;	
		}
		interface B {
		 int x = 20;
		}
		interface C extends A, B{
		 int x = 30;
		public static void main(String[] args){
		 int a = A.x;
		 int b = B.x;
		 int c = C.x;
		 
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 }
		}



