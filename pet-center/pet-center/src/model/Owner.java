package model;

public class Owner {
	private String id;
	private String name;
	private String tlf;
	private String direction;
	
	public Owner(String id, String name, String tlf, String direction) {
		super();
		this.id = id;
		this.name = name;
		this.tlf = tlf;
		this.direction = direction;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String getInfo() {
		String info;
		
		info = "ID: " + id + "\nName: " + name + "\nTlf: " + tlf + "\nDirection: " + direction;
		
		return info;		
	}
}
