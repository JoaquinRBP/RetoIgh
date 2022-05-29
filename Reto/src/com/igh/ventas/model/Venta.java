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
    private int nventa;
    private char categoria;
    private int cant;
    private float precioxcamion;
    private float total;
    private float porcxcomision;
    private float comisiontotal;
    
    public Venta(){
    }

    public int getNventa() {
        return nventa;
    }

    public void setNventa(int nventa) {
        this.nventa = nventa;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecioxcamion() {
        return precioxcamion;
    }

    public void setPrecioxcamion(float precioxcamion) {
        this.precioxcamion = precioxcamion;
    }

    public float getPorcxcomision() {
        return porcxcomision;
    }

    public void setPorcxcomision(float porcxcomision) {
        this.porcxcomision = porcxcomision;
    }

    public float getComisiontotal() {
        return comisiontotal;
    }

    public void setComisiontotal(float comisiontotal) {
        this.comisiontotal = comisiontotal;
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
