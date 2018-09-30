package edu.pnw.cs303.hw3;

import java.util.LinkedList;
import java.util.Scanner;

public class AvatarTest {

    public static void main(String[] args) {
        Avatar avatar;

        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;

        LinkedList<String> selectedCosmetic = new LinkedList<>();


        System.out.println("Welcome to the Avatar 1.0 System");
        System.out.println("Please select your character");
        System.out.println("1.Male\n2.Female");


        int genderSelection = scanner.nextInt();

        if (genderSelection == 1) {

            //Male male = new Male();
            avatar = new Male();

            System.out.println("You have selected the " + avatar.getGender());

        } else {

            avatar = new Female();
            System.out.println("You have selected the " + avatar.getGender());
            //Female female = new Female();
            //female.getGender();
        }

        while (isPlaying) {

            System.out.println("Please select a cosmetic for your character\n(Type 0 to finish)");
            System.out.println("1. Jacket\n2. T-shirt\n3. Sweater\n4. Jeans\n5. Shorts \n6. Tie \n7. Neckless \n8. Earrings \n9. Sunglasses \n10. Leather Shoes \n11. High Heels \n12. Running Shoes");

            /*
            String quit = scanner.nextLine();
            if (quit.equalsIgnoreCase("exit")) {
                System.out.println("inside");

                System.out.println("Thanks for using Avatar 1.0.");
                break;
            }
            */
            //else{
                int cosmeticsSelection = scanner.nextInt();
                //switch (cosmeticsSelection) {
                //int i = Integer.parseInt(quit);
                switch (cosmeticsSelection) {
                    case 0:
                        System.out.println("Your characters has the following items: \n"+selectedCosmetic);
                        //System.out.println(new StringBuilder().append("Your characters has the following items: \n").append(selectedCosmetic).toString());
                        System.out.println("Thanks for using Avatar 1.0.");
                        isPlaying=false;
                        break;

                    case 1:
                        //else if (Integer.parseInt(quit) == 1) {
                        Jacket jacket = new Jacket(avatar);
                        System.out.println("You have selected " + jacket.getCosmetics() + " for your character");
                        selectedCosmetic.add(jacket.getCosmetics());


                        break;
                    case 2:
                        //else if (Integer.parseInt(quit) == 2) {
                        TShirt tShirt = new TShirt(avatar);
                        System.out.println("You have selected " + tShirt.getCosmetics() + " for your character");
                        selectedCosmetic.add(tShirt.getCosmetics());


                        break;
                    case 3:
                        //else if (Integer.parseInt(quit) == 3) {
                        Sweater sweater = new Sweater(avatar);
                        System.out.println("You have selected " + sweater.getCosmetics() + " for your character");
                        selectedCosmetic.add(sweater.getCosmetics());


                        break;
                    case 4:
                        //else if (Integer.parseInt(quit) == 4) {
                        Jeans jeans = new Jeans(avatar);
                        System.out.println("You have selected " + jeans.getCosmetics() + " for your character");
                        selectedCosmetic.add(jeans.getCosmetics());


                        break;
                    case 5:
                        //else if (Integer.parseInt(quit) == 5) {
                        Shorts shorts = new Shorts(avatar);
                        System.out.println("You have selected " + shorts.getCosmetics() + " for your character");
                        selectedCosmetic.add(shorts.getCosmetics());


                        break;
                    case 6:
                        //else if (Integer.parseInt(quit) == 6) {
                        Tie tie = new Tie(avatar);
                        System.out.println("You have selected " + tie.getCosmetics() + " for your character");
                        selectedCosmetic.add(tie.getCosmetics());


                        break;
                    case 7:
                        //else if (Integer.parseInt(quit) == 7) {
                        Neckless neckless = new Neckless(avatar);
                        System.out.println("You have selected " + neckless.getCosmetics() + " for your character");
                        selectedCosmetic.add(neckless.getCosmetics());


                        break;
                    case 8:
                        //else if (Integer.parseInt(quit) == 8) {
                        Earrings earrings = new Earrings(avatar);
                        System.out.println("You have selected " + earrings.getCosmetics() + " for your character");
                        selectedCosmetic.add(earrings.getCosmetics());


                        break;
                    case 9:
                        //else if (Integer.parseInt(quit) == 9) {
                        Sunglasses sunglasses = new Sunglasses(avatar);
                        System.out.println("You have selected " + sunglasses.getCosmetics() + "  for your character");
                        selectedCosmetic.add(sunglasses.getCosmetics());


                        break;
                    case 10:
                        //else if (Integer.parseInt(quit) == 10) {
                        LeatherShoes leatherShoes = new LeatherShoes(avatar);
                        System.out.println("You have selected " + leatherShoes.getCosmetics() + " for your character");
                        selectedCosmetic.add(leatherShoes.getCosmetics());


                        break;
                    case 11:
                        //else if (Integer.parseInt(quit) == 11) {
                        HighHeels highHeels = new HighHeels(avatar);
                        System.out.println("You have selected " + highHeels.getCosmetics() + " for your character");
                        selectedCosmetic.add(highHeels.getCosmetics());


                        break;
                    case 12:
                        //else if (Integer.parseInt(quit) == 12) {
                        RunningShoes runningShoes = new RunningShoes(avatar);
                        System.out.println("You have selected " + runningShoes.getCosmetics() + " for your character");
                        selectedCosmetic.add(runningShoes.getCosmetics());


                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }
            }

        }

    }

