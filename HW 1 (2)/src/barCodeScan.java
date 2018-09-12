import java.util.*;

public class barCodeScan extends tollBooth {

    private double kgInTon = 1000;
    private int tollPerAxel = 5;
    private int tollPerTon = 10;



    public double calculateToll(int axles, double weight) {
        double total = Math.floor(((weight/kgInTon) * tollPerTon ) + (axles * tollPerAxel));

        return total;
    }


    public String displayData() {


        return null;
    }



    public barCodeScan (){
        super();
    }

}
