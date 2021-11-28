package com.labassignment.services;

import com.labassignment.model.Employee;
import java.util.Random;

public class CredentialService{
	
	private String password="";
	private String emailAddress="";
	
	public String generatePassword()
	{
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	     String specialCharacters = "!@#$";
	     String numbers = "1234567890";
	     String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] pwd = new char[8];

	      for(int i = 0; i< 8 ; i++) {
	         pwd[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	         password=password+pwd[i];
	      }
		return password;
	}
	
	public String generateEmailAddress(Employee E1, String dept)
	{
		String fname=E1.getFirstName();
		String lname=E1.getLastName();
		emailAddress=fname+lname+"@"+dept+".abc.com";
		emailAddress=emailAddress.toLowerCase();
		return emailAddress;
	}
	
	public void showCredentials()
	{
		System.out.println("Email        ---> "+emailAddress);
		System.out.println("Password     ---> "+password);
	}
}
