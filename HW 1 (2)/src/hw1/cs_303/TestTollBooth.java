package hw1.cs_303;

import hw1.cs_303.HammondTollBooth;
import hw1.cs_303.dodgeTruck;
import hw1.cs_303.fordTruck;

public class TestTollBooth {
    public static void main(String[] args) {

        //Truck truck1 = new hw1.cs_303.fordTruck(5,12000);
        //Truck hw1.cs_303.dodgeTruck = new hw1.cs_303.dodgeTruck(5,12000);
        Trucks dodgeTruck = new dodgeTruck(7, 13000);
        Trucks truck1 = new fordTruck(5, 12000);
        Trucks truck2 = new fordTruck(5, 15000);


        System.out.println("Axles 1- " + truck1.getAxles());
        System.out.println("Weight 2- " + truck1.getWeight());
        //System.out.println("Weight 2- "+hw1.cs_303.dodgeTruck.getWeight());

        //System.out.println("TOTAL Axles 1- "+truck1.getTotalAxles());
        //System.out.println("total Weight 2- "+hw1.cs_303.dodgeTruck.getTotalWeight());

        //double x;

        //tollBooth booth = new hw1.cs_303.HammondTollBooth();

        TollBooths booth = new HammondTollBooth();
        //System.out.println("calc toll: " + booth.calculateToll(truck1));
        booth.calculateToll(truck1);
        booth.calculateToll(truck2);
        //booth.truckArrival();

        booth.truckArrival(truck1);
        booth.truckArrival(truck2);
        booth.displayData();
        System.out.println("rgdhhh");
        booth.receiptOfCollection();
        booth.receiptOfCollection();

        System.out.println("/////////////////////////////////////");

        System.out.println("dodge Axles 1- " + dodgeTruck.getAxles());
        System.out.println("dodge hWeight 2- " + dodgeTruck.getWeight());

        //System.out.println("dodge calc toll: " + booth.calculateToll(hw1.cs_303.dodgeTruck));
        booth.calculateToll(dodgeTruck);
        //booth.truckArrival();

        booth.truckArrival(dodgeTruck);
        booth.displayData();
        System.out.println("/////////////////////////////////");
        booth.receiptOfCollection();


        //booth.displayData();
        //booth.receiptOfCollection();


        //booth.displayReceipt();
        //booth.calculateToll(truck1);
        //booth.displayReceipt();


    }
}
