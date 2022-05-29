/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.model;
import java.util.*;
import com.igh.ventas.model.Venta;
import java.util.stream.Collectors;
/**
 *
 * @author ASPIRE5
 */
public class Resumen {
    public char categoria;
    public int nventas;
    public int ncamion;
    public float importeventas;
    public float importecomision;
    private List<Venta> ventas;
    
    public Resumen(char categ, List<Venta> ventas){
        this.categoria=categ;
        this.ventas=filtrarVentas();
        this.nventas=calcularNVentas();
        this.ncamion=calcularNCamion();
        this.importeventas=calcularImporteVentas();
        this.importecomision = calcularImporteComision();
    }
    
    public Resumen(List<Venta> ventas){
        this.ventas=ventas;
        this.nventas=calcularNVentas();
        this.ncamion=calcularNCamion();
        this.importeventas=calcularImporteVentas();
        this.importecomision = calcularImporteComision();
    }
    
    private List<Venta> filtrarVentas(){
        List<Venta> filtro=
        ventas.stream()
            .filter(e->e.categoria==categoria)
                .collect(Collectors.toList());
        return filtro;
    }
    
    private int calcularNVentas(){
        int nventas=ventas.size();
        return nventas;
    }
    
    private int calcularNCamion(){
        int ncamion=0;
        
        for(int i=0;i<ventas.size();i++)
            ncamion = ventas.get(i).cant + ncamion;
        
        return ncamion;
    }
    
    private float calcularImporteVentas(){
        float importe=0;
        
        for(int i=0;i<ventas.size();i++)
            importe = ventas.get(i).total + importe;
        
        return importe;
    }
    
    private float calcularImporteComision(){
        float importe=0;
        
        for(int i=0;i<ventas.size();i++)
            importe = ventas.get(i).comisiontotal + importe;
        
        return importe;
    }
}
