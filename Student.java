package entity;

import java.util.Scanner;

public class Student extends Person implements PersonOperation {

	public int Standard = 0;
	public char Section = ' ';
	public int english = 0;
	public int maths = 0;
	public int science = 0;
	public int social = 0;
	public int Tamil = 0;
	public int total = 0;

	public void insert() {
super.insert();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Class:");
		Standard = scanner.nextInt();

		System.out.println("Enter Section:");
		Section = scanner.next().charAt(0);

		System.out.println("Enter englishMarks ");
		english = scanner.nextInt();

		System.out.println("Enter maths Marks ");
		maths = scanner.nextInt();

		System.out.println("Enter science Marks ");
		science = scanner.nextInt();

		System.out.println("Enter social Marks ");
		social = scanner.nextInt();

		System.out.println("Enter Tamil Marks ");
		Tamil = scanner.nextInt();

		total = english + maths + science + social + Tamil;

	}

	public void display() {
super.display();
		System.out.println("Class:" + Standard + "\nSection:" + Section + "\nEnglish Marks :" + english
				+ "\nMaths marks : " + maths + "\nScience marks : " + science + "\nSocial marks : " + social
				+ "\nTamilMark:" + Tamil + "\ntotal:" + total);

	}

	public void searchByGender(Student[] arr1, String Gender, int totalStud,Student[] returnarr) {
		
		int matchedcount = 0;
		for (int i = 0, j = 0; i < totalStud; i++) {

			if (arr1[i].Gender.equals(Gender))// 110
			{

				returnarr[matchedcount] = arr1[i];
				matchedcount++;
			}

		}
		
	}

	public void searchByClassSection(Student[] arr1, int Standard, char Section, int totalStud,Student[] returnarr) {
		Student[] arr = new Student[totalStud];
		int matchedcount = 0;
		for (int i = 0, j = 0; i < totalStud; i++) {

			if (arr1[i].Standard == Standard && arr1[i].Section == Section) {

				returnarr[matchedcount] = arr1[i];
				matchedcount++;
			}

		}
		
	}
public void displayarr(Student[] arr1,int totalStud) {
	boolean isRecordPresent = false;
	for (int i = 0; i < totalStud; i++) {
		
		if (arr1[i] != null) {
			isRecordPresent = true;
			arr1[i].display();
			System.out.println("**********   ***********");
		}
	}
	if (isRecordPresent == false) {
		System.out.println("No record Found");
		System.out.println("**********   ***********");
	}
}

}
