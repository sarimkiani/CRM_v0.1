package com.crmbasics;
import java.util.Scanner;


public class CRM_Main {
	
	public static void main(String[] args) {
		
		Scanner key_reader = new Scanner (System.in);
		Scanner key_reader2 = new Scanner (System.in);
		
		CRM_List_initialize myObj1 = new CRM_List_initialize();
		
		myObj1.key_statement();
		int key = key_reader.nextInt();
		key_reader.nextLine();
		
		
		switch(key){

		case 1:
			CRM_List_initialize.Initialize();
		break;
		
		case 2:
			myObj1.View_All();
		break;
		
		case 3:
			myObj1.Search_Customer();
		break;
		
		case 4:
			myObj1.Delete_Record();
		break;

		case 5:
			myObj1.Update_Record();
		break;
		
		case 6:
			System.out.println("Please Enter one of the keys");
			int key2 = key_reader2.nextInt();
			key_reader2.nextLine();
			
			switch(key2){
				
				case 1:
					myObj1.sort_data_LastName();
				break;
				
				case 2:
					//myObj1.sort_data_age();
				break;
				
				default:
					System.out.println("Incorrect Key Entered. Please use one of the keys specified");
			}
			
			break;
			
		default:
			System.out.println("Incorrect Key entered. Please use one of the key's specified");
	}
	}

}
