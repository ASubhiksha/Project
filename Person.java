package entity;

import java.util.Scanner;

public class Person {
	public String Firstname = " ";
	public String lastname = "";
	public int IdNo = 0;
	public String Gender = " ";
	public String City = " ";

	public void insert() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name ");
		Firstname = scanner.next();

		System.out.println("Enter last name ");
		lastname = scanner.next();

		System.out.println("Enter Roll_No:");
		IdNo = scanner.nextInt();

		System.out.println("Enter City ");
		City = scanner.next();

		System.out.println("Enter Gender:");
		Gender = scanner.next();

	}

	public void display() {
		System.out.println("\nFirst Name : " + Firstname + "\nLast Name : " + lastname + "\nIdNo: " + IdNo + "\nCity : "
				+ City + "\nGender:" + Gender);

	}

	public Person searchByIdNo(Person[] arr3, int IdNo, int totalCount) {
		for (int i = 0; i < totalCount; i++) {

			if (arr3[i].IdNo == IdNo)
			{

				return arr3[i];
			}

		}

		return null;

	}

	public void searchByFirstname(Person[] arr3, String Firstname, int totalcount,Person[] returnarr ) {
		
		int matchedcount = 0;
		for (int i = 0; i <totalcount; i++) {

			if (arr3[i].Firstname.equals(Firstname))// 110
			{

				returnarr[matchedcount] = arr3[i];
				matchedcount++;
			}

		}

		

	}

	public void searchBylastname(Person[] arr3, String lastname, int totalcount,Person[] returnarr) {

		int matchedcount = 0;
	
		for (int i = 0, j = 0; i <totalcount; i++) {

			if (arr3[i].lastname.equals(lastname))// 110
			{

				returnarr[matchedcount] = arr3[i];
				matchedcount++;
			}

		}
	
	}

	public void searchByCity(Person[] arr3, String City, int totalcount,Person[] returnarr) {
		
		int matchedcount = 0;
		for (int i = 0, j = 0; i < totalcount; i++) {

			if (arr3[i].City.equals(City))// 110
			{

				returnarr[matchedcount] = arr3[i];
				matchedcount++;
			}

		}
		
		
	}

	public void searchByGender(Person[] arr3, String Gender, int totalcount, Person[] returnarr) {

		
		int matchedcount = 0;

		for (int i = 0, j = 0; i < totalcount; i++) {

			if (arr3[i].Gender.equals(Gender))// 110
			{

				returnarr[matchedcount] = arr3[i];
				matchedcount++;
			}

		}

	}


}
