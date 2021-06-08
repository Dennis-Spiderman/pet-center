package model;

public class Cottage extends Habitat{
	private int toys;

	public Cottage(int id, double large, double width, int typeUse, int toys) {
		super(id, large, width, typeUse);
		this.toys = toys;
	}

	public int getToys() {
		return toys;
	}

	public void setToys(int toys) {
		this.toys = toys;
	}
}
