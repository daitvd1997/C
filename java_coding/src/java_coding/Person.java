/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coding;

/**
 *
 * @author Trinh Dai
 * 
 * 
 **/
// lop truu tuong Shape
import java.util.*;

public class Person {    
    public static void main(String[] args) {
    char x = '5';
    int a0 = x - '0'; // 0
    int a1 = Integer.parseInt(x + ""); // 1
    int a2 = Integer.parseInt(Character.toString(x)); // 2
    int a3 = Character.digit(x, 10); // 3
    int a4 = Character.getNumericValue(x); // 4
    System.out.printf("%d %d %d %d %d", a0, a1, a2, a3, a4);
}
}