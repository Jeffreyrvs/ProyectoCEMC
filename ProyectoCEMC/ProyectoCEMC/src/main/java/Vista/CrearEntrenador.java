/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Modelo.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author max30
 */
public class CrearEntrenador extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CrearEntrenador.class.getName());
    private ArrayList<Certificaciones> certificacion = new ArrayList<>();
    private Menu Menu;
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public CrearEntrenador() {
        
        initComponents();
        jLabel1.setText("Crear Entrenador");
        Btn_Guardar.setFocusPainted(false);
        Btn_Guardar.setBorderPainted(false);
        Btn_Guardar.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Certificaciones = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Lbl_VolverCertificaciones = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Certificacion = new javax.swing.JTextField();
        Btn_OtraCertificacion = new javax.swing.JButton();
        Btn_GuardarCertificaciones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_ApePaterno = new javax.swing.JTextField();
        Txt_ApeMaterno = new javax.swing.JTextField();
        Txt_Especialidad = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        Txt_Contrasena = new javax.swing.JTextField();
        Txt_PregRecuperacion = new javax.swing.JTextField();
        Txt_RespRecuperacion = new javax.swing.JTextField();
        Btn_Certificaciones = new javax.swing.JButton();

        Dlg_Certificaciones.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dlg_Certificaciones.setTitle("Tratamientos");
        Dlg_Certificaciones.setModal(true);
        Dlg_Certificaciones.setResizable(false);

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_VolverCertificaciones.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_VolverCertificaciones.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_VolverCertificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_VolverCertificaciones.setText("VOLVER");
        Lbl_VolverCertificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_VolverCertificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverCertificacionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCertificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCertificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jPanel13.setBackground(new java.awt.Color(41, 51, 92));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        jPanel14.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 51, 92));
        jLabel6.setText("Certificaciones");

        Txt_Certificacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Certificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Certificacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Certificacion.setText("Ingrese la certificación");
        Txt_Certificacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Certificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_CertificacionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Certificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Certificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 90));

        Btn_OtraCertificacion.setBackground(new java.awt.Color(41, 51, 92));
        Btn_OtraCertificacion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_OtraCertificacion.setForeground(new java.awt.Color(250, 250, 250));
        Btn_OtraCertificacion.setText("OTRO");
        Btn_OtraCertificacion.setBorder(null);
        Btn_OtraCertificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_OtraCertificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_OtraCertificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_OtraCertificacionMouseExited(evt);
            }
        });
        Btn_OtraCertificacion.addActionListener(this::Btn_OtraCertificacionActionPerformed);
        jPanel11.add(Btn_OtraCertificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 40));

        Btn_GuardarCertificaciones.setBackground(new java.awt.Color(41, 51, 92));
        Btn_GuardarCertificaciones.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_GuardarCertificaciones.setForeground(new java.awt.Color(250, 250, 250));
        Btn_GuardarCertificaciones.setText("GUARDAR");
        Btn_GuardarCertificaciones.setBorder(null);
        Btn_GuardarCertificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_GuardarCertificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_GuardarCertificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_GuardarCertificacionesMouseExited(evt);
            }
        });
        Btn_GuardarCertificaciones.addActionListener(this::Btn_GuardarCertificacionesActionPerformed);
        jPanel11.add(Btn_GuardarCertificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 110, 40));

        javax.swing.GroupLayout Dlg_CertificacionesLayout = new javax.swing.GroupLayout(Dlg_Certificaciones.getContentPane());
        Dlg_Certificaciones.getContentPane().setLayout(Dlg_CertificacionesLayout);
        Dlg_CertificacionesLayout.setHorizontalGroup(
            Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dlg_CertificacionesLayout.setVerticalGroup(
            Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Crear Entrenador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 50));

        Lbl_Volver.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 800, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos personales");

        Txt_Nombre.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nombre.setText("Ingrese su nombre");
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_NombreMousePressed(evt);
            }
        });
        Txt_Nombre.addActionListener(this::Txt_NombreActionPerformed);

        Txt_ApePaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApePaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApePaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApePaterno.setText("Ingrese su primer apellido");
        Txt_ApePaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApePaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ApePaternoMousePressed(evt);
            }
        });

        Txt_ApeMaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApeMaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApeMaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApeMaterno.setText("Ingrese su segundo apellido");
        Txt_ApeMaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApeMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ApeMaternoMousePressed(evt);
            }
        });

        Txt_Especialidad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Especialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Especialidad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Especialidad.setText("Ingrese su especialidad");
        Txt_Especialidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Especialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_EspecialidadMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 419, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 530, 170));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Información de contacto");

        Txt_Correo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Correo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Correo.setText("Ingrese su correo");
        Txt_Correo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_CorreoMousePressed(evt);
            }
        });

        Txt_Telefono.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Telefono.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Telefono.setText("Ingrese su teléfono");
        Txt_Telefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TelefonoMousePressed(evt);
            }
        });

        Txt_Direccion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Direccion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Direccion.setText("Ingrese su dirección");
        Txt_Direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_DireccionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 210, 170));

        Btn_Guardar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Guardar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Guardar.setText("GUARDAR");
        Btn_Guardar.setBorder(null);
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_GuardarMouseExited(evt);
            }
        });
        Btn_Guardar.addActionListener(this::Btn_GuardarActionPerformed);
        jPanel2.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 110, 40));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Datos de cuenta");

        Txt_Usuario.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Usuario.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Usuario.setText("Cree un usuario");
        Txt_Usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_UsuarioMousePressed(evt);
            }
        });

        Txt_Contrasena.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Contrasena.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Contrasena.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Contrasena.setText("Cree una contraseña");
        Txt_Contrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ContrasenaMousePressed(evt);
            }
        });

        Txt_PregRecuperacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_PregRecuperacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_PregRecuperacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_PregRecuperacion.setText("Pregunta de recuperación");
        Txt_PregRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_PregRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_PregRecuperacionMousePressed(evt);
            }
        });

        Txt_RespRecuperacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_RespRecuperacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_RespRecuperacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_RespRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_RespRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_RespRecuperacionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_PregRecuperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PregRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 760, 90));

        Btn_Certificaciones.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Certificaciones.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Certificaciones.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Certificaciones.setText("AÑADIR CERTIFICACION");
        Btn_Certificaciones.setBorder(null);
        Btn_Certificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Certificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CertificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CertificacionesMouseExited(evt);
            }
        });
        Btn_Certificaciones.addActionListener(this::Btn_CertificacionesActionPerformed);
        jPanel2.add(Btn_Certificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        this.dispose();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Txt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NombreMousePressed
        Txt_Nombre.setText("");
    }//GEN-LAST:event_Txt_NombreMousePressed

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreActionPerformed

    private void Txt_ApePaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ApePaternoMousePressed
        Txt_ApePaterno.setText("");
    }//GEN-LAST:event_Txt_ApePaternoMousePressed

    private void Txt_ApeMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ApeMaternoMousePressed
        Txt_ApeMaterno.setText("");
    }//GEN-LAST:event_Txt_ApeMaternoMousePressed

    private void Txt_CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CorreoMousePressed
        Txt_Correo.setText("");
    }//GEN-LAST:event_Txt_CorreoMousePressed

    private void Txt_TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TelefonoMousePressed
        Txt_Telefono.setText("");
    }//GEN-LAST:event_Txt_TelefonoMousePressed

    private void Txt_DireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DireccionMousePressed
        Txt_Direccion.setText("");
    }//GEN-LAST:event_Txt_DireccionMousePressed

    private void Txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UsuarioMousePressed
        Txt_Usuario.setText("");
    }//GEN-LAST:event_Txt_UsuarioMousePressed

    private void Txt_ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ContrasenaMousePressed
        Txt_Contrasena.setText("");
    }//GEN-LAST:event_Txt_ContrasenaMousePressed

    private void Txt_PregRecuperacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_PregRecuperacionMousePressed
        Txt_PregRecuperacion.setText("");
    }//GEN-LAST:event_Txt_PregRecuperacionMousePressed

    private void Txt_RespRecuperacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_RespRecuperacionMousePressed
        Txt_RespRecuperacion.setText("");
    }//GEN-LAST:event_Txt_RespRecuperacionMousePressed

    private void Btn_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarMouseEntered
        Btn_Guardar.setBackground(hover);
    }//GEN-LAST:event_Btn_GuardarMouseEntered

    private void Btn_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarMouseExited
        Btn_Guardar.setBackground(azul);
    }//GEN-LAST:event_Btn_GuardarMouseExited

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        try {
            if (!Txt_Usuario.getText().isEmpty() && !Txt_ApeMaterno.getText().isEmpty()
                && !Txt_ApePaterno.getText().isEmpty() && !Txt_Contrasena.getText().isEmpty() && !Txt_Correo.getText().isEmpty()
                && !Txt_Direccion.getText().isEmpty() && !Txt_Nombre.getText().isEmpty() && !Txt_PregRecuperacion.getText().isEmpty() && !Txt_RespRecuperacion.getText().isEmpty() && !Txt_Telefono.getText().isEmpty()){
                String ApePaterno = Txt_ApePaterno.getText().trim();
                String ApeMaterno = Txt_ApeMaterno.getText().trim();
                String Contrasena = Txt_Contrasena.getText().trim();
                String Correo = Txt_Correo.getText().trim();
                String Direccion = Txt_Direccion.getText().trim();
                String Especialidad = Txt_Especialidad.getText().trim();

                String Nombre = Txt_Nombre.getText().trim();
                String PregRecuperacion = Txt_PregRecuperacion.getText().trim();
                String RespRecuperacion = Txt_RespRecuperacion.getText().trim();
                String Telefono = Txt_Telefono.getText().trim();
                String Usuario = Txt_Usuario.getText().trim();

                Usuario usuario = new Usuario(Nombre,ApePaterno,ApeMaterno,Correo,Telefono,Direccion,Usuario,Contrasena,PregRecuperacion,RespRecuperacion,"Entrenador");
                Entrenadores entrenador = new Entrenadores();
                
                int aux = usuario.Guardar();
                entrenador.setUsuario_idusuario(aux);
                entrenador.setEspecialidad(Especialidad);
                
                entrenador.Guardar_entrenador();
                
                for (int i=0; i<certificacion.size(); i++){
                    certificacion.get(i).setEntrenadores_usuario_idusuario(aux);
                    certificacion.get(i).Guardar();
                }
                
                JOptionPane.showMessageDialog(this,"GUARDADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los campos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_EspecialidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EspecialidadMousePressed
        // TODO add your handling code here:
        Txt_Especialidad.setText("");
    }//GEN-LAST:event_Txt_EspecialidadMousePressed

    private void Btn_CertificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CertificacionesMouseEntered
        Btn_Certificaciones.setBackground(hover);
    }//GEN-LAST:event_Btn_CertificacionesMouseEntered

    private void Btn_CertificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CertificacionesMouseExited
        Btn_Certificaciones.setBackground(azul);
    }//GEN-LAST:event_Btn_CertificacionesMouseExited

    private void Btn_CertificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CertificacionesActionPerformed
        Dlg_Certificaciones.pack();
        Dlg_Certificaciones.setLocationRelativeTo(this);
        Dlg_Certificaciones.setVisible(true);
    }//GEN-LAST:event_Btn_CertificacionesActionPerformed

    private void Lbl_VolverCertificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverCertificacionesMouseClicked
        Dlg_Certificaciones.dispose();
    }//GEN-LAST:event_Lbl_VolverCertificacionesMouseClicked

    private void Txt_CertificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CertificacionMousePressed
        Txt_Certificacion.setText("");
    }//GEN-LAST:event_Txt_CertificacionMousePressed

    private void Btn_OtraCertificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_OtraCertificacionMouseEntered
        Btn_OtraCertificacion.setBackground(hover);
    }//GEN-LAST:event_Btn_OtraCertificacionMouseEntered

    private void Btn_OtraCertificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_OtraCertificacionMouseExited
        Btn_OtraCertificacion.setBackground(azul);
    }//GEN-LAST:event_Btn_OtraCertificacionMouseExited

    private void Btn_OtraCertificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OtraCertificacionActionPerformed
        if(!(Txt_Certificacion.getText().equals("Ingrese la certificación"))) {
            certificacion.add(new Certificaciones(Txt_Certificacion.getText()));
        } else {
            JOptionPane.showMessageDialog(this,"Por favor, ingrese los campos");
        }
        Txt_Certificacion.setText("Ingrese la certificación");
    }//GEN-LAST:event_Btn_OtraCertificacionActionPerformed

    private void Btn_GuardarCertificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarCertificacionesMouseEntered
        Btn_GuardarCertificaciones.setBackground(hover);
    }//GEN-LAST:event_Btn_GuardarCertificacionesMouseEntered

    private void Btn_GuardarCertificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarCertificacionesMouseExited
        Btn_GuardarCertificaciones.setBackground(azul);
    }//GEN-LAST:event_Btn_GuardarCertificacionesMouseExited

    private void Btn_GuardarCertificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarCertificacionesActionPerformed
        if(!(Txt_Certificacion.getText().equals("Ingrese la certificación"))) {
            certificacion.add(new Certificaciones(Txt_Certificacion.getText()));
            JOptionPane.showMessageDialog(this,"Certificaciones guardadas exitosamente");
        } else {
            JOptionPane.showMessageDialog(this,"Por favor, ingrese los campos");
        }

        Dlg_Certificaciones.dispose();
    }//GEN-LAST:event_Btn_GuardarCertificacionesActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Certificaciones;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_GuardarCertificaciones;
    private javax.swing.JButton Btn_OtraCertificacion;
    private javax.swing.JDialog Dlg_Certificaciones;
    private javax.swing.JDialog Dlg_Tratamientos;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JLabel Lbl_VolverCertificaciones;
    private javax.swing.JLabel Lbl_VolverTratamientos;
    private javax.swing.JTextField Txt_ApeMaterno;
    private javax.swing.JTextField Txt_ApePaterno;
    private javax.swing.JTextField Txt_Certificacion;
    private javax.swing.JTextField Txt_Contrasena;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Especialidad;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_PregRecuperacion;
    private javax.swing.JTextField Txt_RespRecuperacion;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
