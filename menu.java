package School_Management;

import java.util.Scanner;

import entity.Person;

import entity.Student;
import entity.Teacher;

public class menu {
	private static final String IdNo = null;
	static int TeacherId = 0;
	public static int record = 0;
	public static Student[] arr1 = new Student[100];
	public static Teacher[] arr2 = new Teacher[100];

	static int totalStud = 0;
	static int totalteac = 0;

	public static void option() {

		int option1 = 0;
		int option2 = 0;
		int option3 = 0;

		do {

			Scanner scan = new Scanner(System.in);
			System.out.println("1.Student");
			System.out.println("2.Teacher");
			System.out.println("3.exit");

			option1 = scan.nextInt();

			switch (option1) {
			case 1: {

				do {
					System.out.println("1.insert student record");
					System.out.println("2.view student record");
					System.out.println("3.search student by roll no");
					System.out.println("4.search student by First name");
					System.out.println("5.search student by last name");
					System.out.println("6.search student by City");
					System.out.println("7.Search Student by Gender");
					System.out.println("8.Search Student by Class and Section:");

					option2 = scan.nextInt();

					switch (option2) {

					case 1: {
						System.out.println("Number of record");
						record = scan.nextInt();

						for (int i = totalStud; i < totalStud + record; i++) {

							arr1[i] = new Student();
							arr1[i].insert();
							System.out.println("**********   ***********");

						}
						totalStud = totalStud + record;

						break;
					}
					case 2: {

						for (int i = 0; i < totalStud; i++) {

							arr1[i].display();
							System.out.println("**********   ***********");

						}
						break;
					}
					case 3: {
						System.out.println("enter the roll no");
						int IdNo = scan.nextInt();

						Student stu = new Student();
						Student foundStud = (Student) stu.searchByIdNo(arr1, IdNo, totalStud);

						if (foundStud != null) {

							foundStud.display();
							System.out.println("**********   ***********");
						} else {
							System.out.println("No record Found");
							System.out.println("**********   ***********");
						}

						break;
					}
					case 4: {
						System.out.println("enter the Student Firstname:");
						String Firstname = scan.next();
						Student stu = new Student();
						Student[] foundStud = new Student[totalStud];
						stu.searchByFirstname(arr1, Firstname, totalStud, foundStud);

						stu.displayarr(foundStud, totalStud);
						break;
					}
					case 5: {
						System.out.println("enter the Student Lastname:");
						String lastname = scan.next();
						Student stu = new Student();
						Student[] foundStud = new Student[totalStud];
						stu.searchBylastname(arr1, lastname, totalStud, foundStud);
						stu.displayarr(foundStud, totalStud);
						break;
					}

					case 6: {
						System.out.println("enter the Student City:");
						String City = scan.next();

						Student stu = new Student();
						Student[] foundStud = new Student[totalStud];
						stu.searchByCity(arr1, City, totalStud, foundStud);
						stu.displayarr(foundStud, totalStud);

						break;

					}
					case 7: {
						System.out.println("enter the Student Gender:");
						String Gender = scan.next();
						Student stu = new Student();
						Student[] foundStud = new Student[totalStud];

						stu.searchByGender(arr1, Gender, totalStud, foundStud);
						stu.displayarr(foundStud, totalStud);

						break;

					}
					case 8: {
						System.out.println("enter the Student Class:");
						int Standard = scan.nextInt();
						System.out.println("enter the Student Section:");
						char Section = scan.next().charAt(0);

						Student stu = new Student();
						Student[] foundStud = new Student[totalStud];
						stu.searchByClassSection(arr1, Standard, Section, totalStud, foundStud);
						stu.displayarr(foundStud, totalStud);
						break;
					}

					}
				} while (option2 < 9);
				break;
			}

			case 2: {
				do {
					System.out.println("1.insert Teacher  record");
					System.out.println("2.view Teacher record");
					System.out.println("3.search Teacher by Teacher Id");
					System.out.println("4.search Teacher by First name");
					System.out.println("5.search Teacher by last name");
					System.out.println("6.search Teacher by City");
					System.out.println("7.search Teacher by Gender");
					System.out.println("8.search Teacher by Standard");
					System.out.println("9.search Teacher by Subject");

					option3 = scan.nextInt();

					switch (option3) {

					case 1: {
						System.out.println("Number of record");
						record = scan.nextInt();

						for (int i = totalteac; i < totalteac + record; i++) {

							arr2[i] = new Teacher();
							arr2[i].insert();
							System.out.println("**********   ***********");
						}
						totalteac = totalteac + record;
						break;

					}
					case 2: {

						for (int i = 0; i < totalteac; i++) {

							arr2[i].display();
							System.out.println("**********   ***********");

						}
						break;
					}
					case 3: {
						System.out.println("enter the Teacher id");
						int IdNo = scan.nextInt();

						Person Teac = new Person();

						Person foundTeac = Teac.searchByIdNo(arr2, IdNo, totalteac);

						if (foundTeac != null) {
							foundTeac.display();
							System.out.println("**********   ***********");
						} else {
							System.out.println("No record found");
							System.out.println("**********   ***********");
						}
						break;
					}

					case 4: {
						System.out.println("enter the Firstname:");
						String Firstname = scan.next();
						Teacher[] foundteac = new Teacher[totalteac];
						Teacher teac = new Teacher();
						teac.searchByFirstname(arr2, Firstname, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);
						break;
					}
					case 5: {
						System.out.println("enter the last name:");
						String lastname = scan.next();

						Teacher teac = new Teacher();
						Teacher[] foundteac = new Teacher[totalteac];
						teac.searchBylastname(arr2, lastname, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);
						break;
					}

					case 6: {
						System.out.println("enter the City:");
						String City = scan.next();

						Teacher teac = new Teacher();
						Teacher[] foundteac = new Teacher[totalteac];
						teac.searchByCity(arr2, City, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);
						break;
					}
					case 7: {
						System.out.println("enter the Student Gender:");
						String Gender = scan.next();
						Teacher teac = new Teacher();
						Teacher[] foundteac = new Teacher[totalteac];

						teac.searchByGender(arr2, Gender, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);

						break;

					}
					case 8: {
						System.out.println("enter the Standard:");
						int Standard = scan.nextInt();
						System.out.println("enter the Section:");
						char section = scan.next().charAt(0);
						Teacher teac = new Teacher();
						Teacher[] foundteac = new Teacher[totalteac];
						teac.searchByStandardSection(arr2, Standard, section, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);
						break;
					}
					case 9: {
						System.out.println("enter the Subject:");
						String subject = scan.next();

						Teacher teac = new Teacher();
						Teacher[] foundteac = new Teacher[totalteac];
						teac.searchBysubject(arr2, subject, totalteac, foundteac);
						teac.displayarr(foundteac, totalteac);
						break;
					}
					default: {
						System.out.println("Invalid Number");
					}

					}
				} while (option3 < 10);
				break;
			}
			case 3: {
				System.out.println("**********   ***********");
				System.exit(0);

				break;
			}

			default: {
				System.out.println("Invalid Number");
			}
			}
		} while (option1 < 3);
	}
}
