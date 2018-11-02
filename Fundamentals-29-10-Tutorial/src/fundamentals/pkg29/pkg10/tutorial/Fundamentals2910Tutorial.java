/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals.pkg29.pkg10.tutorial;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Fundamentals2910Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        //int a = myScanner.nextInt();


        try {
            double x = 5 + ArithmeticCalculator.divide(10.5, 0.09);

            System.out.println(x);

            ArithmeticCalculator calc = new ArithmeticCalculator(10, 12);
            double answer = calc.add();

            System.out.println(answer);
            ArithmeticCalculator.add(10, 21);

        } catch (IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always run");
        }

    }

    private static void checkNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
