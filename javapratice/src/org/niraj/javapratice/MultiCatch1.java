package org.niraj.javapratice;

import java.util.*;

public class MultiCatch1 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result" + c);

        } catch (ArithmeticException ex) {
            System.out.println("Denominator cannot be zero");
        } catch (Exception ex1) {
            System.out.println("Invalid number");
            System.out.println(ex1);

        }
    }
}
