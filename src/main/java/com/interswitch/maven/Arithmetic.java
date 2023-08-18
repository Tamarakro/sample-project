package com.interswitch.maven;

import java.util.Scanner;

public class Arithmetic {
    public static void arithmetic(){
    Scanner scan = new Scanner(System.in);
    int choice;
        while (true){System.out.println("To perform addition input 1");
        System.out.println("To perform subtraction input 2");
        System.out.println("To perform multiplication input 3");
        System.out.println("To perform division input 4");
        System.out.println("To exit calculator input 0");

        choice = scan.nextInt();


            if (choice == 0) {
                System.out.println("Exiting the calculator.");
                break; // Exit the loop if 0 is entered
            } else if (choice < 1 || choice > 4) {
                System.out.println("You have entered an invalid number. Please try again.");
                continue; // Skip the rest of the loop and start over
            }

        switch(choice){
            case 1:
                System.out.println("You have chosen to perform addition.");
                System.out.println("Kindly enter the first number");
                double x = scan.nextDouble();
                System.out.println("Kindly enter the second number");
                double y = scan.nextDouble();
                System.out.println("The addition of "+x+ " and "+ y +" is "+ (x+y));
                break;
            case 2:
                System.out.println("You have chosen to perform subtraction.");
                System.out.println("Kindly enter the first number");
                double z = scan.nextDouble();
                System.out.println("Kindly enter the second number");
                double q = scan.nextDouble();
                System.out.println("The addition of "+z+ " and "+ q +" is "+ (z-q));
                break;
            case 3:
                System.out.println("You have chosen to perform Multiplication.");
                System.out.println("Kindly enter the first number");
                double w = scan.nextDouble();
                System.out.println("Kindly enter the second number");
                double e = scan.nextDouble();
                System.out.println("The multiplication of "+w+ " and "+ e +" is "+ (w*e));
                break;
            case 4:
                System.out.println("You have chosen to perform division.");
                System.out.println("Kindly enter the first number");
                double j = scan.nextDouble();
                System.out.println("Kindly enter the second number");
                double u = scan.nextDouble();
                System.out.println("The division of "+j+ " and "+ u +" is "+ (j/u));
                break;
            default:
                System.out.println("You have entered an invalid number");

        }
     }
    }
}
   



