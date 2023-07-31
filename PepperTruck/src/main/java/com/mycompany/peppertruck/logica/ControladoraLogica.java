package com.mycompany.peppertruck.logica;

import com.mycompany.peppertruck.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public List<Productos> traerProductos() {
        return controlPersis.traerProductos();
    }

    public List<Ventas> traerVentas() {
        return controlPersis.traerVentas();
    }

    public void borrarProducto(int producto) {
        controlPersis.borrarProducto(producto);
    }

    public Productos traerProducto(int idProducto) {
        return controlPersis.traerProductos(idProducto);
    }

    public void crearProducto(String nombre, String descripcion, String tipo, Double precio) {
        Productos prod = new Productos();
        prod.setNombre(nombre);
        prod.setDescripcion(descripcion);
        prod.setTipo(tipo);
        prod.setPrecio(precio);
        controlPersis.crearProducto(prod);
    }

    public void editarProd(Productos prod, String nombre, String descripcion, String tipo, Double precio) {
        prod.setNombre(nombre);
        prod.setDescripcion(descripcion);
        prod.setTipo(tipo);
        prod.setPrecio(precio);
        controlPersis.editarProd(prod);
    }

    public void agregarVenta(String nombreComprador, int cantidadTotalProd, double totalCompra, String fecha) {
        Ventas vent = new Ventas();
        vent.setNombreComprador(nombreComprador);
        vent.setCantidadProdTotal(cantidadTotalProd);
        vent.setTotalCompra(totalCompra);
        vent.setFechaCompra(fecha);
        controlPersis.agregarVenta(vent);
    }

}
