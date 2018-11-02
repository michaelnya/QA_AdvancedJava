/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class Circle {

    private final double radius;
    private final LocalDateTime dateCreated;
    private final Coordinate coordinate;//potential issues

    public Circle(double radius, Coordinate coordinate) {
        this.radius = radius;
        dateCreated = LocalDateTime.now();
        this.coordinate = coordinate;
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
