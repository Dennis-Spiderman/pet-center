package model;

public class Aquarium extends Habitat{
	private boolean type;
	private String typeStr;
	private String material;
	
	public Aquarium(String id, double large, double width, int typeUse, boolean type, String material) {
		super(id, large, width, typeUse);
		this.type = type;
		this.material = material;
	}

	public boolean getType() {
		return type;
	}
	
	public String getTypeStr() {
		if(type) {
			typeStr = "Amphibian";
		}else {
			typeStr = "Only land";
		}
		
		return typeStr;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String getInfo() {
		String info;
		
		info = "Type: " + typeStr +"\nMaterial: " + material;
		
		return info;
	}	
}
