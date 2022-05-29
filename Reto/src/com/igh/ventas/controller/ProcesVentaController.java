/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.controller;

import com.igh.ventas.model.VentaListaModel;
import com.igh.ventas.model.VentaModel;
import com.igh.ventas.service.ProcesVentaService;

/**
 *
 * @author DELL
 */
public class ProcesVentaController {
    private ProcesVentaService proces;

    public ProcesVentaController() {
        proces=new ProcesVentaService();
    }
    public int importVenta(int precioCamioneta, int cantCamionetas){
    return proces.importVenta(precioCamioneta, cantCamionetas);
    }
    public float importComision(int porcenComision, int importVenta){
        return proces.importComision(porcenComision, importVenta);
    }
    public void setDatosVenta(VentaListaModel listaventa, VentaModel venta){
        this.proces.setAcumVenta(listaventa, venta);
    }
}
