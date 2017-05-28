/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2_3;

/**
 *
 * @author Trinh Dai
 */
public class main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 0);
        Point p2 = new Point(0, 7);
        MyPoint line = new MyPoint();
        System.out.println(p1.distance(5, 6));
        System.out.println();
        System.out.println(p1.distance(p2));
    }
}
