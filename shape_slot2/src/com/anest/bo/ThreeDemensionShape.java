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
public abstract class ThreeDemensionShape implements Shape{

    @Override
    public abstract double calArea();

    @Override
    public abstract double calPri();
    
    public abstract double volume();
    
    
}
