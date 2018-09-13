public class HammondTollBooth implements TollBooths {

    /**
     * Total amount of toll that trucks have paid as they came to the tollbooth
     */
    private int totalToll = 0;

    /**
     * The toll that trucks have to pay as they came to the tollbooth
     */
    private int tollDue = 0;


    /**
     * The total number of trucks that comes by the tollbooth
     */
    private int truckCounter = 0;




    /**
     * When the cash drawer is removed from its cradle, the receipt is displayed on the screen.
     * with the total tollbooth toll and number of trucks that came to the tollbooth and resets
     * total receipts and and number of trucks that came by the tollbooth
     */
    @Override
    public void receiptOfCollection() {

        System.out.println("*** Collecting receipts ***");
        displayData();
        resetData();


    }

    /**
     * Displays the tollbooth toll total and count of trucks that have come to the tollbooth
     */
    @Override
    public void displayData() {

        System.out.println("Totals since last collection - Receipts: $" + totalToll + " Trucks: " + truckCounter);
    }


    /**
     * When a truck arrives at the booth, the agent scans a barcode on the windshield of the
     * truck; it contains information about the truck, including its number of axles. The weight of the
     * truck is obtained by scanning a barcode contained on the list of good presented by the driver.
     */
    @Override
    public void truckArrival(Trucks truckType) {
        System.out.println("Truck arrival - Axles: " + truckType.getAxles() + " Total weight: " + truckType.getWeight() + " Toll due: " + tollDue);
    }


    /**
     * Calculates the total number of trucks that comes by the tollbooth
     */
    @Override
    public void incrementTruckCount() {

        truckCounter++;
    }

    /**
     * Calculates the tollbooth's toll based on each truck's number of axles and weight
     * Calculates the tollbooth's total toll based on each truck's number of axles and weight
     */
    @Override
    public void calculateToll(Trucks truckType) {
        int kgInTon = 1000;
        int tollPerAxel = 5;
        int tollPerTon = 10;

        tollDue = (((truckType.getWeight() / kgInTon) * tollPerTon) + (truckType.getAxles() * tollPerAxel));


        totalToll = tollDue + totalToll;
        incrementTruckCount();

    }

    /**
     * Resets the total tollbooth toll and number of trucks that came by the tollbooth
     * when the cash drawer is removed from its cradle.
     */
    @Override
    public void resetData() {
        totalToll = 0;
        truckCounter = 0;

    }
}
