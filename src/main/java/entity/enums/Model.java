package entity.enums;

public enum Model {
	ZAZ("Zaz"),
	OPEL("Opel"),
	BMW("Bmw"),
	CHEVROLET("Chevrolet"),
	SKODA("Skoda"),
	MERCEDES("Merсedes"),
	RENAULT("Renault"),
	IVECO("Iveco"),
	LAZ("Laz"),
	SCANIA("Scania");

	private String model;
	
	Model(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
