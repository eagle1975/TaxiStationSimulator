
class Processor {

	private Car[] carProc;
	private CarModel carModel;

	public Processor() {
		Car[] car = new Car[0];
		carProc = car;
	}

	public Processor(Car[] car) {
		this.carProc = car;
	}

	public void findeCarByModel(Car[] cars, String model) {
		for(Car car : cars) {
			carModel = car.getModel();
			if(model.equals(carModel.model)) {
				printCar(car);
			}	
		}
	}

	public void findeCarByModel(String model) {
		if (getCarProc() != null) {
			findeCarByModel(getCarProc(), model);
		}
	}

	public void findeCarByModelAndYear(Car[] cars, String model, int year) {
		for (Car car : cars) {
			carModel = car.getModel();
			if((model.equals(carModel.model)) && (year <= (2019 - car.getProductionYear()))) {
				printCar(car);
			}	
		}
	}

	public void findeCarByModelAndYear(String model, int year) {
		if (getCarProc() != null) {
			findeCarByModelAndYear(getCarProc(), model, year);
		}
	}

	void findeCarByYearAndPrice(Car[] cars, int year, int price) {
		for (Car car : cars) {
			if ((year == car.getProductionYear()) && (price < car.getPrice())) {
				printCar(car);
			}	
		}
	}

	void findeCarByYearAndPrice(int year, int price) {
		if (getCarProc() != null) {
			findeCarByYearAndPrice(getCarProc(), year, price);
		}
	}

	void printCar(Car car) {
		System.out.println(car);
	}

	public Car[] getCarProc() {
		return carProc;
	}
}

