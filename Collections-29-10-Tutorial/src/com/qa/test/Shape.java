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
public abstract class Shape
{
    protected int numberOfSides;
    protected double sideA;
    protected double sideB;
    protected double sideC;
    
    public Shape(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public Shape(){
        
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
        return " The area is " + area() +  " . The perimter is " +  perimeter();
    }
    
    
}
