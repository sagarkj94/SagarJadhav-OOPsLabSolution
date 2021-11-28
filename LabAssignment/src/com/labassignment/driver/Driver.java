package com.labassignment.driver;

import java.util.Scanner;

import com.labassignment.model.Employee;
import com.labassignment.services.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Harshit","Choudary");
		CredentialService cs=new CredentialService();
		
		System.out.println("Please enter the department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice;
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Dear "+e1.getFirstName()+" your generated crendential are as follows");
			cs.generateEmailAddress(e1, "tech");
			cs.generatePassword();
			cs.showCredentials();
			break;
		case 2:
			System.out.println("Dear "+e1.getFirstName()+" your generated crendential are as follows");
			cs.generateEmailAddress(e1, "adm");
			cs.generatePassword();
			cs.showCredentials();
			break;
		case 3:
			System.out.println("Dear "+e1.getFirstName()+" your generated crendential are as follows");
			cs.generateEmailAddress(e1, "HR");
			cs.generatePassword();
			cs.showCredentials();
			break;
		case 4:
			System.out.println("Dear "+e1.getFirstName()+" your generated crendential are as follows");
			cs.generateEmailAddress(e1, "lg");
			cs.generatePassword();
			cs.showCredentials();
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
