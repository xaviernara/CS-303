package edu.pnw.cs303.hw3;

import java.util.Scanner;

public class AvatarTest {

    public static void main(String[] args) {
        Avatar avatar;

        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;
        //int cosmeticsSelection = scanner.nextInt();


        System.out.println("Welcome to the Avatar 1.0 System");
        System.out.println("Please select your character");
        System.out.println("1.Male\n2.Female");


        int genderSelection = scanner.nextInt();

        if(genderSelection==1){

            //Male male = new Male();
            avatar = new Male();

            System.out.println("You have selected the "+avatar.getGender());

        }
        else{

            avatar = new Female();
            System.out.println("You have selected the "+avatar.getGender());
            //Female female = new Female();
            //female.getGender();
        }

        


        /*
        switch(cosmeticsSelection){


        }
        */



        // write your code here
    }
}
