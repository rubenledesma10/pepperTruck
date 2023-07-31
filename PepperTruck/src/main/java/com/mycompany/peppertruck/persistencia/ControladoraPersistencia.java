package com.mycompany.peppertruck.persistencia;

import com.mycompany.peppertruck.logica.Productos;
import com.mycompany.peppertruck.logica.Ventas;
import com.mycompany.peppertruck.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    ProductosJpaController productosJpa = new ProductosJpaController();
    VentasJpaController ventasJpa = new VentasJpaController();

    public List<Productos> traerProductos() {
        return productosJpa.findProductosEntities();
    }

    public List<Ventas> traerVentas() {
        return ventasJpa.findVentasEntities();
    }



    public void borrarProducto(int producto) {
        try {
            productosJpa.destroy(producto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Productos traerProductos(int idProducto) {
        return productosJpa.findProductos(idProducto);
    }

    public void crearProducto(Productos prod) {
        productosJpa.create(prod);
    }

    public void editarProd(Productos prod) {
        try {
            productosJpa.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarVenta(Ventas vent) {
        ventasJpa.create(vent);
    }

}
