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
public class Greeting {
    
    
    static void greet(String name){
        System.out.println("Hello " + name);
    }
    
    protected static void greet(){
        System.out.println("Hello world");
    }
    
    public static void greet(String name, String message){
        System.out.println(message + " " + name);
    }
}
