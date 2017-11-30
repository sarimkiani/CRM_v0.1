package com.crmbasics;

//import java.util.Comparator;

public class Customer {

	String First_Name;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	String Last_Name;
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	int Age;
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	
	/*@Override
	public int compareTo(Customer other){
		int compareInt = this.Last_Name.compareTo(other.Last_Name);
		
		if(compareInt < 0) return -1;
		if(compareInt > 0) return 1;
		return 0;
	}*/
	
	
}
