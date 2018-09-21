package com.cs303.hw2;

public interface CashRegister {

    //double calculateSubTotal(int quantity, double unitPrice);
    /**
     * Calculates the subtotal price after the discount have been calculated
     * and the unit price and quantity have been provided by the customer.
     *
     * @param discount The calculated discount percentage
     */
    void calculateSubTotal(double discount);
    //double calculateTotal(int discount);

    /**
     * Calculates the total price after the subtotal and discount have been calculated
     * and the unit price and quantity have been provided by the customer.
     *
     * @param subTotal The calculated sub total.
     */
    void calculateTotal(double subTotal);

    /**
     * Calculates the percentage of discount the customer desires for their item.
     *
     * @param discount The provided discount from the customer.
     */
    void calculateDiscount(int discount);

    void setCustomerQuantity(int quantity);

    void setUnitPrice(double unitPrice);
    //double getTotal();
}
