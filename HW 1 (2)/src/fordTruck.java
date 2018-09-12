//public class fordTruck extends Truck {
public class fordTruck implements TruckType{

    /**
     * The amount of axles each truck has that's displayed on the tollbooth operator's computer screen
     */
    int axles;

    /**
     * The amount of weight each truck has that's displayed on the tollbooth operator's computer screen
     */
    int weight;

    /**
     * The total amount of weight each truck has that has passed through the tollbooth and had their barcode scanned
     */
    int totalWeight = 0;

    /**
     * The total amount of weight each truck has that has passed through the tollbooth and had their barcode scanned
     */
    int totalAxles = 0;


        @Override
        public int getAxles() {
            return axles;
        }

        @Override
        public int getWeight() {
            return weight;
        }

        @Override
        public int getTotalWeight() {
            totalWeight += weight;
            return totalWeight;
        }
        @Override
        public int getTotalAxles() {

            totalAxles += axles;
            return totalAxles;
        }

        public fordTruck(int truckAxel, int truckWeight) {
            //super(truckAxel, truckWeight);
            this.axles=truckAxel;
            this.weight =truckWeight;
        }
}

