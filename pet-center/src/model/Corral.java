package model;

public class Corral extends Habitat{
	private int plants;
	private String plantType;
	
	public Corral(int id, double large, double width, int typeUse, int plants, String plantType) {
		super(id, large, width, typeUse);
		this.plants = plants;
		this.plantType = plantType;
	}

	public int getPlants() {
		return plants;
	}

	public void setPlants(int plants) {
		this.plants = plants;
	}

	public String getPlantType() {
		return plantType;
	}

	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}
}
