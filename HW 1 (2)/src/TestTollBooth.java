public class TestTollBooth {
    public static void main(String [] args){

        //Truck truck1 = new fordTruck(5,12000);
        //Truck dodgeTruck = new dodgeTruck(5,12000);
        Trucks dodgeTruck = new dodgeTruck(7,13000);
        Trucks truck1 = new fordTruck(5,12000);
        Trucks truck2 = new fordTruck(5,15000);


        System.out.println("Axles 1- "+truck1.getAxles());
        System.out.println("Weight 2- "+truck1.getWeight());
        //System.out.println("Weight 2- "+dodgeTruck.getWeight());

       //System.out.println("TOTAL Axles 1- "+truck1.getTotalAxles());
        //System.out.println("total Weight 2- "+dodgeTruck.getTotalWeight());

        //double x;

        //tollBooth booth = new HammondTollBooth();

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

        System.out.println("dodge Axles 1- "+dodgeTruck.getAxles());
        System.out.println("dodge hWeight 2- "+dodgeTruck.getWeight());

        //System.out.println("dodge calc toll: " + booth.calculateToll(dodgeTruck));
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
