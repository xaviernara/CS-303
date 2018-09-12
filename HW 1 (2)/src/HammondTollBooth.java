
//public class HammondTollBooth extends tollBooth {
public class HammondTollBooth implements TollBooths {


    //private String receipts = "";

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


    //int axles = 0;
    //int weight = 0;

    //Truck truckInfo;

    //TruckType truckType;


    /**
     * When the cash drawer is removed from its cradle, the receipt is displayed on the screen.
     * with the total tollbooth toll and number of trucks that came to the tollbooth and resets
     * total receipts and and number of trucks that came by the tollbooth
     */
    @Override
    public void receiptOfCollection() {
        //System.out.println("Axles: "+axles+" Total weight: "+ weight+" Toll due: "+tollDue);
        //System.out.println("Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getTotalWeight() + " Toll due: " + tollDue);
        //String receiptOfCollection = "Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getWeight() + " Toll due: " + tollDue;
        //System.out.println("Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getWeight() + " Toll due: " + tollDue);

        System.out.println("*** Collecting receipts ***");
        displayData();
        resetData();

        //String receiptOfCollection = displayData();
        //String receiptOfCollection = "Truck arrival - Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getWeight() + " Toll due: " + tollDue;
        //return receiptOfCollection;

    }

    /**
     * Displays the tollbooth toll total and count of trucks that have come to the tollbooth
     */
    @Override
    //public String displayData() {
    public void displayData() {

        //receipts += "Totals since last collection - Receipts: $" + totalToll + " Trucks: " + truckCounter;
        //System.out.println(receipts);
        //return receipts;
        System.out.println("Totals since last collection - Receipts: $" + totalToll + " Trucks: " + truckCounter);
    }


    /**
     * When a truck arrives at the booth, the agent scans a barcode on the windshield of the
     * truck; it contains information about the truck, including its number of axles. The weight of the
     * truck is obtained by scanning a barcode contained on the list of good presented by the driver.
     */
    @Override
    public void truckArrival(Trucks truckType) {
        //System.out.println("Axles: "+truckInfo.getTotalAxles()+" Total weight: "+ truckInfo.getTotalWeight()+" Toll due: "+tollDue);
        //System.out.println("Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getWeight() + " Toll due: " + tollDue);
        //System.out.println("Truck arrival - Axles: " + truckInfo.getAxles() + " Total weight: " + truckInfo.getWeight() + " Toll due: " + tollDue);

        //System.out.println("Truck arrival - Axles: " + truckType.getAxles());
        //System.out.println(" Total weight: " + truckType.getWeight());
        //System.out.println(" Toll due: " + tollDue);
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
    //public double calculateToll(int scannedAxles, int scannedWeight) {
    //public void calculateToll() {
    //public double calculateToll() {
    public void calculateToll(Trucks truckType) {
        //scannedAxles = truckInfo.getAxles();
        //scannedWeight = truckInfo.getWeight();

        //tollDue = Math.floor(((scannedWeight/kgInTon) * tollPerTon ) + (scannedAxles * tollPerAxel));
        //tollDue = Math.floor(((truckInfo.getWeight() / kgInTon) * tollPerTon) + (truckInfo.getAxles() * tollPerAxel));
        //tollDue = ((truckInfo.getWeight() / kgInTon) * tollPerTon) + (truckInfo.getAxles() * tollPerAxel);

        int kgInTon = 1000;
        int tollPerAxel = 5;
        int tollPerTon = 10;

        tollDue = (((truckType.getWeight() / kgInTon) * tollPerTon) + (truckType.getAxles() * tollPerAxel));

        //truckArrival();

        totalToll = tollDue + totalToll;
        incrementTruckCount();

        //return tollDue;
    }

    /**
     * Resets the total tollbooth toll and number of trucks that came by the tollbooth
     * when the cash drawer is removed from its cradle.
     */
    @Override
    public void resetData() {
        totalToll = 0;
        truckCounter = 0;

        //axles = truckInfo.getTotalAxles();
        //axles = truckType.getTotalAxles();
        //axles = 0;

        //weight = truckInfo.getTotalWeight();
        //weight = truckType.getTotalWeight();
        //weight = 0;

    }
}
