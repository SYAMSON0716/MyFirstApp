package com.JavaCode;

interface BackendDev{
	int games=50; //public+static + final
	void appStore(); // public + abstract	
	void gameStore();
	
	}
abstract class FrontEnd implements BackendDev{

	@Override
	public void appStore() {
System.out.println("Gaming Application Store");		
	}
}
	class Games extends FrontEnd{
	@Override
	 public void gameStore() {
System.out.println("Gaming Design center");		
	}	
}
public class Developer {
	public static void main(String[] args) {
		FrontEnd g=new Games();
		g.appStore();
		g.gameStore();
		
	}


}
