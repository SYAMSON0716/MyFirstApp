package com.JavaCode;

public interface Laptop {
	
	
	public void windows11();
	void msOffice();
	void camera();
	public void security();
	void fingerPrintSen();
	public void Touch();
	
	default void jblSpeakers() {
		System.out.println("");
	}
	static void i9Processor() {
		System.out.println("");
		
	}

}
