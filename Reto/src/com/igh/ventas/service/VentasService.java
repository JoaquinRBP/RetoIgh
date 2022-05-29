/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.service;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import com.igh.ventas.model.Venta;
import com.igh.ventas.model.Resumen;
import java.util.*;
/**
 *
 * @author ASPIRE5
 */
public class VentasService {
    
    List<Venta> ventas = new ArrayList<Venta>();
    Resumen ventasA;
    Resumen ventasB;
    Resumen ventasC;
    Resumen total;
    
    
    
    public void procesarVenta(char categ, int cant){
        int n=ventas.size()+1;
        Venta venta = new Venta(n,categ,cant);
        ventas.add(venta);
    }

    public Venta obtenerVenta(int nventa){
        Venta venta = ventas.get(nventa-1);
        return venta;
    }
    
    public List<Venta> obtenerListaVentas(){
        return ventas;
    }
    
    public List<Resumen> generarReporte(){
        ventasA= new Resumen('A',ventas);
        ventasB= new Resumen('B',ventas);
        ventasC= new Resumen('C',ventas);
        total= new Resumen(ventas);
  
        List<Resumen> reporte = new ArrayList<Resumen>();
        reporte.add(ventasA);
        reporte.add(ventasB);
        reporte.add(ventasC);
        reporte.add(total);
        
        return reporte;
        
    }
    
}
