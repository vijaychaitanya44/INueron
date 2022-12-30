package com.day11;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class FileHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("D:\\Eclipse WS\\INueron\\Java_Learning\\prop\\Config.properties");
		
		
		try {
			
			FileInputStream fis = new FileInputStream(myFile);
			
			Properties pro = new Properties();
			
			pro.load(fis);
			
		System.out.println(pro.get("url"));
		System.out.println(pro.get("browser"));

		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found: "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Input output found: "+e.getMessage());
		}
	}
}
