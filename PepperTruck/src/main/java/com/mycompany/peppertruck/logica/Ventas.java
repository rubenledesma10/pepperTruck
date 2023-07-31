package com.mycompany.peppertruck.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ventas implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_venta;
    @Basic
    private String nombreComprador;
    private int cantidadProdTotal;
    private double totalCompra;
    private String fechaCompra;
    
    public Ventas() {
    }

    public Ventas(int id_venta, String nombreComprador, int cantidadProdTotal, double totalCompra, String fechaCompra) {
        this.id_venta = id_venta;
        this.nombreComprador = nombreComprador;
        this.cantidadProdTotal = cantidadProdTotal;
        this.totalCompra = totalCompra;
        this.fechaCompra = fechaCompra;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public int getCantidadProdTotal() {
        return cantidadProdTotal;
    }

    public void setCantidadProdTotal(int cantidadProdTotal) {
        this.cantidadProdTotal = cantidadProdTotal;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

       
    
}
