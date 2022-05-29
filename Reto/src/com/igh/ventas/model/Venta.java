/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.model;

/**
 *
 * @author ASPIRE5
 */
public class Venta {
     public int nventa;
    public char categoria;
    public int cant;
    public float precioxcamion;
    public float total;
    public float porcxcomision;
    public float comisiontotal;
    
    public Venta(){
        
        
    }
    
    public void setVenta(int nventa, char categoria, int cant){
        this.nventa=nventa;
        this.categoria=categoria;
        this.cant = cant;
        this.precioxcamion=precioPorCamioneta(categoria);
        this.total = cant*this.precioxcamion;
        this.porcxcomision=porcentajeComision(this.precioxcamion,cant);
        this.comisiontotal = (porcxcomision*total)/100;
    }
    
    public float getTotal(){
        return this.total;
    }
    
    private float precioPorCamioneta(char categoria){
        float p=0;
        if(categoria=='a' || categoria=='A')
            p=55;
        else if(categoria=='b' || categoria=='B')
            p=75;
        else if(categoria=='c' || categoria=='C')
            p=93;
        
        return p;
    }
    
    private float porcentajeComision(float precioxcamion, int cant){
        float porc=0;
        if(precioxcamion==55)
            if(cant>10)
                porc=6;
            else
                porc=4;
        else if(precioxcamion==75)
            if(cant>10)
                porc=10;
            else
                porc=6;
        else
            if(cant>10)
                porc=15;
            else
                porc=10;
        
        return porc;
    }
    
}
