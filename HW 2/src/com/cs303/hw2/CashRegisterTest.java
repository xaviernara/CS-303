package com.cs303.hw2;

import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister frontCashRegister = new FrontCashRegister();
        Scanner scanner = new Scanner(System.in);

        boolean atTheRegister = true;

        //while(atTheRegister){
        do {
            System.out.println("Unit Price ($):");
            double unitPrice = scanner.nextDouble();
            frontCashRegister.setUnitPrice(unitPrice);

            System.out.println("Quantity: ");
            int quantity = scanner.nextInt();
            frontCashRegister.setCustomerQuantity(quantity);

            System.out.printf("Discount: \n 1. 10%%\n 2. 20%% \n 3. 30%% \n 4. 40%% \n 5. 50%% \n 6. 60%% \n 7. 70%% \n 8. 80%% \n 9. 90%% \n 10. 100%%%n");
            int discount = scanner.nextInt();
            frontCashRegister.calculateDiscount(discount);

            System.out.println("If your ready to pay, type 'Yes'. If not type 'No'");
            //checkOut = scanner.nextLine();
            if (scanner.next().equalsIgnoreCase("yes")) {
                System.out.println("Thanks for shopping!!!");
                atTheRegister = false;
                //break;
                //atTheRegister = false;
            }
            /*
            else if (scanner.nextLine().equals("No")) {


                System.out.println("inside");
               break;
            }
            */
        } while (atTheRegister);
        //}

        /*
        System.out.println("If your ready to pay, type 'check out'");
        String checkOut= scanner.nextLine();
        continue;


        if (!checkOut.equals("check out")){


        }
        else{
            System.out.println("Thanks for shopping!");
            //break;
        }
        //frontCashRegister.setCustomerQuantity(quantity);
        //frontCashRegister.setUnitPrice(unitPrice);


        //frontCashRegister.calculateSubTotal();

        */


    }
}
