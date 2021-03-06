/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelponce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Familia PM
 */
public class Lab6_AngelPonce extends javax.swing.JFrame {

    public Lab6_AngelPonce() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    DefaultMutableTreeNode nombrecliente;
    Clientes actual;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        ModelosDisponiblesUsuario = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        AdminOpciones = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistadmin = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        AgregarAutos = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        marcaagregar = new javax.swing.JTextField();
        vinagregar = new javax.swing.JTextField();
        carroceriaagregar = new javax.swing.JTextField();
        modeloagregar = new javax.swing.JTextField();
        pasajerosagregar = new javax.swing.JTextField();
        maleteroagregar = new javax.swing.JTextField();
        coloragregar = new javax.swing.JTextField();
        precioagregar = new javax.swing.JTextField();
        potenciaagregar = new javax.swing.JTextField();
        crearauto = new javax.swing.JButton();
        ListarClientes = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        Signin = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nombresignin = new javax.swing.JTextField();
        nacionalidadsignin = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        apellidosignin = new javax.swing.JTextField();
        lugartrabajosignin = new javax.swing.JTextField();
        puestotrabajosignin = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        dineroactualsignin = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        Autosdelusuario = new javax.swing.JDialog();
        taautoscomprados = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        taautos = new javax.swing.JTextArea();
        Reporte = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tareporte = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        Login.setPreferredSize(new java.awt.Dimension(500, 500));
        Login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("LogIn");
        Login.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setText("Nombre de usuario");
        Login.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setText("Contrasenia");
        Login.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        Login.getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, -1));
        Login.getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 220, -1));

        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Login.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, 50));

        ModelosDisponiblesUsuario.setPreferredSize(new java.awt.Dimension(700, 500));
        ModelosDisponiblesUsuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Modelos Disponibles papi, escoja");
        ModelosDisponiblesUsuario.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        ModelosDisponiblesUsuario.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 390, 150));

        jButton2.setText("Comprar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        ModelosDisponiblesUsuario.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jButton5.setText("Tus autos comprados");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        ModelosDisponiblesUsuario.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        AdminOpciones.setPreferredSize(new java.awt.Dimension(700, 600));

        jButton3.setText("Agregar/Crear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Modificar");

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        jlistadmin.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jlistadmin);

        jButton6.setText("Listar Clientes");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel5.setText("Seleccione uno");

        jButton7.setText("Reporte");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AdminOpcionesLayout = new javax.swing.GroupLayout(AdminOpciones.getContentPane());
        AdminOpciones.getContentPane().setLayout(AdminOpcionesLayout);
        AdminOpcionesLayout.setHorizontalGroup(
            AdminOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminOpcionesLayout.createSequentialGroup()
                .addGroup(AdminOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminOpcionesLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton3)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminOpcionesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton7))
                    .addGroup(AdminOpcionesLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminOpcionesLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel5)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        AdminOpcionesLayout.setVerticalGroup(
            AdminOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminOpcionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(12, 12, 12)
                .addGroup(AdminOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setText("Agregar autos");

        jLabel16.setText("VIN");

        jLabel17.setText("Marca");

        jLabel18.setText("Modelo");

        jLabel19.setText("Tipo de carroceria");

        jLabel20.setText("Cantidad de pasajeros");

        jLabel21.setText("Capcidad de maletero");

        jLabel22.setText("Color");

        jLabel23.setText("Precio");

        jLabel24.setText("Potencia del motor");

        crearauto.setText("Crear auto");
        crearauto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearautoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AgregarAutosLayout = new javax.swing.GroupLayout(AgregarAutos.getContentPane());
        AgregarAutos.getContentPane().setLayout(AgregarAutosLayout);
        AgregarAutosLayout.setHorizontalGroup(
            AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAutosLayout.createSequentialGroup()
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarAutosLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarAutosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgregarAutosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(carroceriaagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(AgregarAutosLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(marcaagregar))
                                .addGroup(AgregarAutosLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(vinagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AgregarAutosLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(modeloagregar))
                                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AgregarAutosLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(precioagregar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AgregarAutosLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(coloragregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(AgregarAutosLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pasajerosagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarAutosLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maleteroagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarAutosLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(potenciaagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AgregarAutosLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(crearauto)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        AgregarAutosLayout.setVerticalGroup(
            AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAutosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(vinagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(marcaagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(modeloagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(carroceriaagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(pasajerosagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(maleteroagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(coloragregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(precioagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(AgregarAutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(potenciaagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(crearauto)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jTree1);

        javax.swing.GroupLayout ListarClientesLayout = new javax.swing.GroupLayout(ListarClientes.getContentPane());
        ListarClientes.getContentPane().setLayout(ListarClientesLayout);
        ListarClientesLayout.setHorizontalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarClientesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ListarClientesLayout.setVerticalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("SignIn");

        jLabel7.setText("ID");

        jLabel8.setText("Nombre");

        jLabel9.setText("Apellido");

        jLabel10.setText("Nacionalidad");

        jLabel11.setText("Lugar de trabajo");

        jLabel12.setText("Puesto de su trabajo");

        jLabel13.setText("Nombre de Usuario");

        jLabel14.setText("Contrasenia");

        jLabel15.setText("Dinero actual");

        jButton9.setText("Crear");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SigninLayout = new javax.swing.GroupLayout(Signin.getContentPane());
        Signin.getContentPane().setLayout(SigninLayout);
        SigninLayout.setHorizontalGroup(
            SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SigninLayout.createSequentialGroup()
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SigninLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SigninLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dineroactualsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SigninLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(puestotrabajosignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SigninLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(lugartrabajosignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SigninLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(nacionalidadsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SigninLayout.createSequentialGroup()
                                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27)
                                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidosignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombresignin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SigninLayout.createSequentialGroup()
                                    .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(SigninLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton9)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        SigninLayout.setVerticalGroup(
            SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SigninLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombresignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(apellidosignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(nacionalidadsignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lugartrabajosignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(puestotrabajosignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dineroactualsignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        taautoscomprados.setText("Tus autos comprados");

        taautos.setColumns(20);
        taautos.setRows(5);
        jScrollPane5.setViewportView(taautos);

        javax.swing.GroupLayout AutosdelusuarioLayout = new javax.swing.GroupLayout(Autosdelusuario.getContentPane());
        Autosdelusuario.getContentPane().setLayout(AutosdelusuarioLayout);
        AutosdelusuarioLayout.setHorizontalGroup(
            AutosdelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutosdelusuarioLayout.createSequentialGroup()
                .addGroup(AutosdelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutosdelusuarioLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(taautoscomprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AutosdelusuarioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        AutosdelusuarioLayout.setVerticalGroup(
            AutosdelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutosdelusuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(taautoscomprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tareporte.setColumns(20);
        tareporte.setRows(5);
        jScrollPane2.setViewportView(tareporte);

        javax.swing.GroupLayout ReporteLayout = new javax.swing.GroupLayout(Reporte.getContentPane());
        Reporte.getContentPane().setLayout(ReporteLayout);
        ReporteLayout.setHorizontalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        ReporteLayout.setVerticalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton10.setText("LogIn");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("SignIn");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean entrar = false;
        int x = 0;
        int aux = 0;
        int r = 0;
        if (nombre.getText().equals("admin") && pass.getText().equals("admin")) {
            AdminOpciones.pack();
            AdminOpciones.setModal(true);
            AdminOpciones.setLocationRelativeTo(this);
            AdminOpciones.setVisible(true);
            nombre.setText("");
            pass.setText("");
        } else {
            if (clientes.isEmpty()) {
                JOptionPane.showMessageDialog(Login, "No hay usuarios creados");
                nombre.setText("");
                pass.setText("");
            } else {
                for (int i = 0; i < clientes.size(); i++) {
                    if (nombre.getText().equals(clientes.get(i).getNombreusuario())
                            && pass.getText().equals(clientes.get(i).getPass())) {

                        entrar = true;
                        nombre.setText("");
                        pass.setText("");
                        x = i;
                        break;
                    }
                }
            }
            if (entrar) {
                actual = clientes.get(x);
                aux = 1;
                ModelosDisponiblesUsuario.pack();
                ModelosDisponiblesUsuario.setModal(true);
                ModelosDisponiblesUsuario.setLocationRelativeTo(this);
                ModelosDisponiblesUsuario.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(Login, "Usuario no existe");
                nombre.setText("");
                pass.setText("");
            }
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Login.pack();
        Login.setModal(true);
        Login.setLocationRelativeTo(this);
        Login.setVisible(true);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        Signin.pack();
        Signin.setModal(true);
        Signin.setLocationRelativeTo(this);
        Signin.setVisible(true);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        /*String ID, String nombre, String apellido, 
            String nacionalidad, String lugartrabajo, 
            String puestotrabajo, String nombreusuario, String pass, double dinero)*/
        File u = new File("./usuarios.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(u, true));
            bw.write(usuario.getText());
            bw.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(AgregarAutos, "Algo salio mal");
        }
        Clientes c = new Clientes(id.getText(), nombresignin.getText(), apellidosignin.getText(),
                nacionalidadsignin.getText(), lugartrabajosignin.getText(), puestotrabajosignin.getText(),
                usuario.getText(), password.getText(), Integer.parseInt(dineroactualsignin.getText()));

        clientes.add(c);
        JOptionPane.showMessageDialog(Signin, "Se creó nuevo usuario!");
        taautos.setText("");
        nombresignin.setText("");
        apellidosignin.setText("");
        nacionalidadsignin.setText("");
        lugartrabajosignin.setText("");
        puestotrabajosignin.setText("");
        usuario.setText("");
        password.setText("");
        dineroactualsignin.setText("");
        DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        nombrecliente = new DefaultMutableTreeNode(c.getNombre());
        raiz.add(nombrecliente);
        m.reload();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        ListarClientes.pack();
        ListarClientes.setModal(true);
        ListarClientes.setLocationRelativeTo(this);
        ListarClientes.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        AgregarAutos.pack();
        AgregarAutos.setModal(true);
        AgregarAutos.setLocationRelativeTo(this);
        AgregarAutos.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void crearautoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearautoMouseClicked
        /*
        String VIN, String marca, String modelo, 
            String tipocarroceria, String cantidadpasajeros, 
            String capacidadmaletero, String color, int precio, String potenciamotor
         */
        Autos a = new Autos(vinagregar.getText(), marcaagregar.getText(),
                modeloagregar.getText(), carroceriaagregar.getText(), pasajerosagregar.getText(),
                maleteroagregar.getText(), coloragregar.getText(), Integer.parseInt(precioagregar.getText()),
                potenciaagregar.getText());
        autos.add(a);
        JOptionPane.showMessageDialog(AgregarAutos, "Se agregó nuevo auto!");
        File cars = new File("./autos.txt");
        if (cars.exists()) {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(cars, true));
                bw.write(a.toString());
                bw.newLine();
                bw.flush();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(AgregarAutos, "Algo salio mal");
            }
        } else {
            JOptionPane.showMessageDialog(AgregarAutos, "No existe el archivo");
        }
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        modelo.addElement(a.getModelo() + ", precio: " + a.getPrecio());
        jList1.setModel(modelo);

        DefaultListModel modelo1 = (DefaultListModel) jlistadmin.getModel();
        modelo1.addElement(a.getModelo() + ", precio: " + a.getPrecio());
        jlistadmin.setModel(modelo1);

    }//GEN-LAST:event_crearautoMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        if (jlistadmin.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            modelo.removeElementAt(jlistadmin.getSelectedIndex());
            jList1.setModel(modelo);

            DefaultListModel modelo1 = (DefaultListModel) jlistadmin.getModel();
            modelo1.removeElementAt(jlistadmin.getSelectedIndex());
            jlistadmin.setModel(modelo1);

        }
    }//GEN-LAST:event_EliminarMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Autosdelusuario.pack();
        Autosdelusuario.setModal(true);
        Autosdelusuario.setLocationRelativeTo(this);
        Autosdelusuario.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (jList1.getSelectedIndex() >= 0) {
            if (actual.getDinero() >= autos.get(jList1.getSelectedIndex()).getPrecio()) {
                autos.get(jList1.getSelectedIndex()).setDuenio(actual.getNombre());
                actual.setDinero(autos.get(jList1.getSelectedIndex()).getPrecio() - actual.getDinero());
                JOptionPane.showMessageDialog(ModelosDisponiblesUsuario, "Compraste el auto!");
                taautos.append(autos.get(jList1.getSelectedIndex()).toString());
                DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
                nombrecliente.add(new DefaultMutableTreeNode(autos.get(jList1.getSelectedIndex()).getModelo()));

                //actual.getVinLista().add(autos.get(jList1.getSelectedIndex()).getVIN());
                m.reload();
            } else {
                JOptionPane.showMessageDialog(ModelosDisponiblesUsuario, "Estás hule, ya no tenés dinero");
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

        if (autos.isEmpty() == false) {
            for (int i = 0; i < autos.size(); i++) {

                tareporte.append("Auto: "+autos.get(i).getModelo()+"\n");
                tareporte.append("Duenio: "+autos.get(i).getDuenio()+"\n");
            }
            
        }
        File rep = new File("./Reporte.txt");
        if (rep.exists()) {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(rep, true));
                bw.write(tareporte.getText());
                bw.newLine();
                bw.flush();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(AgregarAutos, "Algo salio mal");
            }
        } else {
            JOptionPane.showMessageDialog(AgregarAutos, "No existe el archivo");
        }
        Reporte.pack();
        Reporte.setModal(true);
        Reporte.setLocationRelativeTo(null);
        Reporte.setVisible(true);

    }//GEN-LAST:event_jButton7MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab6_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab6_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab6_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab6_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6_AngelPonce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AdminOpciones;
    private javax.swing.JDialog AgregarAutos;
    private javax.swing.JDialog Autosdelusuario;
    private javax.swing.JButton Eliminar;
    private javax.swing.JDialog ListarClientes;
    private javax.swing.JDialog Login;
    private javax.swing.JDialog ModelosDisponiblesUsuario;
    private javax.swing.JDialog Reporte;
    private javax.swing.JDialog Signin;
    private javax.swing.JTextField apellidosignin;
    private javax.swing.JTextField carroceriaagregar;
    private javax.swing.JTextField coloragregar;
    private javax.swing.JButton crearauto;
    private javax.swing.JTextField dineroactualsignin;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    private javax.swing.JList<String> jlistadmin;
    private javax.swing.JTextField lugartrabajosignin;
    private javax.swing.JTextField maleteroagregar;
    private javax.swing.JTextField marcaagregar;
    private javax.swing.JTextField modeloagregar;
    private javax.swing.JTextField nacionalidadsignin;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombresignin;
    private javax.swing.JTextField pasajerosagregar;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField password;
    private javax.swing.JTextField potenciaagregar;
    private javax.swing.JTextField precioagregar;
    private javax.swing.JTextField puestotrabajosignin;
    private javax.swing.JTextArea taautos;
    private javax.swing.JTextField taautoscomprados;
    private javax.swing.JTextArea tareporte;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField vinagregar;
    // End of variables declaration//GEN-END:variables
    ArrayList<Clientes> clientes = new ArrayList();
    ArrayList<Autos> autos = new ArrayList();
}
