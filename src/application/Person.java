package application;

public class Person {
	private int id = 0;
	private String name;
	private String street;
	private String city;
	private char gender;
	private int zip;
	public Person() {}
	
	public Person(int id,String name,String street,String city,char gender,int zip) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.gender = gender;
		this.zip = zip;
	}
	
	public  int getId() {
		
		return this.id;
		
	}
	public String getName() {
		return this.name;
	}
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public char getGender() {
		return this.gender;
	}
	public int getZip() {
		
		return this.zip;
		
	}
	public void setId(int id) {
		
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	



}
