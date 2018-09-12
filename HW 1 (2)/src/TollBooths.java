public interface TollBooths {

    /**
     * When the cash drawer is removed from its cradle, the receipt is displayed on the screen.
     * with the total tollbooth toll and number of trucks that came to the tollbooth and resets
     * total receipts and and number of trucks that came by the tollbooth
     */
    void receiptOfCollection();

    /**
     * Displays the tollbooth toll total and count of trucks that have come to the tollbooth
     *
     * @return The booths toll total and count of trucks that have come to the tollbooth
     */
    //String displayData();
    void displayData();

    /**
     * When a truck arrives at the booth, the agent scans a barcode on the windshield of the
     * truck; it contains information about the truck, including its number of axles. The weight of the
     * truck is obtained by scanning a barcode contained on the list of good presented by the driver.
     */
    void truckArrival(Trucks truckType);

    /**
     * Calculates the total number of trucks that comes by the tollbooth
     */
    void incrementTruckCount();

    /**
     * Calculates the tollbooth's toll based on each truck's number of axles and weight
     * Calculates the tollbooth's total toll based on each truck's number of axles and weight
     *
     * @return The tollbooths toll total that was calculated after each truck has come to the tollbooth
     */

    //public double calculateToll(int scannedAxles, int scannedWeight) {
    //public void calculateToll() {
    void calculateToll(Trucks truckType);

    /**
     * Resets the total tollbooth toll and number of trucks that came by the tollbooth
     * when the cash drawer is removed from its cradle.
     */
    void resetData();


}
