/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.fpt.validate;

import java.util.Scanner;

/**
 *
 * @author Trinh Dai
 */
public class Validator {
    private static double ac;
    public static double validateDouble() {
        boolean flag;
        while(true) {
            try {
                System.out.print("Nhập số thực: ");
                String str = new Scanner(System.in).nextLine();
                double result = Double.parseDouble(str);
                return result;
            } catch(Exception e) {
                System.out.println("Nhập sai, nhập lại");
            }
        }
    }
}
