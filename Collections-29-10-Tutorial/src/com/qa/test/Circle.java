/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class Circle extends Object {

    private final double radius;
    private final LocalDateTime dateCreated;

    public Circle(double radius) {
        this.radius = radius;
        dateCreated = LocalDateTime.now();
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "The circle has a radius of " + radius + " .It was created on " + dateCreated + " . Area is " + area();
    }

}
