package com.day8;

public class Chrome implements WebDriver{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Chrome objC = new Chrome();
//		
//		objC.startBrowser();
//		objC.startApplication();
//		objC.savePassword();
//		objC.printPDF();
//		objC.closeBrowser();
//		
		
		WebDriver objW = new Chrome();
		
		objW.startBrowser();
		objW.startApplication();
		objW.closeBrowser();
		System.out.println(objW.name);
		System.out.println(WebDriver.name);
		
	}

	public void startBrowser() {
		System.out.println("Start Chrome Browser");
	}
	
	public void startApplication() {
		System.out.println("Start Application");
	}
	
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
	}
	
	public void savePassword() {
		System.out.println("Chrome can save passwords");
	}
	
	public void printPDF() {
		System.out.println("Chrome can generate PDF files");
	}
}
