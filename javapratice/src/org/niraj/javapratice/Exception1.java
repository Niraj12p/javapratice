package org.niraj.javapratice;

public class Exception1 {

    public static void main(String[] args) {
        try {

            int a = 0;
            int b = 20 / 0;
            System.out.println(b);
            System.out.println("Inside try");

        } catch (ArithmeticException ex) {
            //System.out.println("Divide by zero");
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }
        System.out.println("With exception handling");

    }
}
