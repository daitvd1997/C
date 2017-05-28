/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anest.bo;

import java.util.Scanner;

/**
 *
 * @author Trinh Dai
 */
public class Square extends TwoDemensionShape{
    
    private double e;
    
    public Square() {
        
    }
    
    public Square(double e) {
        this.e = e;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }
    

    
    @Override
    public double calArea() {
        return this.e * this.e;
    }

    @Override
    public double calPri() {
        return this.e * 4;
    }

    @Override
    public void Input() {
        System.out.print("Enter e ");
        this.e = new Scanner(System.in).nextDouble();
    }
    
}
