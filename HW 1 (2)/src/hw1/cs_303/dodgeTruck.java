package hw1.cs_303;

public class dodgeTruck implements Trucks {

    /**
     * The amount of axles each truck has that's displayed on the tollbooth operator's computer screen
     */
    private int axles;

    /**
     * The amount of weight each truck has that's displayed on the tollbooth operator's computer screen
     */
    private int weight;

    public dodgeTruck(int truckAxel, int truckWeight) {
        this.axles = truckAxel;
        this.weight = truckWeight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }

}
