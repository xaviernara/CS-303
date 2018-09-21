package com.cs303.hw2;

public class SideCashRegister implements CashRegister {
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


    /**
     * Calculates the subtotal price after the discount have been calculated
     * and the unit price and quantity have been provided by the customer.
     *
     * @param discount The calculated discount percentage.
     */
    @Override
    public void calculateSubTotal(double discount) {
        double subTotal = ((unitPrice * quantity) - ((unitPrice * quantity) * discount));
        if (discount == 0) {
            subTotal = 0;
        }
        System.out.printf("Subtotal: $ %.2f \n", subTotal);
        calculateTotal(subTotal);
    }

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
    }

    @Override
    public void setCustomerQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the percentage of discount the customer desires for their item.
     * @param discount The provided discount from the customer.
     */
    @Override
    public void calculateDiscount(int discount) {
        double discountPercentage;
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
