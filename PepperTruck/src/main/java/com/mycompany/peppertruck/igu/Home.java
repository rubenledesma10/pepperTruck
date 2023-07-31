package com.mycompany.peppertruck.igu;

import com.mycompany.peppertruck.logica.ControladoraLogica;
import com.mycompany.peppertruck.logica.Productos;
import com.mycompany.peppertruck.logica.Ventas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    ControladoraLogica control = new ControladoraLogica();
    Productos prod = new Productos();
    Ventas vent = new Ventas();
    double totalAPagar;
    Double precioProd;
    int cantidadProd;

    public Home() {
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tabProductos1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnRecargarTabla1 = new javax.swing.JButton();
        btnNuevoProducto1 = new javax.swing.JButton();
        btnEliminarProducto1 = new javax.swing.JButton();
        btnEditarProducto1 = new javax.swing.JButton();
        tabNuevaVenta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        btnAgregarCompra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNuevaVenta = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCompra = new javax.swing.JTextField();
        txtTotalCompra = new javax.swing.JTextField();
        btnFinalizarCompra = new javax.swing.JButton();
        btnEliminarCompra = new javax.swing.JButton();
        btnBuscarCompra = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labeldescripcion = new javax.swing.JLabel();
        txtTipoCompra = new javax.swing.JTextField();
        txtDescripcionCompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        dateFechaCompra = new com.toedter.calendar.JDateChooser();
        tabVentas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\promos.png")); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\nuevo.png")); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\botonEditar.png")); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\exit.png")); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\home (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("PEPPER TRUCK");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\home.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel9)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );

        jTabbedPane2.addTab("", jPanel4);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaProductos);

        btnRecargarTabla1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnRecargar.png")); // NOI18N
        btnRecargarTabla1.setText("Recargar Tabla");
        btnRecargarTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarTabla1ActionPerformed(evt);
            }
        });

        btnNuevoProducto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnAgregar.png")); // NOI18N
        btnNuevoProducto1.setText("Nuevo Producto");
        btnNuevoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\botonEliminar.png")); // NOI18N
        btnEliminarProducto1.setText("Eliminar Producto");
        btnEliminarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProducto1ActionPerformed(evt);
            }
        });

        btnEditarProducto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\botonEditar.png")); // NOI18N
        btnEditarProducto1.setText("Editar Producto");
        btnEditarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProducto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabProductos1Layout = new javax.swing.GroupLayout(tabProductos1);
        tabProductos1.setLayout(tabProductos1Layout);
        tabProductos1Layout.setHorizontalGroup(
            tabProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarProducto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoProducto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProducto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecargarTabla1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabProductos1Layout.setVerticalGroup(
            tabProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductos1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabProductos1Layout.createSequentialGroup()
                        .addComponent(btnNuevoProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargarTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", tabProductos1);

        jLabel3.setText("ID producto: ");

        jLabel4.setText("Nombre del Producto:");

        jLabel5.setText("Precio del producto:");

        txtNombreProducto.setEditable(false);

        txtPrecioCompra.setEditable(false);

        btnAgregarCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnAgregarCarro.png")); // NOI18N
        btnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompraActionPerformed(evt);
            }
        });

        tablaNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Descripcion", "Tipo", "Precio", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(tablaNuevaVenta);

        jLabel6.setText("Nombre Comprador:");

        jLabel7.setText("Fecha Compra:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\totalAPagar.png")); // NOI18N
        jLabel8.setText("TOTAL A PAGAR:");

        txtTotalCompra.setEditable(false);
        txtTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCompraActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnFinalizarCarro.png")); // NOI18N
        btnFinalizarCompra.setText("FINALIZAR COMPRA");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        btnEliminarCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnEliminarCompra.png")); // NOI18N
        btnEliminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompraActionPerformed(evt);
            }
        });

        btnBuscarCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\TodoCode\\4. Java\\PepperTruck\\Recursos\\btnBuscarProd.png")); // NOI18N
        btnBuscarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompraActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo:");

        labeldescripcion.setText("Descripcion:");

        txtTipoCompra.setEditable(false);

        txtDescripcionCompra.setEditable(false);

        jLabel11.setText("Cantidad:");

        javax.swing.GroupLayout tabNuevaVentaLayout = new javax.swing.GroupLayout(tabNuevaVenta);
        tabNuevaVenta.setLayout(tabNuevaVentaLayout);
        tabNuevaVentaLayout.setHorizontalGroup(
            tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addComponent(txtIdProducto))
                        .addGap(18, 18, 18)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeldescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(12, 12, 12)
                        .addComponent(btnBuscarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarCompra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabNuevaVentaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCompra))
                    .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                                .addComponent(txtNombreCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabNuevaVentaLayout.setVerticalGroup(
            tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarCompra)
                            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                                .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labeldescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCompra, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(45, 45, 45)
                        .addGroup(tabNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(txtNombreCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabNuevaVentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        jTabbedPane2.addTab("", tabNuevaVenta);

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaVentas);

        javax.swing.GroupLayout tabVentasLayout = new javax.swing.GroupLayout(tabVentas);
        tabVentas.setLayout(tabVentasLayout);
        tabVentasLayout.setHorizontalGroup(
            tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabVentasLayout.setVerticalGroup(
            tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", tabVentas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void txtTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCompraActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        NuevoProducto nuevoProd = new NuevoProducto();
        nuevoProd.setVisible(true);
        nuevoProd.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaProductos();
        cargarTablaVentas();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecargarTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTabla1ActionPerformed
        cargarTablaProductos();
    }//GEN-LAST:event_btnRecargarTabla1ActionPerformed

    private void btnEliminarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProducto1ActionPerformed
        if (tablaProductos.getRowCount() > 0) {

            //CONTROLO QUE SE HAYA SELECCIONADO UNA MASCOTA
            if (tablaProductos.getSelectedRow() != -1) {//-1 quiere decir que no tiene ninguna seleccionada

                int producto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));

                control.borrarProducto(producto);

                //aviso al usuario que borro correctamente
                mostrarMensaje("Producto eliminado correctamente", "Info", "Borrado de producto");
                cargarTablaProductos();
            } else {
                mostrarMensaje("No selecciono ningun producto", "Error", "Error al eliminar producto");
            }
        } else {
            mostrarMensaje("No hay ningun producto para elimimar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarProducto1ActionPerformed

    private void btnEditarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProducto1ActionPerformed
        //CONTROLO QUE LA TABLA NO ESTE VACIA
        if (tablaProductos.getRowCount() > 0) {

            //CONTROLO QUE SE HAYA SELECCIONADO UNA MASCOTA
            if (tablaProductos.getSelectedRow() != -1) {//-1 quiere decir que no tiene ninguna seleccionada
                //obtengo el id para poder editar
                int idProducto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
                EditarProducto editProd = new EditarProducto(idProducto);
                editProd.setVisible(true);
                editProd.setLocationRelativeTo(null);

            } else {
                mostrarMensaje("No selecciono ningún producto", "Error", "Error al eliminar producto");
            }
        } else {
            mostrarMensaje("No hay nada para elimimar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarProducto1ActionPerformed

    private void btnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompraActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarCompraActionPerformed

    private void btnBuscarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompraActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarCompraActionPerformed

    private void btnEliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompraActionPerformed
        eliminarProdTablaCompras();
    }//GEN-LAST:event_btnEliminarCompraActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        try {
            int cantidadTotalProd = 0;
            String nombreComprador = txtNombreCompra.getText();
            for (int i = 0; i < tablaNuevaVenta.getRowCount(); i++) {
                cantidadProd = Integer.parseInt(tablaNuevaVenta.getValueAt(i, 5).toString());
                cantidadTotalProd = cantidadTotalProd + cantidadProd;
            }          
            double totalCompra = Double.parseDouble(txtTotalCompra.getText());
            Date fechaCompra = dateFechaCompra.getDate();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formatoFecha.format(fechaCompra);
            control.agregarVenta(nombreComprador, cantidadTotalProd, totalCompra, fecha);
            mostrarMensaje("Compra finalizada", "Info", "Exito al finalizar la compra");
            limpiarTabla();
            limpiarCampos();
            cargarTablaVentas();
        } catch (NullPointerException e) {
            mostrarMensaje("Campos de datos vacíos. Revisar y llenar todos los campos.", "Error", "Error al realizar la compra");
        }

    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialogo = optionPane.createDialog(titulo);
        dialogo.setAlwaysOnTop(true);
        dialogo.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCompra;
    private javax.swing.JButton btnBuscarCompra;
    private javax.swing.JButton btnEditarProducto1;
    private javax.swing.JButton btnEliminarCompra;
    private javax.swing.JButton btnEliminarProducto1;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevoProducto1;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRecargarTabla1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private com.toedter.calendar.JDateChooser dateFechaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labeldescripcion;
    private javax.swing.JPanel tabNuevaVenta;
    private javax.swing.JPanel tabProductos1;
    private javax.swing.JPanel tabVentas;
    private javax.swing.JTable tablaNuevaVenta;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcionCompra;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreCompra;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtTipoCompra;
    private javax.swing.JTextField txtTotalCompra;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProductos() {
        //para que la tabla no sean editables, que si o si haga click en modificar si quiere modificar algo
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override //para sobreescribir, para que se ponga todo en falso
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE", "PRECIO", "TIPO", "DESCRIPCION"};
        modeloTabla.setColumnIdentifiers(titulos);

        //TRAER PRODUCTOS DESDE LA BD 
        List<Productos> listaProductos = control.traerProductos();

        //setear los datos en la tabla
        if (listaProductos != null) {
            for (Productos prod : listaProductos) {
                Object[] object = {prod.getId(), prod.getNombre(), prod.getPrecio(), prod.getTipo(), prod.getDescripcion()};

                //agrego el objeto que acabo de crear como fila al modelo de tabla
                modeloTabla.addRow(object);
            }
        }

        tablaProductos.setModel(modeloTabla);
    }

    private void cargarTablaVentas() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override //para sobreescribir, para que se ponga todo en falso
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE COMPRADOR", "CANTIDAD DE PROD", "FECHA", "TOTAL"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Ventas> listaVentas = control.traerVentas();

        //setear los datos en la tabla
        if (listaVentas != null) {
            for (Ventas vent : listaVentas) {
                Object[] object = {vent.getId_venta(), vent.getNombreComprador(), vent.getCantidadProdTotal(), vent.getFechaCompra(), vent.getTotalCompra()};
                modeloTabla.addRow(object);
            }
        }

        tablaVentas.setModel(modeloTabla);
    }

    private void agregarProducto() {
        try {
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla = (DefaultTableModel) tablaNuevaVenta.getModel();
            int id_producto = Integer.parseInt(String.valueOf(prod.getId()));
            String nombreProd = txtNombreProducto.getText();
            String tipoProd = txtTipoCompra.getText();
            String descripcionProd = txtDescripcionCompra.getText();
            precioProd = Double.parseDouble(txtPrecioCompra.getText());
            cantidadProd = Integer.parseInt(txtCantidad.getText());
            Double total = cantidadProd * precioProd;
            int item = 0;
            item = item + 1;
            ArrayList listaCompra = new ArrayList();
            listaCompra.add(id_producto);
            listaCompra.add(nombreProd);
            listaCompra.add(tipoProd);
            listaCompra.add(descripcionProd);
            listaCompra.add(precioProd);
            listaCompra.add(cantidadProd);
            listaCompra.add(total);
            Object[] o = new Object[7];
            o[0] = listaCompra.get(0);
            o[1] = listaCompra.get(1);
            o[2] = listaCompra.get(2);
            o[3] = listaCompra.get(3);
            o[4] = listaCompra.get(4);
            o[5] = listaCompra.get(5);
            o[6] = listaCompra.get(6);
            modeloTabla.addRow(o);
            tablaNuevaVenta.setModel(modeloTabla);
            calcularTotalAPagar();
        } catch (NumberFormatException e) {
            mostrarMensaje("No has seleccionado ningun producto y/o campos sin completar", "Error", "Error al agregar");
        }
    }

    private void buscarProducto() {
        if (txtIdProducto.getText().equals("")) {
            mostrarMensaje("No ha ingresado ningun producto", "Error", "Error al buscar el producto");
        } else {
            try {
                int idProducto = Integer.parseInt(txtIdProducto.getText());
                prod = control.traerProducto(idProducto);
                if (prod.getId() != 0) {
                    txtNombreProducto.setText(prod.getNombre());
                    txtPrecioCompra.setText(String.valueOf(prod.getPrecio()));
                    txtTipoCompra.setText(prod.getTipo());
                    txtDescripcionCompra.setText(prod.getDescripcion());

                }
            } catch (NullPointerException e) {
                mostrarMensaje("No hay ningún producto con ese código", "Error", "Error al buscar el producto");
                limpiarCampos();
                txtIdProducto.requestFocus();
            }
        }
    }

    private void calcularTotalAPagar() {
        totalAPagar = 0;
        for (int i = 0; i < tablaNuevaVenta.getRowCount(); i++) {//tiene que ser menor a la cantidad de filas que tiene la tabla nuevaventa
            /*variable cantidad va a capturar de la posicion que esta dentro de la tabla*/
            cantidadProd = Integer.parseInt(tablaNuevaVenta.getValueAt(i, 5).toString());
            precioProd = Double.parseDouble(tablaNuevaVenta.getValueAt(i, 4).toString());
            totalAPagar = totalAPagar + (cantidadProd * precioProd);
        }
        txtTotalCompra.setText(String.valueOf(totalAPagar));
    }

    private void eliminarProdTablaCompras() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) tablaNuevaVenta.getModel();
        if(tablaNuevaVenta.getSelectedRow()!=-1){
            modeloTabla.removeRow(tablaNuevaVenta.getSelectedRow());
        txtIdProducto.requestFocus();
        calcularTotalAPagar();
        } else {
            mostrarMensaje("No hay ningún producto agregado para eliminar", "Error","Error al eliminar");
        }
        
    }

    private void limpiarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) tablaNuevaVenta.getModel();
        modeloTabla.getDataVector().removeAllElements();;
        tablaNuevaVenta.updateUI();
    }

    private void limpiarCampos() {
        txtNombreCompra.setText("");
        txtCantidad.setText("");
        txtDescripcionCompra.setText("");
        txtIdProducto.setText("");
        txtNombreProducto.setText("");
        txtPrecioCompra.setText("");
        txtTipoCompra.setText("");
        txtTotalCompra.setText("");
    }
}
