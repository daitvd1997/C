/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anest.gui;

import com.anest.bo.Circle;
import com.anest.bo.Shape;

/**
 *
 * @author Trinh Dai
 */
public class test {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle(5);
        System.out.println("dien tich hinh tron: " + shape.calArea());
    }
}
