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
public class MyCircle {
    private int x;
    private int y;
    private int r;

    public MyCircle() {
    }

    public MyCircle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyCircle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    public int getX() {
        return x;
    }
    
    public double getArea() {
        return Math.PI * r * r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "(x, y) = " +"( "+ x +"," + y + "), r=" + r + '}';
    }
}
