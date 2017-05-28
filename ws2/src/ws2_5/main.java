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
public class main {
    public static void main(String[] args) {
        Shape shape;
        Menu menu = new Menu();
        int choice;
        do {
            menu.Menu();
            choice = new Scanner(System.in).nextInt();
            switch(choice) {
                case 1:
                    shape = new Square();
                    shape.Input();
                    System.out.println("The Area of square: " + shape.calArea());
                    break;
                case 2:
                    shape = new Rectangle();
                    shape.Input();
                    System.out.println("The Area of Rectangle: " + shape.calArea());
                    break;
                default: break;
            }
        }while(choice != 0);
    }
}
