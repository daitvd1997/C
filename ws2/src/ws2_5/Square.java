/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2_5;

import java.util.Scanner;

/**
 *
 * @author Trinh Dai
 */
public class Square extends TwoShape{
    
    private double e;

    public Square() {
    }

    public Square(double e) {
        this.e = e;
    }
    
    
    
    @Override
    public void Input() {
        System.out.print("Enter edge: ");
        this.e = new Scanner(System.in).nextDouble();
    }

    @Override
    public double calArea() {
           return this.e * this.e;
    }

    @Override
    public String toString() {
        return "Acreage of Square{" + "e=" + e + '}';
    }

}
