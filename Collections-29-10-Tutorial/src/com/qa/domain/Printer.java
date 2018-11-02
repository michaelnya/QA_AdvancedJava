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
public class Printer {
   public static void doPrint(Printable p){
       p.print();
   }
}
