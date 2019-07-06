
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

	public void findCarByModel(Car[] cars, String model) {
		for(Car car : cars) {
			carModel = car.getModel();
			if(model.equalsIgnoreCase(carModel.model)) {
				printCar(car);
			}	
		}
	}

	public void findCarByModel(String model) {
		findCarByModel(getCarProc(), model);
	}

	public void findCarByModelAndYear(Car[] cars, String model, int year) {
		for (Car car : cars) {
			carModel = car.getModel();
			if((model.equalsIgnoreCase(carModel.model)) && (year <= (2019 - car.getProductionYear()))) {
				printCar(car);
			}	
		}
	}

	public void findCarByModelAndYear(String model, int year) {
		findCarByModelAndYear(getCarProc(), model, year);
	}

	void findCarByYearAndPrice(Car[] cars, int year, int price) {
		for (Car car : cars) {
			if ((year == car.getProductionYear()) && (price < car.getPrice())) {
				printCar(car);
			}	
		}
	}

	void findCarByYearAndPrice(int year, int price) {
		if (getCarProc() != null) {
			findCarByYearAndPrice(getCarProc(), year, price);
		}
	}

	void printCar(Car car) {
		System.out.println(car);
	}

	public Car[] getCarProc() {
		return carProc;
	}
}

