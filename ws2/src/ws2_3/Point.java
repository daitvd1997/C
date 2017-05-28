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
public class Point{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(Point A, Point B) {
        int xDiff = A.x - B.x;
        int yDiff = A.y - B.y;
        return  Math.sqrt(xDiff*xDiff + yDiff*yDiff); 
    }
    
    public double distance(Point anther) {
        int xDiff = this.x - anther.x;
        int yDiff = this.y - anther.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public int getX() {
        return x;
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

    @Override
    public String toString() {
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }
    
}
