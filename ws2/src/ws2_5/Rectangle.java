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
public class Rectangle extends TwoShape{
    
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    
    
    @Override
    public void Input() {
        System.out.print("Enter the length: ");
        this.length = new Scanner(System.in).nextDouble();
        System.out.print("Enter the width: ");
        this.width = new Scanner(System.in).nextDouble();
    }

    @Override
    public double calArea() {
        return (length + width) * 2;
    }
    
}
