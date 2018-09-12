public class Truck {
    //interface Truck {
    private int axles;
    private int weight;
    private int totalWeight = 0;
    private int totalAxles = 0;
    //tollBooth booth = new tollBooth() {

/*
        @Override
        public double calculateToll(int axles, double weight) {
            return super.calculateToll(axles, weight);
        }
*/
    // booth.calculateToll()


    public int getWeight() {
        return weight;
    }

    public int getAxles() {
        return axles;
    }

    /**
     * Calculates the total truck axles that come to the toll booth
     *
     * @return totalAxles
     */

    public int getTotalWeight() {
        totalWeight += weight;
        return totalWeight;
    }

    /**
     * Calculates the total truck weights that come to the toll booth
     *
     * @return The total truck weights that come to the toll booth
     */

    public int getTotalAxles() {

        totalAxles += axles;
        return totalAxles;
    }

    public Truck(int truckAxel, int truckWeight) {

        /*
        super(truckAxel,truckWeight);
        truckAxel = this.axles;
        truckWeight = this.weight;
        */

        this.axles = truckAxel;
        this.weight = truckWeight;

    }


}
