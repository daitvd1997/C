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
public class Circle extends TwoDemensionShape{

    private double r;
    
    public Circle() {
        
    }
    
    public Circle(double r) {
        this.r = r;
    }
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    /**
     * calcualte area
     * @return 
     */
    
    @Override
    public double calArea() {
        return this.r * this.r * Math.PI;
    }

    @Override
    public double calPri() {
        return 2 * this.r * Math.PI;
    }

    @Override
    public void Input() {
        System.out.print("Enter r ");
        this.r = new Scanner(System.in).nextDouble();
    }
}
