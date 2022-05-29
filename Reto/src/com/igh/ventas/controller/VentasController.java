/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.controller;
import com.igh.ventas.service.VentasService;
import com.igh.ventas.model.Venta;
import com.igh.ventas.model.Resumen;
import java.util.*;

/**
 *
 * @author ASPIRE5
 */
public class VentasController {
    
    private VentasService ventasService;
    
    public VentasController(){
        ventasService = new VentasService();
    }
    
    public Venta procesarVenta(char categ, int cant){
        Venta venta = ventasService.procesarVenta(categ, cant);
        return venta;
    }
    public Venta obtenerVenta(int nventa){
        Venta venta = ventasService.obtenerVenta(nventa-1);
        return venta;
    }
    
    public List<Venta> obtenerListaVentas(){
        List<Venta> ventas = ventasService.obtenerListaVentas();
        return ventas;
    }
    
    public List<Resumen> generarReporte(){
        List<Resumen> reporte = ventasService.generarReporte();
        return reporte;
    }
    
    
}
