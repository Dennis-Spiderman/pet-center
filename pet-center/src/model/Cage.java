package model;

public class Cage {
	private boolean disposition;
	private String dispositionStr;
	private double height;
	private int birdsQuantity;
	
	public Cage(boolean disposition, double height, int birdsQuantity) {
		super();
		this.disposition = disposition;
		this.height = height;
		this.birdsQuantity = birdsQuantity;
	}

	public boolean getDisposition() {
		return disposition;
	}
	
	public String getDispositionStr() {
		if(disposition) {
			dispositionStr = "Hung up";
		}else {
			dispositionStr = "On land";
		}
		
		return dispositionStr;
	}

	public void setDisposition(boolean disposition) {
		this.disposition = disposition;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getBirdsQuantity() {
		return birdsQuantity;
	}

	public void setBirdsQuantity(int birdsQuantity) {
		this.birdsQuantity = birdsQuantity;
	}
}
