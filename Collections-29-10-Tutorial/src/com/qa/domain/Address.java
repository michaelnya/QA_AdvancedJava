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
public class Address implements Printable{

    private String firstLine;
    private String secondLine;
    private String postCode;

    public Address(String firstLine, String secondLine, String postCode) {
        this.postCode = postCode;
        this.secondLine = secondLine;
        this.firstLine = firstLine;
    }

    @Override
    public void print() {
        System.out.println("Print... the address");
    }
}
