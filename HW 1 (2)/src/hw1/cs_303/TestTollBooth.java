package hw1.cs_303;


public class TestTollBooth {
    public static void main(String[] args) {

        Trucks dodgeTruck = new dodgeTruck(7, 13000);
        Trucks dodgeTruck2 = new dodgeTruck(10, 20000);
        Trucks truck1 = new fordTruck(5, 12000);
        Trucks truck2 = new fordTruck(5, 15000);


        TollBooths booth = new HammondTollBooth();


        System.out.println("Ford Truck 1:");
        booth.calculateToll(truck1);
        booth.truckArrival(truck1);
        booth.displayData();
        booth.receiptOfCollection();


        System.out.println("Ford Truck 2:");
        booth.calculateToll(truck2);
        booth.truckArrival(truck2);
        booth.displayData();
        booth.receiptOfCollection();

        System.out.println("/////////////////////////////////////");

        System.out.println("Dodge Truck 1:");
        booth.calculateToll(dodgeTruck);
        booth.truckArrival(dodgeTruck);
        booth.displayData();
        booth.receiptOfCollection();


        System.out.println("Dodge Truck 2:");
        booth.calculateToll(dodgeTruck2);
        booth.truckArrival(dodgeTruck2);
        booth.displayData();
        booth.receiptOfCollection();

    }
}
