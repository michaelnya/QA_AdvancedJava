/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import com.qa.interfaces.Printable;

/**
 *
 * @author Administrator
 */
public abstract class Shape implements Printable, Comparable<Shape> {

    protected int numberOfSides;
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Shape(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Shape() {

    }

    /**
     *
     * @return
     */
    public abstract double area();

    /**
     *
     * @return
     */
    public abstract double perimeter();

    @Override
    public String toString() {
        return " The area is " + area() + " . The perimter is " + perimeter();
    }

    @Override
    public int compareTo(Shape o) {
       
        return (int) (area() -o.area());//
    }

}
