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
public class Sphere extends ThreeDemensionShape{

    private double r;
    @Override
    public double calArea() {
        return 1;
    }

    @Override
    public double calPri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Input() {
        System.out.print("Enter r: ");
        this.r = new Scanner(System.in).nextDouble();
    }
    
}
