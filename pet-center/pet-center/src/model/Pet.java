package model;

public class Pet {
	private String specie;
	private String name;
	private int age;
	private String race;
	private String symptoms;
	private Owner owner;
	
	public Pet(String specie,String name, int age, String symptoms, Owner owner) {
		super();
		this.specie = specie;
		this.name = name;
		this.age = age;
		this.symptoms = symptoms;
		this.owner = owner;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public String getInfo() {
		String info = "";
		
		info += "Specie: " + specie + "\nName: " + name + "\nAge: " + age + "\nSymptoms: " 
				+ symptoms + "\n---Owner info---" + owner.getInfo();
		
		return info;
	}
}
