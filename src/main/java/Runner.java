import entity.Car;
import entity.impl.Bus;
import entity.impl.PassengerCar;
import entity.impl.Truck;
import service.impl.ProcessorImpl;

import java.util.Arrays;

import static entity.enums.Color.*;
import static entity.enums.Model.*;

public class Runner {

    private static final String BRAND_EMPTY = "A list of cars of a given brand with EMPTYPROC:\n";
    private static final String BRAND_FILLED = "A list of cars of a given brand with FILLEDPROC:\n";
    private static final String BRAND_OPERATION_EMPTY = "A list of cars of a given brand and operation over n years with EMPTYPROC:\n";
    private static final String BRAND_OPERATION_FILLED = "A list of cars of a given brand and operation over n years with FILLEDPROC:\n";
    private static final String YEAR_PRICE_EMPTY = "A list of cars of a given year and price more then specified with EMPTYPROC:\n";
    private static final String YEAR_PRICE_FILLED = "A list of cars of a given year and price more then specified with FILLEDPROC:\n";

    public static void main(String[] args) {
        Car[] cars = {
                new PassengerCar(ZAZ, "SLAVUTA", 2001, GREEN, 5000, 1054576, 4, "Sedan"),
                new PassengerCar(ZAZ, "TAVRIYA_NOVA", 2004, BLUE, 4500, 1024678, 4, "Hatchback"),
                new PassengerCar(OPEL, "VECTRA", 2009, GREEN, 10000, 6787014, 4, "Hatchback"),
                new PassengerCar(OPEL, "ASTRA", 2009, GREEN, 7000, 876323, 5, "Minivan"),
                new PassengerCar(OPEL, "INSIGNIA", 2015, YELLOW, 20000, 778743, 6, "Sedan"),
                new PassengerCar(BMW, "X3", 2014, WHITE, 40000, 78634, 4, "Sedan"),
                new PassengerCar(BMW, "X5", 2015, BLACK, 60000, 67832987, 5, "Sedan"),
                new PassengerCar(CHEVROLET, "AVEO", 2015, WHITE, 8000, 6787245, 5, "Sedan"),
                new PassengerCar(CHEVROLET, "AVEO", 2016, RED, 12000, 67854, 5, "Hatchback"),
                new PassengerCar(SKODA, "OCTAVIA", 2016, ORANGE, 18500, 78965, 8, "Hatchback"),
                new PassengerCar(MERCEDES, "BENS", 2009, RED, 12250, 12097, 4, "Liftbak"),
                new PassengerCar(OPEL, "VECTRA", 1984, BLUE, 7365, 1111, 4, "Hatchback"),
                new PassengerCar(OPEL, "VECTRA", 2009, RED, 15000, 876323, 6, "Hatchback"),
                new PassengerCar(OPEL, "INSIGNIA", 2009, BLUE, 20000, 778743, 4, "Sedan"),
                new Truck( RENAULT, "MASKOTT", 2017, WHITE, 16500, 10567, 7500),
                new Truck(IVECO, "DAILY", 2009, BLUE, 9400, 8567, 3860),
                new Bus(SCANIA, "OMNIEXPRESS", 2018, GREEN, 30000, 15567, 51, "tourist"),
                new Bus(LAZ, "INTERLAZ_10LE", 2017, WHITE, 25000, 13456, 45, "suburban"),
        };
        ProcessorImpl emptyProc = new ProcessorImpl();
        ProcessorImpl filledProc = new ProcessorImpl(cars);

        System.out.println(BRAND_EMPTY);
        //System.out.println(emptyProc.findCarByModel("Bmw"));
        System.out.println(BRAND_FILLED);

        System.out.println(filledProc.findCarByModel("Bmw"));

        System.out.println(BRAND_OPERATION_EMPTY);
        Arrays.stream(emptyProc.findCarByModelAndYear("OPEL", 5)).forEach(System.out::println);

        System.out.println(YEAR_PRICE_EMPTY);
        emptyProc.findCarByYearAndPrice(2009, 12000);
        System.out.println(YEAR_PRICE_FILLED);
        filledProc.findCarByYearAndPrice(2009, 12000);
    }
}
