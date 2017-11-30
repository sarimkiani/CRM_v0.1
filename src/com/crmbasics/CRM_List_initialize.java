package com.crmbasics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CRM_List_initialize {
	
	 //static ArrayList<String> myList = new ArrayList<String>();
	 static List<Customer> CustList = new ArrayList<Customer>();
	 
	 static Scanner reader = new Scanner (System.in);
	 
	public static void Initialize(){
	
	for(int i=0; i<2; i++){
		
	Customer c1 = new Customer();
	
	System.out.println("Please enter the customer data you want to add");
	
	System.out.print("Enter First Name: ");
	String in_fname = reader.nextLine();
	c1.setFirst_Name(in_fname);
	
	System.out.print("Enter Last Name: ");
	String in_lname = reader.nextLine();
	c1.setLast_Name(in_lname);
	
	System.out.print("Enter Email: ");
	String in_email = reader.nextLine();
	c1.setEmail(in_email);
	
	System.out.print("Enter Age: ");
	int in_age = reader.nextInt();
	reader.nextLine();
	c1.setAge(in_age);
	
	CustList.add(c1);
	
	System.out.println("Data entry successful");
	}
	//myList.add("Sarim");
	//myList.add("Alexis");
	//myList.add("Shah");
	
	}
	
	public void View_All(){
		
		Customer c2 = new Customer();
		
		System.out.println("**Existing Customer Records**");
		
		for(int i=0; i<CustList.size(); i++){
			c2 = CustList.get(i);
			System.out.println("First Name: " + c2.getFirst_Name());
			System.out.println("Last Name: " + c2.getLast_Name());
			System.out.println("Email: " + c2.getEmail());
			System.out.println("Age: " + c2.getAge());
		}

		//System.out.println("Testingggg");
	}
	
	
	public void Search_Customer(){
		
		Customer c3 = new Customer();
		
		System.out.println("**Customer Search through First Name**");
		
		System.out.println("Please Enter the name of the customer you want to search");
		String sc = reader.nextLine();
		int found = 0;
		
		for(int i=0; i<CustList.size(); i++){
			c3 = CustList.get(i);
			//c3.getFirst_Name();
			
			if(sc.equalsIgnoreCase(c3.First_Name)){
				System.out.println("Customer Found ");
				System.out.println("First Name: " + c3.getFirst_Name());
				System.out.println("Last Name: " + c3.getLast_Name());
				System.out.println("Email: " + c3.getEmail());
				System.out.println("Age: " + c3.getAge());
				found = 1;
			}
			
		}
		
		if(found!=1){
			System.out.println("Sorry, customer not found");
		}
		
	}

	public void Delete_Record(){
		
		Customer c3 = new Customer();
		
		System.out.println("**Deleting a Customer Record**");
		
		System.out.println("Please Enter the name of the customer you want to delete");
		String del = reader.nextLine();
		int found = 0;
		
		for(int i=0; i<CustList.size(); i++){
			c3 = CustList.get(i);
			//c3.getFirst_Name();
			
			if(del.equalsIgnoreCase(c3.First_Name)){
				System.out.println("Customer data to be deleted found ");
				System.out.println("First Name: " + c3.getFirst_Name());
				System.out.println("Last Name: " + c3.getLast_Name());
				System.out.println("Email: " + c3.getEmail());
				System.out.println("Age: " + c3.getAge());
				found = 1;
				
				CustList.remove(i);
			}
			
		}
		
		if(found!=1){
			System.out.println("Sorry, customer not found");
		}
		
	}
	
	public void Update_Record(){
		
		Customer c4 = new Customer();
		
		System.out.println("**Updating a Customer Record**");
		
		System.out.println("Please enter the first name of the customer whose data you want to update");
		
		String upd_customer = reader.nextLine();
		
		int found = 0;
		
		for(int i=0; i<CustList.size(); i++){
			c4 = CustList.get(i);
			
			if(upd_customer.equalsIgnoreCase(c4.First_Name)){
				System.out.println("Customer data to be updated found ");
				System.out.println("First Name: " + c4.getFirst_Name());
				System.out.println("Last Name: " + c4.getLast_Name());
				System.out.println("Email: " + c4.getEmail());
				System.out.println("Age"+ c4.getAge());
				found = 1;
				
				System.out.println("Please enter new data for this customer");
				
				System.out.print("Enter First Name: ");
				String in_fname = reader.nextLine();
				c4.setFirst_Name(in_fname);
				
				System.out.print("Enter Last Name: ");
				String in_lname = reader.nextLine();
				c4.setLast_Name(in_lname);
				
				System.out.print("Enter Email: ");
				String in_email = reader.nextLine();
				c4.setEmail(in_email);
				
				System.out.print("Enter Age: ");
				int in_age = reader.nextInt();
				c4.setAge(in_age);
				
				//CustList.set(i, First_Name);
			}
			
			if(found!=1){
				System.out.println("Sorry, customer data not found");
			}
			
		}
		
	}

	// Sorting Age in Ascending Order
	class Age_Ascending_Comparator implements Comparator <Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {
			if(o1.getAge() > o2.getAge()){
				return 1;
			}
			
			else if(o1.getAge() < o2.getAge()){
				return -1;
			}
			return 0;
		}
		
	}
	
	class Last_Name_Comparator implements Comparator<Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.Last_Name.compareTo(o2.Last_Name);
		}
		
	}
	
	
	public void sort_data_age(){
		System.out.println("**Customer List sorted in Ascending order according to Age**");
		Collections.sort(CustList, new Age_Ascending_Comparator());
	}
	
	public void sort_data_LastName(){
		System.out.println("**Customer List sorted in Alphabetic order according to Last Name**");
		Collections.sort(CustList, new Last_Name_Comparator());
	}

	public void key_statement(){
		
		System.out.println("***Welcome to Customer Relationship Management System***");
		System.out.println("Please use one of the following keys to proceed");
		System.out.println("\t\t Key \t\t Desired Operation");
		System.out.println("\t\t 01 \t\t Enter Customer Data");
		
		
	}

}
