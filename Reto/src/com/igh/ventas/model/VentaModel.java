/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.model;

/**
 *
 * @author DELL
 */
public class VentaModel {
    private int cantCamionetas;
    private char categoria;
    private int precioCamioneta;
    private int porcComision;
    private int importVenta;
    private float importComision;
    
    public VentaModel(){}
    public VentaModel(int cantCamionetas, char categoria) {
        this.cantCamionetas = cantCamionetas;
        this.categoria = categoria;
    }
        public int getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(int porcComision) {
        this.porcComision = porcComision;
    }
    
    public int getCantCamionetas() {
        return cantCamionetas;
    }

    public void setCantCamionetas(int cantCamionetas) {
        this.cantCamionetas = cantCamionetas;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getPrecioCamioneta() {
        return precioCamioneta;
    }

    public void setPrecioCamioneta(int precioCamioneta) {
        this.precioCamioneta = precioCamioneta;
    }

    public int getImportVenta() {
        return importVenta;
    }

    public void setImportVenta(int importVenta) {
        this.importVenta = importVenta;
    }

    public float getImportComision() {
        return importComision;
    }

    public void setImportComision(float importComision) {
        this.importComision = importComision;
    }
    
}
