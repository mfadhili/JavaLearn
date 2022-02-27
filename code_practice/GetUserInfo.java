// File GetUserInfo.java
// Written by Mfadhili Gitau
// Written on 27th Feb 2022

import java.util.Scanner;

public class GetUserInfo
{
	public static void main(String[] args)
	{
		String name; 
		int age;
		
		Scanner inputDevice = new Scanner(System.in); // new scanner obj called inputDevice
		
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine(); // method recieves the next string input 
		
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt(); // method recieves keboard input
		
		System.out.println("Your name is " + name + " and your are " + age + " years old."); // echoing input is a good practice
	}
	
}

