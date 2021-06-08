package model;

public class Cage extends Habitat{
	private boolean disposition;
	private String dispositionStr;
	private double height;
	private int birdsQuantity;
	
	public Cage(String id, double large, double width, int typeUse, boolean disposition, double height, int birdsQuantity) {
		super(id, height, height, birdsQuantity);
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
