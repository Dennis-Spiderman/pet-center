package model;

public class Guacal extends Habitat{
	private double height;
	private double weight;
	
	public Guacal(int id, double large, double width, int typeUse, double height, double weight) {
		super(id, large, width, typeUse);
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
