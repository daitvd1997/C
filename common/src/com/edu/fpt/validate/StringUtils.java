/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.fpt.validate;

/**
 *
 * @author Trinh Dai
 */
public class StringUtils {
    public static String nomalize(String str) {
        str = str.trim();
        str = str.replaceAll("//s+", " ");
        return str;
    }
}
