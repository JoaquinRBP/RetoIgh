/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.service;

/**
 *
 * @author DELL
 */
public class ProcesVentaService {
    public int importCamioneta(int precio, int cantidad){
    return precio*cantidad;
    }
    public float importComision(int porcenComision, int precVenta){
        return (porcenComision*precVenta)/100;
    }
}
