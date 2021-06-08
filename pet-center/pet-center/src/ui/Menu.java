package ui;

import java.util.Scanner;

import model.PetCenter;

public class Menu {
	private Scanner in;
	private PetCenter p;
	
	public Menu() {
		in = new Scanner(System.in);
		p = new PetCenter();
		
	}
	
	public void start() {		
		System.out.println("Hello!!!\n");
		
		menu();
	}
	
	public void menu() {
		System.out.println("What do you wannna do?\n");
		System.out.println("1) Go to emergency service.\n2) Go to daycare-hospitalization service.\n");
		int select = Integer.parseInt(in.nextLine());
		
		switch (select) {
		case 1:
			System.out.println("Going to emergency service...\n");
			emergencyService();
			break;
			
		case 2:
			System.out.println("Going to daycare-hospitalization...\n");
			daycareHospitalization();
			break;
			
		default:
			System.out.println("Your selection is unavailable. Try again.\n");
			menu();
			break;
		}
		
	}
	
	public void emergencyService() {
		System.out.println("--------------------You are in the emergency service--------------------"
				+ "What do you want to do?");
		System.out.println("1) Hospitalize a pet.\n2) .");
		
		int select = Integer.parseInt(in.nextLine());
		
		switch (select) {
		case 1:
			System.out.println("Going to hospitalize a pet service...\n");
			emergencyHospitalize();
			break;

		default:
			System.out.println("Your selection is unavailable. Try again.\n");
			System.out.println("Going to emergency service...\n");
			emergencyService();
			
			break;
		}
	}
	
	public void emergencyHospitalize() {
		System.out.println("--------------------You are in the hospitalize a pet service--------------------");
	}
	
	public void daycareHospitalization() {
		System.out.println("--------------------You are in the daycare-hospitalization service--------------------"
				+ "\nWhat do you want to do?");
		
		System.out.println("1) Register a pet.\n2) Find a pet.\n3) See the daycare map.\n4) Find a habitat.\n"
				+ "5) See the statistics.\n6) Back to main menu.\n");

		int select = Integer.parseInt(in.nextLine());
		
		switch (select) {
		case 1:
			System.out.println("Going to the register pet service...");
			daycareRegisterPet();
			break;
		
		case 2:
			System.out.println("Going to the find pet service...");
			daycareFindPet();
			break;
			
		case 3:
			System.out.println("Going to the see map service...");
			daycareSeeMap();
			break;
			
		case 4:
			System.out.println("Going to the find habitat service...");
			daycareFindHabitat();
			break;
		
		case 5:
			System.out.println("Going to the see statistics service...");
			daycareSeeStatistics();
			break;
		
		case 6:
			menu();
			break;
		
		default:
			System.out.println("Your selection is unavailable. Try again.\n");
			daycareHospitalization();
			break;
		}
	}
	
	public void daycareRegisterPet() {
		System.out.println("--------------------You are in the register pet service--------------------");
		System.out.println("Type the follow information.\nPet's name:");
		String petName = in.nextLine();
		
		boolean validSpecie = false;
		String specie = "";
		
		while(!validSpecie) {
			System.out.println("Pet species:");
			System.out.println("1) Dog.\n2) Cat.\n3) Reptile.\n4) Rabbit.\n5) Bird.");
			int spSelec = Integer.parseInt(in.nextLine());
			
			switch (spSelec) {
			case 1:
				specie = "Dog";
				validSpecie = true;
				break;

			case 2:
				specie = "Cat";
				validSpecie = true;
				break;
				
			case 3:
				specie = "Reptile";
				validSpecie = true;
				break;
				
			case 4:
				specie = "Rabbit";
				validSpecie = true;
				break;
				
			case 5:
				specie = "Bird";
				validSpecie = true;
				break;
				
			default:
				System.out.println("Your selection is unavailable. Try again.\n");
				validSpecie = false;
				break;
			}
		}
		
		/*if(specie.equalsIgnoreCase("dog") || specie.equalsIgnoreCase("cat")) {
			System.out.println("Pet breed:");
			String race = in.nextLine();
		}*/
		
		System.out.println("Pet's age:");
		int age = Integer.parseInt(in.nextLine());
		
		System.out.println("Pet's symptoms:");
		String symptoms = in.nextLine();
		
		System.out.println("Owner id:");
		String id = in.nextLine();
		
		System.out.println("Owner name:");
		String ownerName = in.nextLine();
		
		System.out.println("Owner phone number:");
		String tlf = in.nextLine();
		
		System.out.println("Owner direction:");
		String direction = in.nextLine();
		
		p.addPet(id, ownerName, tlf, direction, specie, petName, age, symptoms);
		
		System.out.println("Pet added");
		
		menu();
	}
	
	public void daycareFindPet() {
		System.out.println("--------------------You are in the find pet service--------------------");
		System.out.println("Write the name of the pet you wanna find:");
		String pn = in.nextLine();
		
		System.out.println(p.findPet(pn));
		
		menu();
	}
	
	public void daycareSeeMap() {
		System.out.println("--------------------You are in the see map service--------------------");
		
		menu();
	}
	
	public void daycareFindHabitat() {
		System.out.println("--------------------You are in the find habitat service--------------------");
		System.out.println("Write the id of the habitat you wanna find:");
		String id = in.nextLine();
		
		System.out.println(p.findHabitat(id));
		
		menu();
	}
	
	public void daycareSeeStatistics() {
		System.out.println("--------------------You are in the see statistics service--------------------");
	
		menu();
	}	
}
