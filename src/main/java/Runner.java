import entity.*;
import service.Processor;

public class Runner {
	
	static final String BRAND_EMPTY = "A list of cars of a given brand with EMPTYPROC:\n";
	static final String BRAND_FILLED = "A list of cars of a given brand with FILLEDPROC:\n";
	static final String BRAND_OPERATION_EMPTY = "A list of cars of a given brand and operation over n years with EMPTYPROC:\n";
	static final String BRAND_OPERATION_FILLED = "A list of cars of a given brand and operation over n years with FILLEDPROC:\n";
	static final String YEAR_PRICE_EMPTY = "A list of cars of a given year and price more then specified with EMPTYPROC:\n";
	static final String YEAR_PRICE_FILLED = "A list of cars of a given year and price more then specified with FILLEDPROC:\n";
	
	public static void main(String[] args) {
		ICar[] cars = {new PassangerImpl(1, CarModel.ZAZ, "Slavuta", 2001, "Green", 5000, 1054576, 4),
				new PassengerCar(2, CarModel.ZAZ, "Tavriya Nova", 2004, "Blue", 4500, 1024678, 4, "Hatchback"),
				new PassengerCar(3, CarModel.OPEL, "Vectra", 2009, "Green", 10000, 6787014, 4, "Hatchback"),
				new PassengerCar(4, CarModel.OPEL, "Astra", 2009, "Green", 7000, 876323, 5, "Minivan"),
				new PassengerCar(5, CarModel.OPEL, "insignia", 2015, "Navi", 20000, 778743, 6, "Sedan"),
				new PassengerCar(6, CarModel.BMW, "X3", 2014, "White", 40000, 78634, 4, "Sedan"),
				new PassengerCar(7, CarModel.BMW, "X5", 2015, "Black", 60000, 67832987, 5, "Sedan"),
				new PassengerCar(8, CarModel.CHEVROLET, "Aveo", 2015, "White", 8000, 6787245, 5, "Sedan"),
				new PassengerCar(9, CarModel.CHEVROLET, "Aveo", 2016, "Red", 12000, 67854, 5, "Hatchback"),
				new PassengerCar(10, CarModel.SCODA, "Octavia", 2016, "Orange", 18500, 78965, 8, "Hatchback"),
				new PassengerCar(11, CarModel.MERCEDES, "bens", 2009, "Red", 12250, 12097, 4, "Liftbak"),
				new PassengerCar(12, CarModel.OPEL, "Vectra", 1984, "blu", 7365, 1111, 4, "Hatchback"),
				new PassengerCar(13, CarModel.OPEL, "Vectra", 2009, "Red", 15000, 876323, 6, "Hatchback"),
				new PassengerCar(14, CarModel.OPEL, "insignia", 2009, "Blue", 20000, 778743, 4, "Sedan"),
				new CargoTaxiImpl(15, CarModel.RENAULT, "Maskott", 2017, "White", 16500, 10567, 7500),
				new CargoTaxiImpl(16, CarModel.IVECO, "Daily", 2009, "Blue", 9400, 8567, 3860),
				new Bus(17, CarModel.SCANIA,    "OmniExpress",   2018, "Green", 30000, 15567,  51, "tourist"),
				new Bus(18, CarModel.LAZ, "InterLAZ-10LE", 2017, "White", 25000, 13456, 45, "suburban"),
		};
		Processor emptyProc = new Processor();
		Processor filledProc = new Processor(cars);

		System.out.println(BRAND_EMPTY);
		System.out.println(emptyProc.findCarByModel("Bmw"));
		System.out.println(BRAND_FILLED);
		filledProc.findCarByModel("Bmw");
		System.out.println();

		System.out.println(BRAND_OPERATION_EMPTY);
		emptyProc.findCarByModelAndYear("OPEL", 5);
		System.out.println(BRAND_OPERATION_FILLED);
		filledProc.findCarByModelAndYear("OPEL", 5);
		System.out.println();

		System.out.println(YEAR_PRICE_EMPTY);
		emptyProc.findCarByYearAndPrice(2009, 12000);
		System.out.println(YEAR_PRICE_FILLED);
		filledProc.findCarByYearAndPrice(2009, 12000);
	}
	

}
