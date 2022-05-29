/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class VentaListaModel {
    private ArrayList<VentaModel> ventas;
    private int ventaCategA;
    private int ventaCategB;
    private int ventaCategC;
    private int cantCamionetaA;
    private int cantCamionetaB;
    private int cantCamionetaC;
    private int importVentaA;
    private int importVentaB;
    private int importVentaC;
    private float importComisionA;
    private float importComisionB;
    private float importComisionC;

    public VentaListaModel() {
        this.ventas=new ArrayList<VentaModel>();
        this.ventaCategA=0;
        this.ventaCategB=0;
        this.ventaCategC=0;
        this.cantCamionetaA=0;
        this.cantCamionetaB=0;
        this.cantCamionetaC=0;
        this.importVentaA=0;
        this.importVentaB=0;
        this.importVentaC=0;
        this.importComisionA=0;
        this.importComisionB=0;
        this.importComisionC=0;
    }
    
    public ArrayList<VentaModel> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<VentaModel> ventas) {
        this.ventas = ventas;
    }
    public void setVenta(VentaModel venta){
        this.ventas.add(venta);
    }

    public int getVentaCategA() {
        return ventaCategA;
    }

    public void setVentaCategA(int ventaCategA) {
        this.ventaCategA = ventaCategA;
    }

    public int getVentaCategB() {
        return ventaCategB;
    }

    public void setVentaCategB(int ventaCategB) {
        this.ventaCategB = ventaCategB;
    }

    public int getVentaCategC() {
        return ventaCategC;
    }

    public void setVentaCategC(int ventaCategC) {
        this.ventaCategC = ventaCategC;
    }

    public int getCantCamionetaA() {
        return cantCamionetaA;
    }

    public void setCantCamionetaA(int cantCamionetaA) {
        this.cantCamionetaA = cantCamionetaA;
    }

    public int getCantCamionetaB() {
        return cantCamionetaB;
    }

    public void setCantCamionetaB(int cantCamionetaB) {
        this.cantCamionetaB = cantCamionetaB;
    }

    public int getCantCamionetaC() {
        return cantCamionetaC;
    }

    public void setCantCamionetaC(int cantCamionetaC) {
        this.cantCamionetaC = cantCamionetaC;
    }

    public int getImportVentaA() {
        return importVentaA;
    }

    public void setImportVentaA(int importVentaA) {
        this.importVentaA = importVentaA;
    }

    public int getImportVentaB() {
        return importVentaB;
    }

    public void setImportVentaB(int importVentaB) {
        this.importVentaB = importVentaB;
    }

    public int getImportVentaC() {
        return importVentaC;
    }

    public void setImportVentaC(int importVentaC) {
        this.importVentaC = importVentaC;
    }

    public float getImportComisionA() {
        return importComisionA;
    }

    public void setImportComisionA(float importComisionA) {
        this.importComisionA = importComisionA;
    }

    public float getImportComisionB() {
        return importComisionB;
    }

    public void setImportComisionB(float importComisionB) {
        this.importComisionB = importComisionB;
    }

    public float getImportComisionC() {
        return importComisionC;
    }

    public void setImportComisionC(float importComisionC) {
        this.importComisionC = importComisionC;
    }
    
}
