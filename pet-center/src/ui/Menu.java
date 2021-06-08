package ui;

import java.util.Scanner;

public class Menu {
	private Scanner in;
	
	public Menu() {
		in = new Scanner(System.in);
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
				+ "What do you want to do?");
		
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
	}
	
	public void daycareFindPet() {
		System.out.println("--------------------You are in the find pet service--------------------");
	}
	
	public void daycareSeeMap() {
		System.out.println("--------------------You are in the see map service--------------------");
	}
	
	public void daycareFindHabitat() {
		System.out.println("--------------------You are in the find habitat service--------------------");
	}
	
	public void daycareSeeStatistics() {
		System.out.println("--------------------You are in the see statistics service--------------------");
	}	
}
