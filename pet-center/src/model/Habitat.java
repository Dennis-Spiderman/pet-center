package model;

public class Habitat {
	private int id;
	private double large;
	private double width;
	private int typeUse;
	private String typeUseStr;
	private boolean state;
	private String stateStr;
	
	public Habitat(int id, double large, double width, int typeUse) {
		super();
		this.id = id;
		this.large = large;
		this.width = width;
		this.typeUse = typeUse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLarge() {
		return large;
	}

	public void setLarge(double large) {
		this.large = large;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getTypeUse() {
		return typeUse;
	}
	
	public String getTypeUseStr() {
		switch (typeUse) {
		case 1:
			typeUseStr = "Empty";
			break;

		case 2:
			typeUseStr = "Ocuppied-healthy";
			break;
			
		case 3:
			typeUseStr = "Ocuppied-sick";
			break;
		}
		
		return typeUseStr;
	}
	
	public void setTypeUse(int typeUse) {
		this.typeUse = typeUse;
	}
	
	public String getState() {
		if(state) {
			stateStr = "Ocuppied";
		}else {
			stateStr = "Empty";
		}
		
		return stateStr;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
}
