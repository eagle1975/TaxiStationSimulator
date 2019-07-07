import entity.Car;
import entity.CarModel;
import service.Processor;


public class Runner {
	
	static final String BRAND_EMPTY = "A list of cars of a given brand with EMPTYPROC:\n";
	static final String BRAND_FILLED = "A list of cars of a given brand with FILLEDPROC:\n";
	static final String BRAND_OPERATION_EMPTY = "A list of cars of a given brand and operation over n years with EMPTYPROC:\n";
	static final String BRAND_OPERATION_FILLED = "A list of cars of a given brand and operation over n years with FILLEDPROC:\n";
	static final String YEAR_PRICE_EMPTY = "A list of cars of a given year and price more then specified with EMPTYPROC:\n";
	static final String YEAR_PRICE_FILLED = "A list of cars of a given year and price more then specified with FILLEDPROC:\n";
	
	public static void main(String[] args) {
		Car[] cars = { new Car(1,  CarModel.ZAZ,       "Slavuta",      2001, "Green", 5000,     1054576),
				new Car(2,  CarModel.ZAZ,       "Tavriya Nova", 2004, "Blue",  4500,     1024678),
				new Car(3,  CarModel.OPEL,      "Vectra",       1998, "Green", 10000,    6787014),
				new Car(4,  CarModel.OPEL,      "Astra",        2009, "Green", 7000,     876323),
				new Car(5,  CarModel.OPEL,      "insignia",     2015, "Navi",  20000,    778743),
				new Car(6,  CarModel.BMW,       "X3",           2014, "White", 40000,    78634),
				new Car(7,  CarModel.BMW,       "X5",           2015, "Black", 60000,    67832987),
				new Car(8,  CarModel.CHEVROLET, "Aveo",         2015, "White", 8000,     6787245),
				new Car(9,  CarModel.CHEVROLET, "Aveo",         2016, "Red",   12000,    67854),
				new Car(10, CarModel.SCODA,     "Octavia",      2016, "Orange", 18500,    78965),
				new Car(11, CarModel.MERCEDES,  "bens",         2009, "Red",   12250,    12097),
				new Car(12, CarModel.OPEL,      "Vectra",       1984, "blu",   7365,     1111),
				new Car(13, CarModel.OPEL,      "Vectra",       2009, "Red",   15000,    876323),
				new Car(14, CarModel.OPEL,      "insignia",     2009, "Blue",  20000,    778743)};

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
