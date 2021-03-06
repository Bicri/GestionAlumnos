/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BasesDatos.Conexiones;
import Objetos.Alumno;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isaac
 */
public class Pestaña_2 extends javax.swing.JFrame {

    /**
     * Creates new form Pestaña_2
     */
    String primero = "<html><body>Primer<br>Apellido</body></html>", segundo = "<html><body>Segundo<br>Apellido</body></html>";
    String aux;
    int bandera = 0, selecciona;
    
    Conexiones conexion = new Conexiones();
    Alumno alumno;
    List <Alumno> datos = new ArrayList<>();
    
    public Pestaña_2() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        lblPrimerAp1.setText(primero);
        lblSegundoAp1.setText(segundo);
        lblTitulo.setText("Visualizar");
        listallena();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSearch = new rscomponentshade.RSFormatFieldShade();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        Panel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new rscomponentshade.RSFormatFieldShade();
        lblPrimerAp1 = new javax.swing.JLabel();
        txtPrimerApellido = new rscomponentshade.RSFormatFieldShade();
        lblSegundoAp1 = new javax.swing.JLabel();
        txtSegundoApellido = new rscomponentshade.RSFormatFieldShade();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new rscomponentshade.RSFormatFieldShade();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 112, 255)));

        btnSearch.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSearch.setPlaceholder("Búsqueda de alumno");
        btnSearch.setPreferredSize(new java.awt.Dimension(300, 45));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        btnSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnSearchKeyTyped(evt);
            }
        });

        tbLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 112, 255)));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");
        lblNombre.setEnabled(false);

        txtNombre.setEnabled(false);
        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setPlaceholder("");
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 45));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblPrimerAp1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPrimerAp1.setText("Primer ");
        lblPrimerAp1.setEnabled(false);

        txtPrimerApellido.setEnabled(false);
        txtPrimerApellido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPrimerApellido.setPlaceholder("");
        txtPrimerApellido.setPreferredSize(new java.awt.Dimension(300, 45));
        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });

        lblSegundoAp1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSegundoAp1.setText("Segundo");
        lblSegundoAp1.setEnabled(false);

        txtSegundoApellido.setEnabled(false);
        txtSegundoApellido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSegundoApellido.setPlaceholder("");
        txtSegundoApellido.setPreferredSize(new java.awt.Dimension(300, 45));

        lblMatricula.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMatricula.setText("Matricula");
        lblMatricula.setEnabled(false);

        txtMatricula.setEnabled(false);
        txtMatricula.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMatricula.setPlaceholder("");
        txtMatricula.setPreferredSize(new java.awt.Dimension(300, 45));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblPrimerAp1)
                            .addComponent(lblSegundoAp1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrimerAp1)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblSegundoAp1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        lblPrimerAp1.getAccessibleContext().setAccessibleName("Primer \nApellido");

        btnGuardar.setBackground(new java.awt.Color(1, 112, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setPreferredSize(new java.awt.Dimension(200, 45));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(1, 112, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(200, 45));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(1, 112, 255));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(200, 45));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(1, 112, 255));
        btnEliminar1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setPreferredSize(new java.awt.Dimension(200, 45));
        btnEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseExited(evt);
            }
        });
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(1, 112, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(200, 45));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lblTitulo.setText("jLabel1");

        btnCancelar.setBackground(new java.awt.Color(1, 112, 255));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(200, 45));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
        btnGuardar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
        btnGuardar.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        conexion.conectar();
        if(bandera==1)
        {
            alumno = new Alumno(Long.parseLong(txtMatricula.getText()),txtNombre.getText(),txtPrimerApellido.getText(),txtSegundoApellido.getText());
            conexion.inserta(alumno);
            
        }
        if(bandera==2)
        {
            alumno = new Alumno(Long.parseLong(txtMatricula.getText()),txtNombre.getText(),txtPrimerApellido.getText(),txtSegundoApellido.getText());
            conexion.actualiza(alumno, aux);
        }
        conexion.desconectar();
        alumno = null;
        aux=null;
        listallena();
        limpiar();
        desactiva();
        bandera = 0;
        aux = null;
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        //ENTRA
        btnEditar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // SALIR
        btnEditar.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        bandera = 2;
        lblTitulo.setText("Editar");
        activa();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        btnAgregar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        btnAgregar.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //conexion.conectar();conexion.muestra();conexion.desconectar();
        bandera = 1;
        lblTitulo.setText("Agregar");
        limpiar();
        activa();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseEntered
        // TODO add your handling code here:
        btnEliminar1.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnEliminar1MouseEntered

    private void btnEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseExited
        // TODO add your handling code here:
        btnEliminar1.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnEliminar1MouseExited

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
        bandera = 3;
        //lblTitulo.setText("Eliminar");
        conexion.conectar();
        conexion.elimina(txtMatricula.getText());
        conexion.desconectar();
        
        listallena();
        desactiva();
        lblTitulo.setText("Visualizar");
        limpiar();
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
        btnCancelar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        // TODO add your handling code here:
         btnCancelar.setBackground(new Color(1,112,255));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        desactiva();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
        // TODO add your handling code here:
        selecciona = tbLista.rowAtPoint(evt.getPoint());
        txtMatricula.setText(String.valueOf(tbLista.getValueAt(selecciona, 0)));
        txtNombre.setText(String.valueOf(tbLista.getValueAt(selecciona, 1)));
        txtPrimerApellido.setText(String.valueOf(tbLista.getValueAt(selecciona, 2)));
        txtSegundoApellido.setText(String.valueOf(tbLista.getValueAt(selecciona, 3)));
        
        aux = String.valueOf(tbLista.getValueAt(selecciona, 0));
    }//GEN-LAST:event_tbListaMouseClicked

    private void btnSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSearchKeyTyped
        // TODO add your handling code here:
        listallenaDinamica();
    }//GEN-LAST:event_btnSearchKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pestaña_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pestaña_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pestaña_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pestaña_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pestaña_2().setVisible(true);
            }
        });
    }
    
    public void activa()
    {
        Panel2.setEnabled(true);
        txtNombre.setEnabled(true);
        txtPrimerApellido.setEnabled(true);
        txtSegundoApellido.setEnabled(true);
        txtMatricula.setEnabled(true);
        lblNombre.setEnabled(true);
        lblPrimerAp1.setEnabled(true);
        lblSegundoAp1.setEnabled(true);
        lblMatricula.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar1.setEnabled(false);
    }
    
    public void desactiva()
    {
        Panel2.setEnabled(false);
        txtNombre.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtMatricula.setEnabled(false);
        lblNombre.setEnabled(false);
        lblPrimerAp1.setEnabled(false);
        lblSegundoAp1.setEnabled(false);
        lblMatricula.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar1.setEnabled(true);
        if(bandera>0)
        {
            lblTitulo.setText("Visualizar");
        }
        bandera = 0;
    }
    
    public void limpiar()
    {
      txtNombre.setText("");
      txtPrimerApellido.setText("");
      txtSegundoApellido.setText("");
      txtMatricula.setText("");
    }
    
    DefaultTableModel modelo = new DefaultTableModel(){ 
        @Override
        public boolean isCellEditable(int filas, int columnas)
        {
            if(columnas==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    };
    public void listallena()
    {   
        modelo.setRowCount(0);
        
        modelo.setColumnIdentifiers(new Object[]{"Matricula", "Nombre", "Primer Apellido", "Segundo Apellido"}); //CREAR COLUMNAS
        
        conexion.conectar(); //CONECTAR A LA BD
        
        conexion.muestra(); //OBTIENE TODOS LOS REGISTROS DE LA BD
        
        datos = conexion.getLista(); //TRAE DICHOS REGISTROS A LA CLASE ACTUAL
        
        conexion.desconectar(); //CIERRA CONEXION
        
        for(Alumno aux : datos)//FOREACH
        {
            //CREA LAS FILAS
            modelo.addRow(new Object[]{String.valueOf(aux.getMatricula()),aux.getNombre(), aux.getPrimer_apellido(), aux.getSegundo_apellido()});
        }
       
        tbLista.setModel(modelo); //AÑADE EL MODELO AL JTABLE CREADO
        
        conexion.limpiaLista(); //LIMPIA LISTA DE LA CLASE Conexiones
        datos.clear();          //LIMPIA LISTA DE LA CLASE ACTUAL
    }
    
    public void listallenaDinamica()
    {   
        modelo.setRowCount(0);
        
        modelo.setColumnIdentifiers(new Object[]{"Matricula", "Nombre", "Primer Apellido", "Segundo Apellido"}); //CREAR COLUMNAS
        
        conexion.conectar(); //CONECTAR A LA BD
        
        conexion.muestraDinamica(btnSearch.getText()); //OBTIENE TODOS LOS REGISTROS DE LA BD
        
        datos = conexion.getLista(); //TRAE DICHOS REGISTROS A LA CLASE ACTUAL
        
        conexion.desconectar(); //CIERRA CONEXION
        
        for(Alumno aux : datos)//FOREACH
        {
            //CREA LAS FILAS
            modelo.addRow(new Object[]{String.valueOf(aux.getMatricula()),aux.getNombre(), aux.getPrimer_apellido(), aux.getSegundo_apellido()});
        }
       
        tbLista.setModel(modelo); //AÑADE EL MODELO AL JTABLE CREADO
        
        conexion.limpiaLista(); //LIMPIA LISTA DE LA CLASE Conexiones
        datos.clear();          //LIMPIA LISTA DE LA CLASE ACTUAL
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private rscomponentshade.RSFormatFieldShade btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrimerAp1;
    private javax.swing.JLabel lblSegundoAp1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbLista;
    private rscomponentshade.RSFormatFieldShade txtMatricula;
    private rscomponentshade.RSFormatFieldShade txtNombre;
    private rscomponentshade.RSFormatFieldShade txtPrimerApellido;
    private rscomponentshade.RSFormatFieldShade txtSegundoApellido;
    // End of variables declaration//GEN-END:variables
}
