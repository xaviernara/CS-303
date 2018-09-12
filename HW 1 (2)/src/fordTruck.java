//public class fordTruck extends Truck {
public class fordTruck implements TruckType {

    /**
     * The amount of axles each truck has that's displayed on the tollbooth operator's computer screen
     */
    private int axles;

    /**
     * The amount of weight each truck has that's displayed on the tollbooth operator's computer screen
     */
    private int weight;


    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }


    public fordTruck(int truckAxel, int truckWeight) {
        //super(truckAxel, truckWeight);
        this.axles = truckAxel;
        this.weight = truckWeight;
    }
}

