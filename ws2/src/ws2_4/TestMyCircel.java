/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2_4;

/**
 *
 * @author Trinh Dai
 */
public class TestMyCircel {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(3, 4);
        MyCircle circle2 = new MyCircle(3, 4, 8);
        circle.setR(4);
        System.out.println(circle.toString());
        System.out.println("Area2 = "+circle2.getArea());
    }
}
