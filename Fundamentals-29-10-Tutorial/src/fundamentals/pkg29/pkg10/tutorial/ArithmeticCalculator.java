/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals.pkg29.pkg10.tutorial;

import java.io.FileNotFoundException;

/**
 *
 * @author Administrator
 */
public class ArithmeticCalculator {

    private double x;//have class wide scope
    private double y;

    public ArithmeticCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add() {

        throw new ArithmeticException(" This is an Arithmetic exception from ");
    }

    public static double divide(double x, double y) {
        if (x == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return x / y;

    }

    public static int add(int x, int y) {
       throw new ArrayIndexOutOfBoundsException(" Index out bounds exception");
    }

}
