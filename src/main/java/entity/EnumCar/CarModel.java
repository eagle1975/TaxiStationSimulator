package entity.EnumCar;

public enum CarModel {
	ZAZ("Zaz"),
	OPEL("Opel"),
	BMW("Bmw"),
	CHEVROLET("Chevrolet"),
	SCODA("Scoda"),
	MERCEDES("Merсedes"),
	RENAULT("Renault"),
	IVECO("Iveco"),
	LAZ("Laz"),
	SCANIA("Scania");

	private String model;
	
	CarModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
