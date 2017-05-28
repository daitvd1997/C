/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anest.bo;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Trinh Dai
 */
public class Triangle extends TwoDemensionShape{
    
    private double a;
    private double b;
    private double c;
    
    public void Input() {
        System.out.print("Enter a: ");
        this.a = new Scanner(System.in).nextDouble();
        System.out.print("Enter b: ");
        this.b = new Scanner(System.in).nextDouble();
        System.out.print("Enter c: ");
        this.c = new Scanner(System.in).nextDouble();
    }
    
    public int checkTriangle() {
        if(a + b < c || a + c < b || b + c < a) {
            System.out.println("a, b, c is not triangle");
            return 1;
        }
       return  0;
    }
    
    @Override
    public double calArea() {
        if(checkTriangle() == 1)
            return 0;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p -c));
    }

    @Override
    public double calPri() {
        return a+b+c;
    }
   
}