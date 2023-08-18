package com.interswitch.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static double add(double x, double y){
        return x+y;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double division(double a, double b){
        return a/b;
    }
    public static void main( String[] args )

    {
        Scanner scanned = new Scanner(System.in);
        System.out.println("Enter first number");
        double p = scanned.nextDouble();
        System.out.println("Enter second number");
        double q = scanned.nextDouble();
        System.out.println("The addition of the numbers " + p +"and "+q + " is "+ add(p,q));
        System.out.println("The multiplications of the numbers " + p +"and "+q + " is "+ multiply(p,q));
        System.out.println("The subtraction of the numbers " + p +"and "+q + " is "+ subtract(p,q));
        System.out.println("The division of the numbers " + p +"and "+q + " is "+ division(p,q));
    }
}
