/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author matte
 */
public class TriangleObjects 
{
    double lato1;
    double lato2;
    double lato3;   
    String typeAngle;
    
    TriangleObjects (double lato1, double lato2, double lato3, String typeAngle)
    {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.typeAngle = typeAngle;
    }
    
    public double getLato1()
    {
        return this.lato1;
    }
    
    public double getLato2()
    {
        return this.lato2;
    }
    
    public double getLato3()
    {
        return this.lato3;
    }
    
    public void setLato1(double lato1)
    {
        this.lato1 = lato1;
    }
    
    public void setLato2(double lato2)
    {
        this.lato2 = lato2;
    }
    
    public void setLato3(double lato3)
    {
        this.lato3 = lato3;
    }
    
    public String gettypeAngle()
    {
        return this.typeAngle;
    }
    
    public void settypeAngle(String typeAngle)
    {
        this.typeAngle = typeAngle;
    }
}
