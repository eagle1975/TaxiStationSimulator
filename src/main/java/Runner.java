import entity.*;
import service.ProcessorImpl;
import static entity.EnumCar.CarModel.*;
import static entity.EnumCar.ColorCar.*;
import static entity.EnumCar.TypeCar.*;

public class Runner {
	
	private static final String BRAND_EMPTY = "A list of cars of a given brand with EMPTYPROC:\n";
	private static final String BRAND_FILLED = "A list of cars of a given brand with FILLEDPROC:\n";
	private static final String BRAND_OPERATION_EMPTY = "A list of cars of a given brand and operation over n years with EMPTYPROC:\n";
	private static final String BRAND_OPERATION_FILLED = "A list of cars of a given brand and operation over n years with FILLEDPROC:\n";
	private static final String YEAR_PRICE_EMPTY = "A list of cars of a given year and price more then specified with EMPTYPROC:\n";
	private static final String YEAR_PRICE_FILLED = "A list of cars of a given year and price more then specified with FILLEDPROC:\n";
	
	public static void main(String[] args) {
		Car[] cars = {new PassangerImpl(1, ZAZ, SLAVUTA, 2001, GREEN.name(), 5000, 1054576, 4),
				new PassengerCar(2, ZAZ, TAVRIYA_NOVA, 2004, BLUE.name(), 4500, 1024678, 4, "Hatchback"),
				new PassengerCar(3, OPEL, VECTRA, 2009, GREEN.name(), 10000, 6787014, 4, "Hatchback"),
				new PassengerCar(4, OPEL, ASTRA, 2009, GREEN.name(), 7000, 876323, 5, "Minivan"),
				new PassengerCar(5, OPEL, INSIGNIA, 2015, YELLOW.name(), 20000, 778743, 6, "Sedan"),
				new PassengerCar(6, BMW, X3, 2014, WHITE.name(), 40000, 78634, 4, "Sedan"),
				new PassengerCar(7, BMW, X5, 2015, BLACK.name(), 60000, 67832987, 5, "Sedan"),
				new PassengerCar(8, CHEVROLET, AVEO, 2015, WHITE.name(), 8000, 6787245, 5, "Sedan"),
				new PassengerCar(9, CHEVROLET, AVEO, 2016, RED.name(), 12000, 67854, 5, "Hatchback"),
				new PassengerCar(10, SCODA, OCTAVIA, 2016, ORANGE.name(), 18500, 78965, 8, "Hatchback"),
				new PassengerCar(11, MERCEDES, BENS, 2009, RED.name(), 12250, 12097, 4, "Liftbak"),
				new PassengerCar(12, OPEL, VECTRA, 1984, BLUE.name(), 7365, 1111, 4, "Hatchback"),
				new PassengerCar(13, OPEL, VECTRA, 2009, RED.name(), 15000, 876323, 6, "Hatchback"),
				new PassengerCar(14, OPEL, INSIGNIA, 2009, BLUE.name(), 20000, 778743, 4, "Sedan"),
				new CargoTaxiCarImpl(15, RENAULT, MASKOTT, 2017, WHITE.name(), 16500, 10567, 7500),
				new CargoTaxiCarImpl(16, IVECO, DAILY, 2009, BLUE.name(), 9400, 8567, 3860),
				new Bus(17, SCANIA,    OMNIEXPRESS,   2018, GREEN.name(), 30000, 15567,  51, "tourist"),
				new Bus(18, LAZ, INTERLAZ_10LE, 2017, WHITE.name(), 25000, 13456, 45, "suburban"),
		};
		ProcessorImpl emptyProc = new ProcessorImpl();
		ProcessorImpl filledProc = new ProcessorImpl(cars);

		System.out.println(BRAND_EMPTY);
		//System.out.println(emptyProc.findCarByModel("Bmw"));
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
