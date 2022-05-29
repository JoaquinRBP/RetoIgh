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
        //RESULTADO
        return ventasService.procesarVenta(categ, cant);
    }
    
    public List<Venta> obtenerListaVentas(){
        //RESULTADO
        return ventasService.obtenerListaVentas();
        
    }
    
    public List<Resumen> generarReporte(){
        //RESULTADO
        return ventasService.generarReporte();
    }
    
    
}
