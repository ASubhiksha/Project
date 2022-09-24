package entity;

public interface PersonOperation {

	public void insert();

	public void display();

	public Person searchByIdNo(Person[] arr3, int IdNo, int totalStud);

	public void searchByFirstname(Person[] arr3, String Firstname, int totalStud, Person[] returnarr);

	public void searchBylastname(Person[] arr3, String lastname, int totalStud, Person[] returnarr);

	public void searchByCity(Person[] arr3, String City, int totalStud, Person[] returnarr);

	public void searchByGender(Person[] arr3, String Gender, int totalcount, Person[] returnarr);
}
