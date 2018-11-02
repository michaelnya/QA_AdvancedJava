/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);//
        //check
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
