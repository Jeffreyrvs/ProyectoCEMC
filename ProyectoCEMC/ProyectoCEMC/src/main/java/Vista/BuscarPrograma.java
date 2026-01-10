package Vista;

import java.awt.Color;

public class BuscarPrograma extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BuscarPrograma.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public BuscarPrograma() {
        initComponents();
        Btn_MasInfo.setFocusPainted(false);
        Btn_MasInfo.setBorderPainted(false);
        Btn_MasInfo.setOpaque(true);
        Btn_Buscar.setFocusPainted(false);
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setOpaque(true);
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setBorderPainted(false);
        Btn_Limpiar.setOpaque(true);
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
        if(this.menu.getUsuario().getRol().equals("Administrador")) {
            Btn_MasInfo.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Nivel = new javax.swing.JTextField();
        Txt_Tipo = new javax.swing.JTextField();
        Txt_Descripcion = new javax.swing.JTextField();
        Txt_Duracion = new javax.swing.JTextField();
        Txt_NumSesiones = new javax.swing.JTextField();
        Txt_Costo = new javax.swing.JTextField();
        Txt_Objetivos = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_MasInfo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_IdPrograma = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Version = new javax.swing.JTextField();
        Txt_FechaActualizacion = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar programa cognitivo");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar Programa");

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
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 700, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos del programa");

        Txt_Nombre.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nombre.setText("Nombre");
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nombre.setEnabled(false);

        Txt_Nivel.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nivel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nivel.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nivel.setText("Nivel");
        Txt_Nivel.setToolTipText("");
        Txt_Nivel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nivel.setEnabled(false);

        Txt_Tipo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Tipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Tipo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Tipo.setText("Tipo");
        Txt_Tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Tipo.setEnabled(false);

        Txt_Descripcion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Descripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Descripcion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Descripcion.setText("Descripción");
        Txt_Descripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Descripcion.setEnabled(false);

        Txt_Duracion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Duracion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Duracion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Duracion.setText("Duración semanas");
        Txt_Duracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Duracion.setEnabled(false);

        Txt_NumSesiones.setBackground(new java.awt.Color(250, 250, 250));
        Txt_NumSesiones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_NumSesiones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_NumSesiones.setText("Número de sesiones");
        Txt_NumSesiones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_NumSesiones.setEnabled(false);

        Txt_Costo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Costo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Costo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Costo.setText("Costo");
        Txt_Costo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Costo.setEnabled(false);

        Txt_Objetivos.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Objetivos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Objetivos.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Objetivos.setText("Objetivos");
        Txt_Objetivos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Objetivos.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(Txt_Descripcion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Duracion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(Txt_NumSesiones))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 537, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Objetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NumSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Objetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 170));

        Btn_Limpiar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Limpiar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Limpiar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Limpiar.setText("LIMPIAR");
        Btn_Limpiar.setToolTipText("");
        Btn_Limpiar.setBorder(null);
        Btn_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_LimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_LimpiarMouseExited(evt);
            }
        });
        Btn_Limpiar.addActionListener(this::Btn_LimpiarActionPerformed);
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 40));

        Btn_MasInfo.setBackground(new java.awt.Color(41, 51, 92));
        Btn_MasInfo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_MasInfo.setForeground(new java.awt.Color(250, 250, 250));
        Btn_MasInfo.setText("MAS INFORMACIÓN");
        Btn_MasInfo.setBorder(null);
        Btn_MasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_MasInfo.setEnabled(false);
        Btn_MasInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_MasInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_MasInfoMouseExited(evt);
            }
        });
        Btn_MasInfo.addActionListener(this::Btn_MasInfoActionPerformed);
        jPanel2.add(Btn_MasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 160, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Programa a buscar");

        Txt_IdPrograma.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdPrograma.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdPrograma.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdPrograma.setText("Ingrese el ID del programa");
        Txt_IdPrograma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_IdProgramaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 240, 90));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Versión del programa");

        Txt_Version.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Version.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Version.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Version.setText("Versión");
        Txt_Version.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Version.setEnabled(false);

        Txt_FechaActualizacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_FechaActualizacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaActualizacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaActualizacion.setText("Fecha actualización");
        Txt_FechaActualizacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaActualizacion.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_Version, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_FechaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Version, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_FechaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 90));

        Btn_Buscar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Buscar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Buscar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Buscar.setText("BUSCAR");
        Btn_Buscar.setBorder(null);
        Btn_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_BuscarMouseExited(evt);
            }
        });
        Btn_Buscar.addActionListener(this::Btn_BuscarActionPerformed);
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseEntered
        Btn_Limpiar.setBackground(hover);
    }//GEN-LAST:event_Btn_LimpiarMouseEntered

    private void Btn_LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseExited
        Btn_Limpiar.setBackground(azul);
    }//GEN-LAST:event_Btn_LimpiarMouseExited

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed

    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_MasInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MasInfoMouseEntered
        Btn_MasInfo.setBackground(hover);
    }//GEN-LAST:event_Btn_MasInfoMouseEntered

    private void Btn_MasInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MasInfoMouseExited
        Btn_MasInfo.setBackground(azul);
    }//GEN-LAST:event_Btn_MasInfoMouseExited

    private void Btn_MasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MasInfoActionPerformed
        // Mostrar info del entrenador
    }//GEN-LAST:event_Btn_MasInfoActionPerformed

    private void Txt_IdProgramaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IdProgramaMousePressed
        Txt_IdPrograma.setText("");
    }//GEN-LAST:event_Txt_IdProgramaMousePressed

    private void Btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseEntered
        Btn_Buscar.setBackground(hover);
    }//GEN-LAST:event_Btn_BuscarMouseEntered

    private void Btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseExited
        Btn_Buscar.setBackground(azul);
    }//GEN-LAST:event_Btn_BuscarMouseExited

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        if(menu.getUsuario().getRol().equals("Paciente")) {
            // Buscar programas del paciente
        }else if(menu.getUsuario().getRol().equals("Entrenador")) {
            // Buscar programas del entrenador
        }else{
            // Buscar normal
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_MasInfo;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTextField Txt_Costo;
    private javax.swing.JTextField Txt_Descripcion;
    private javax.swing.JTextField Txt_Duracion;
    private javax.swing.JTextField Txt_FechaActualizacion;
    private javax.swing.JTextField Txt_IdPrograma;
    private javax.swing.JTextField Txt_Nivel;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_NumSesiones;
    private javax.swing.JTextField Txt_Objetivos;
    private javax.swing.JTextField Txt_Tipo;
    private javax.swing.JTextField Txt_Version;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
