package model;

public class PetCenter {
	private final int GUACALES_QUANTITY = 9;
	private final int COTTAGES_QUANTITY = 9;
	private final int AQUARIUMS_QUANTITY = 4;
	private final int CORRALS_QUANTITY = 4;
	private final int CAGES_QUANTITY = 4;
	
	private final double GUACAL_LARGE = 53;
	private final double GUACAL_WIDTH = 40;
	private final double GUACAL_HEIGHT= 38;
	private final double GUACAL_WEIGHT = 20;
	
	private final double COTTAGE_LARGE = 73;
	private final double COTTAGE_WIDTH = 66;
	private final int COTTAGE_TOYS = 3;
	
	private final double AQUARIUM_LARGE = 60.7;
	private final double AQUARIUM_WIDTH = 47.5;
	private final String AQUARIUM_MATERIAL = "Glass";
	
	private final double CORRAL_LARGE = 57;
	private final double CORRAL_WIDTH = 31;
	private final int CORRAL_PLANTS = 4;
	private final String CORRAL_PLANT_TYPE = "Mint";
		
	private final double CAGE_LARGE = 47;
	private final double CAGE_WIDTH = 36;
	private final double CAGE_HEIGHT = 68;
	private final int CAGE_CAPACITY = 10;
	
	
	private Guacal[] guacals;
	private Cottage[] cottages;
	private Aquarium[] aquariums;
	private Corral[] corrals;
	private Cage[] cages;
	
	public PetCenter() {
		guacals = new Guacal[GUACALES_QUANTITY];
		cottages = new Cottage[COTTAGES_QUANTITY];
		aquariums = new Aquarium[AQUARIUMS_QUANTITY];
		corrals = new Corral[CORRALS_QUANTITY];
		cages = new Cage[CAGES_QUANTITY];
		
		createHabitats();
	}
	
	public void createHabitats() {
		for (int i = 0; i < guacals.length; i++) {
			String id = "C" + (i+1);
			
			guacals[i] = new Guacal(id,GUACAL_LARGE,GUACAL_WIDTH,1,GUACAL_HEIGHT,GUACAL_WEIGHT);
		}
		
		for (int i = 0; i < cottages.length; i++) {
			String id = "D" + (i+1);
			
			cottages[i] = new Cottage(id,COTTAGE_LARGE,COTTAGE_WIDTH,1,COTTAGE_TOYS);
		}
		
		for (int i = 0; i < aquariums.length; i++) {
			String id = "R" + (i+1);
			boolean type = false;
			
			if(i > 1) {
				type = true;
			}
			
			aquariums[i] = new Aquarium(id, AQUARIUM_LARGE, AQUARIUM_WIDTH, 1, type, AQUARIUM_MATERIAL);
		}
		
		for (int i = 0; i < corrals.length; i++) {
			String id = "RA" + (i+1);
			
			corrals[i] = new Corral(id,CORRAL_LARGE,CORRAL_WIDTH,1,CORRAL_PLANTS,CORRAL_PLANT_TYPE);
		}
		
		for (int i = 0; i < cages.length; i++) {
			String id = "B" + (i+1);
			boolean disposition = false;
			
			if(i > 1) {
				disposition = true;
			}
			
			cages[i] = new Cage(id,CAGE_LARGE,CAGE_WIDTH,1,disposition,CAGE_HEIGHT,CAGE_CAPACITY);
		}
	}
	
	public void addPet(String id, String oname, String tlf, String direction, String specie,String name, int age, String symptoms) {
		Owner o = new Owner(id,oname,tlf,direction);
		Pet p = new Pet(specie,name,age, symptoms, o);
		
		if(p.getSpecie().equalsIgnoreCase("dog")) {
			for(int i = 0; i < cottages.length; i++) {
				if(cottages[i] == null) {
					cottages[i].setPet(p);
					cottages[i].setState(false);
					i = cottages.length;
				}
			}
		}
		
		else if(p.getSpecie().equalsIgnoreCase("cat")) {
			for (int i = 0; i < guacals.length; i++) {
				if(guacals[i] == null) {
					guacals[i].setPet(p);
					guacals[i].setState(false);
					i = guacals.length;
				}
			}
		}
		
		else if(p.getSpecie().equalsIgnoreCase("reptile")) {
			for (int i = 0; i < aquariums.length; i++) {
				if(aquariums[i] == null) {
					aquariums[i].setPet(p);
					aquariums[i].setState(false);
					i = aquariums.length;
				}
			}
		}

		else if(p.getSpecie().equalsIgnoreCase("rabbit")) {
			for (int i = 0; i < corrals.length; i++) {
				if(corrals[i] == null) {
					corrals[i].setPet(p);
					corrals[i].setState(false);
					i = corrals.length;
				}
			}
		}

		else if(p.getSpecie().equalsIgnoreCase("bird")) {
			for (int i = 0; i < cages.length; i++) {
				if(cages[i] == null) {
					cages[i].setPet(p);
					cages[i].setState(false);
					i = cages.length;
				}
			}
		}
	}
	
	public Pet findPet(String pn) {
		Pet p = null;
		boolean found = false;
		
		for(int i = 0; i < guacals.length || !found; i++) {
			if(guacals[i].getPet().getName().equalsIgnoreCase(pn)) {
				p = guacals[i].getPet();
				found = true;
			}else if(cottages[i].getPet().getName().equalsIgnoreCase(pn)) {
				p = cottages[i].getPet();
				found = true;
			}else if(aquariums[i].getPet().getName().equalsIgnoreCase(pn)) {
				p = aquariums[i].getPet();
				found = true;
			}else if(corrals[i].getPet().getName().equalsIgnoreCase(pn)) {
				p = corrals[i].getPet();
				found = true;
			}else if(cages[i].getPet().getName().equalsIgnoreCase(pn)) {
				p = cages[i].getPet();
				found = true;
			}
		}
		
		return p;
	}
	
	public Object findHabitat(String id) {
		Object h = null;
		boolean found = false;
		
		if(!found) {
			for(int i = 0; i < guacals.length; i++) {
				if(guacals[i].getId().equalsIgnoreCase(id)) {
					h = guacals[i];
					found = true;
				}else {
					found = false;
				}
			}
			
		}
		
		if(!found) {
			for(int i = 0; i < cottages.length; i++) {
				if(cottages[i].getId().equalsIgnoreCase(id)) {
					h = cottages[i];
					found = true;
				}else {
					found = false;
				}
			}	
		}
			
		if(!found) {
			for(int i = 0; i < aquariums.length; i++) {
				if(aquariums[i].getId().equalsIgnoreCase(id)) {
					h = aquariums[i];
					found = true;
				}else {
					found = false;
				}
			}

		}
				
		if(!found) {
			for(int i = 0; i < corrals.length; i++) {
				if(corrals[i].getId().equalsIgnoreCase(id)) {
					h = corrals[i];
					found = true;
				}else {
					found = false;
				}
			}
		}
		
		if(!found) {
			for(int i = 0; i < cages.length; i++) {
				if(cages[i].getId().equalsIgnoreCase(id)) {
					h = cages[i];
					found = true;
				}else {
					found = false;
				}
			}	
		}
		
		return h;
	}
}
