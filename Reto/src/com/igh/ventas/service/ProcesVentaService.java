/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.service;

import com.igh.ventas.model.VentaListaModel;
import com.igh.ventas.model.VentaModel;

/**
 *
 * @author DELL
 */
public class ProcesVentaService {
    public int importVenta(int precioCamioneta, int cantCamionetas){
    return precioCamioneta*cantCamionetas;
    }
    public float importComision(int porcenComision, int importVenta){
        return (float)(porcenComision*importVenta)/100;
    }
    public void setPrecioCamioneta(VentaListaModel listaventa, int precioCamioneta){

    }
    public void setAcumVenta(VentaListaModel listaventa, VentaModel venta){
        switch(venta.getCategoria()){
            case 'A':
                listaventa.setCantCamionetaA((listaventa.getCantCamionetaA()+venta.getCantCamionetas()));
                listaventa.setImportComisionA((listaventa.getImportComisionA()+venta.getImportComision()));
                listaventa.setImportVentaA((listaventa.getImportVentaA()+venta.getImportVenta()));
                listaventa.setVentaCategA((listaventa.getVentaCategA()+1));
                break;
            case 'B':
                listaventa.setCantCamionetaB((listaventa.getCantCamionetaB()+venta.getCantCamionetas()));
                listaventa.setImportComisionB((listaventa.getImportComisionB()+venta.getImportComision()));
                listaventa.setImportVentaB((listaventa.getImportVentaB()+venta.getImportVenta()));
                listaventa.setVentaCategB((listaventa.getVentaCategB()+1));
                break;
            case 'C':
                listaventa.setCantCamionetaC((listaventa.getCantCamionetaC()+venta.getCantCamionetas()));
                listaventa.setImportComisionC((listaventa.getImportComisionC()+venta.getImportComision()));
                listaventa.setImportVentaC((listaventa.getImportVentaC()+venta.getImportVenta()));
                listaventa.setVentaCategC((listaventa.getVentaCategC()+1));
                break;
            default:break;
        }
    }
    public int getTotalCantCamioneta(VentaListaModel listaventa){
        return (listaventa.getCantCamionetaA()+listaventa.getCantCamionetaB()+listaventa.getCantCamionetaC());
    }
    public float getTotalImportComision(VentaListaModel listaventa){
        return (listaventa.getImportComisionA()+listaventa.getImportComisionB()+listaventa.getImportComisionC());
    }
    public int getTotalImportVenta(VentaListaModel listaventa){
        return (listaventa.getImportVentaA()+listaventa.getImportVentaB()+listaventa.getImportVentaC());
    }
    public int getTotalCantVenta(VentaListaModel listaventa){
        return (listaventa.getVentaCategA()+listaventa.getVentaCategB()+listaventa.getVentaCategC());
    }
    
    
}
