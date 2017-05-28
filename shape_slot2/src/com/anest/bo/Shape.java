/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anest.bo;

/**
 *
 * @author Trinh Dai
 */
public interface Shape {
     /**
     * the function to calculate area
     * @return 
     */
   public double calArea();
    /**
    * the function calculate perimeter
    * @return 
    */
   public double calPri();
   
   public void Input();
}
