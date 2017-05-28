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
public class MyPoint {
    private Point A,B;

    public MyPoint() {
    }

    public MyPoint(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public double getLength() {
        return A.distance(A,B);
    }
}
