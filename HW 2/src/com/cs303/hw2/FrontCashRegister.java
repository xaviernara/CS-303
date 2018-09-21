package com.cs303.hw2;


public class FrontCashRegister implements CashRegister {

    /**
     * The total price after each item is scanned.
     */
    private double total = 0.0;

    /**
     * The quantity of items the customer wants to purchase.
     */
    private int quantity = 0;

    /**
     * The unit price of the items the customer wants to purchase.
     */
    private double unitPrice = 0.0;

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /*
    @Override
    public double getTotal() {
        return total;
    }
    */

    /**
     * Calculates the subtotal price after the discount have been calculated
     * and the unit price and quantity have been provided by the customer.
     *
     * @param discount The calculated discount percentage.
     */
    @Override
    //public double calculateSubTotal(int quantity, double unitPrice) {
    public void calculateSubTotal(double discount) {
        //System.out.println("sent discount: "+ discount);
        //double subTotal = round(((unitPrice * quantity) - ((unitPrice * quantity) * discount)));
        double subTotal = ((unitPrice * quantity) - ((unitPrice * quantity) * discount));
        if (discount == 0) {
            subTotal = 0;
        }
        System.out.printf("Subtotal: $ %.2f \n", subTotal);
        calculateTotal(subTotal);
        //return subTotal;
    }


    //public double calculateTotal(int discount) {

    /**
     * Calculates the total price after the subtotal and discount have been calculated
     * and the unit price and quantity have been provided by the customer.
     *
     * @param subTotal The calculated sub total.
     */
    @Override
    public void calculateTotal(double subTotal) {
        total += subTotal;
        System.out.printf("Total: $ %.2f \n", total);
        //return total;
    }

    @Override
    public void setCustomerQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the percentage of discount the customer desires for their item.
     *
     * @param discount The provided discount from the customer.
     */
    @Override
    public void calculateDiscount(int discount) {
        double discountPercentage;
        //System.out.printf("Discount: \n 1. 10%% \n 2. 20%% \n 3. 30%% \n 4. 40%% \n 5. 50%% \n 6. 60%% \n 7. 70%% \n 8. 80%% \n 9. 90%% \n 10. 100%%%n");
        switch (discount) {
            case 1:
                discountPercentage = .10;
                calculateSubTotal(discountPercentage);
                break;
            case 2:
                discountPercentage = .20;
                calculateSubTotal(discountPercentage);
                break;
            case 3:
                discountPercentage = .30;
                calculateSubTotal(discountPercentage);
                break;
            case 4:
                discountPercentage = .40;
                calculateSubTotal(discountPercentage);
                break;
            case 5:
                discountPercentage = .50;
                calculateSubTotal(discountPercentage);
                break;
            case 6:
                discountPercentage = .60;
                calculateSubTotal(discountPercentage);
                break;
            case 7:
                discountPercentage = .70;
                calculateSubTotal(discountPercentage);
                break;
            case 8:
                discountPercentage = .80;
                calculateSubTotal(discountPercentage);
                break;
            case 9:
                discountPercentage = .90;
                calculateSubTotal(discountPercentage);
                break;
            case 10:
                discountPercentage = 0;
                calculateSubTotal(discountPercentage);
                break;
            default: break;
        }
    }
}
