/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape {

    public Triangle(double sideA, double sideB, double sideC) throws ShapeException {
        super(sideA, sideB, sideC);//
        validateDimensions();
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //??Why does it force me to add throws when I throw an exception
    
    private void validateDimensions() throws ShapeException {
        //implement a check of the arguments and throw an exception
        boolean isValid = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
        String message  = "";//todo build up the message
        if(!isValid)
            throw new ShapeException(message);
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
