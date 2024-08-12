package vistas;

import bbdd.Conexion;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Formulario;
import modelo.Utilidademail;

/**
 *
 * @author Diana
 */
public class Nuevaencuesta extends javax.swing.JFrame {

    String encuestador;

    public Nuevaencuesta() {
        initComponents();
        encuestador = Login.registrador;
        txt_labelencuestador.setText(encuestador);
        comprobaremail();
        setLocationRelativeTo(null);
        Dimension d = this.getSize();
        this.setMinimumSize(d);
    }

    public void comprobaremail() {
        if (comprobacion == false && recibiremail.isSelected() == false) {
            txt_emal.setEnabled(false);
            btn_emaill.setEnabled(false);
        } else {
            txt_emal.setEnabled(true);
            btn_emaill.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_labelencuestador = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        opc_si1 = new javax.swing.JRadioButton();
        opc_no1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        opc_nada2 = new javax.swing.JRadioButton();
        btn_algo2 = new javax.swing.JRadioButton();
        opc_mucho2 = new javax.swing.JRadioButton();
        opc_bastante2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opc_mucho3 = new javax.swing.JRadioButton();
        opc_bastante3 = new javax.swing.JRadioButton();
        opc_algo3 = new javax.swing.JRadioButton();
        opc_nada3 = new javax.swing.JRadioButton();
        opc_si4 = new javax.swing.JRadioButton();
        opc_probable4 = new javax.swing.JRadioButton();
        opc_dudoso4 = new javax.swing.JRadioButton();
        opc_no4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        recibiremail = new javax.swing.JRadioButton();
        txt_emal = new javax.swing.JTextField();
        btn_emaill = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        progress_motivacion = new javax.swing.JProgressBar();
        txt_puntuacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USUARIO ENCUESTADOR: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(50, 50, 50)
                .addComponent(txt_labelencuestador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_labelencuestador))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUESTIONARIO RICHMOND", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("¿Le gustaria dejar de fumar si pudiera hacerlo facilmente?");

        opc_si1.setBackground(new java.awt.Color(204, 204, 204));
        opc_si1.setForeground(new java.awt.Color(255, 0, 51));
        opc_si1.setText("Si");

        opc_no1.setBackground(new java.awt.Color(204, 204, 204));
        opc_no1.setForeground(new java.awt.Color(255, 0, 51));
        opc_no1.setText("No");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("¿Cuánto interés tiene en dejarlo?");

        opc_nada2.setBackground(new java.awt.Color(204, 204, 204));
        opc_nada2.setForeground(new java.awt.Color(255, 0, 51));
        opc_nada2.setText("NADA");

        btn_algo2.setBackground(new java.awt.Color(204, 204, 204));
        btn_algo2.setForeground(new java.awt.Color(255, 0, 51));
        btn_algo2.setText("ALGO");

        opc_mucho2.setBackground(new java.awt.Color(204, 204, 204));
        opc_mucho2.setForeground(new java.awt.Color(255, 0, 51));
        opc_mucho2.setText("MUCHO");

        opc_bastante2.setBackground(new java.awt.Color(204, 204, 204));
        opc_bastante2.setForeground(new java.awt.Color(255, 0, 51));
        opc_bastante2.setText("BASTANTE");

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("¿Intentará dejar de fumar en las proximas dos semanas?");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("¿Cree que dentro de 6 meses no fumará?");

        opc_mucho3.setBackground(new java.awt.Color(204, 204, 204));
        opc_mucho3.setForeground(new java.awt.Color(255, 0, 51));
        opc_mucho3.setText("MUCHO");

        opc_bastante3.setBackground(new java.awt.Color(204, 204, 204));
        opc_bastante3.setForeground(new java.awt.Color(255, 0, 51));
        opc_bastante3.setText("BASTANTE");

        opc_algo3.setBackground(new java.awt.Color(204, 204, 204));
        opc_algo3.setForeground(new java.awt.Color(255, 0, 51));
        opc_algo3.setText("ALGO");

        opc_nada3.setBackground(new java.awt.Color(204, 204, 204));
        opc_nada3.setForeground(new java.awt.Color(255, 0, 51));
        opc_nada3.setText("NADA");

        opc_si4.setBackground(new java.awt.Color(204, 204, 204));
        opc_si4.setForeground(new java.awt.Color(255, 0, 51));
        opc_si4.setText("Si");

        opc_probable4.setBackground(new java.awt.Color(204, 204, 204));
        opc_probable4.setForeground(new java.awt.Color(255, 0, 51));
        opc_probable4.setText("PROBABLE");

        opc_dudoso4.setBackground(new java.awt.Color(204, 204, 204));
        opc_dudoso4.setForeground(new java.awt.Color(255, 0, 51));
        opc_dudoso4.setText("DUDOSO");

        opc_no4.setBackground(new java.awt.Color(204, 204, 204));
        opc_no4.setForeground(new java.awt.Color(255, 0, 51));
        opc_no4.setText("NO");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        recibiremail.setForeground(new java.awt.Color(0, 0, 0));
        recibiremail.setText("¿Recibir email?");
        recibiremail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibiremailActionPerformed(evt);
            }
        });

        txt_emal.setBackground(new java.awt.Color(255, 255, 255));
        txt_emal.setForeground(new java.awt.Color(0, 0, 0));
        txt_emal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emalActionPerformed(evt);
            }
        });

        btn_emaill.setText("Enviar");
        btn_emaill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emaillActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Puntuacion obtenida");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nivel de motivacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(opc_si4)
                                .addGap(46, 46, 46)
                                .addComponent(opc_probable4)
                                .addGap(49, 49, 49)
                                .addComponent(opc_dudoso4)
                                .addGap(54, 54, 54)
                                .addComponent(opc_no4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(opc_mucho3)
                                .addGap(50, 50, 50)
                                .addComponent(opc_bastante3)
                                .addGap(32, 32, 32)
                                .addComponent(opc_algo3)
                                .addGap(39, 39, 39)
                                .addComponent(opc_nada3))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)
                                .addComponent(opc_si1)
                                .addGap(78, 78, 78)
                                .addComponent(opc_no1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(opc_mucho2)
                                .addGap(34, 34, 34)
                                .addComponent(opc_bastante2)
                                .addGap(34, 34, 34)
                                .addComponent(btn_algo2)
                                .addGap(36, 36, 36)
                                .addComponent(opc_nada2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(recibiremail)
                        .addGap(18, 18, 18)
                        .addComponent(txt_emal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_emaill))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(txt_puntuacion)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(progress_motivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(opc_si1)
                    .addComponent(opc_no1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(opc_mucho2)
                    .addComponent(opc_bastante2)
                    .addComponent(btn_algo2)
                    .addComponent(opc_nada2))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(opc_si4)
                            .addComponent(opc_probable4)
                            .addComponent(opc_dudoso4)
                            .addComponent(opc_no4)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opc_mucho3)
                        .addComponent(opc_bastante3)
                        .addComponent(opc_algo3)
                        .addComponent(opc_nada3)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txt_puntuacion))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(progress_motivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recibiremail)
                    .addComponent(txt_emal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_emaill))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

    private void btn_emaillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emaillActionPerformed
        if ("".equals(txt_emal.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un correo");
        } else {
            enviare();
        }
    }//GEN-LAST:event_btn_emaillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviarf();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_emalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emalActionPerformed

    }//GEN-LAST:event_txt_emalActionPerformed

    private void recibiremailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibiremailActionPerformed
        txt_emal.setEnabled(true);
        btn_emaill.setEnabled(true);
    }//GEN-LAST:event_recibiremailActionPerformed

    int resultado;
    String motivacion;
    String asunto = "Resultados del formularo";
    String mensaje;
    String destinatario;
    Boolean comprobacion = false;

    public void enviarf() {
        if (opc_no1.isSelected() == false && opc_si1.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ALGO EN LA PRIMERA PREGUNTA");
        } else if (opc_bastante2.isSelected() == false && opc_nada2.isSelected() == false && opc_mucho2.isSelected() == false && btn_algo2.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ALGO EN LA SEGUNDA PREGUNTA");
        } else if (opc_bastante3.isSelected() == false && opc_nada3.isSelected() == false && opc_mucho3.isSelected() == false && opc_algo3.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ALGO EN LA TERCER PREGUNTA");
        } else if (opc_si4.isSelected() == false && opc_probable4.isSelected() == false && opc_dudoso4.isSelected() == false && opc_no4.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ALGO EN LA CUARTA PREGUNTA");
        } else {
            int pregunta1 = 0;
            int pregunta2 = 0;
            int pregunta3 = 0;
            int pregunta4 = 0;

            if (opc_no1.isSelected()) {
                pregunta1 = 0;
            } else if (opc_si1.isSelected()) {
                pregunta1 = 1;
            }

            if (opc_bastante2.isSelected()) {
                pregunta2 = 2;
            } else if (opc_mucho2.isSelected()) {
                pregunta2 = 3;
            } else if (btn_algo2.isSelected()) {
                pregunta2 = 1;
            }

            if (opc_bastante3.isSelected()) {
                pregunta3 = 2;
            } else if (opc_mucho3.isSelected()) {
                pregunta3 = 3;
            } else if (opc_algo3.isSelected()) {
                pregunta3 = 1;
            }

            if (opc_si4.isSelected()) {
                pregunta4 = 3;
            } else if (opc_probable4.isSelected()) {
                pregunta4 = 2;
            } else if (opc_dudoso4.isSelected()) {
                pregunta4 = 1;
            }

            resultado = pregunta1 + pregunta2 + pregunta3 + pregunta4;
            txt_puntuacion.setText(String.valueOf(resultado));
            progress_motivacion.setValue(resultado);

            Formulario o = new Formulario("Formulario Rochmond", pregunta1, pregunta2, pregunta3, pregunta4);

            Conexion.conectar();
            if (Conexion.rformulario(o)) {
                JOptionPane.showMessageDialog(this, "FORMULARIO REGISTRADO CORRECTAMENTE");
                comprobacion = true;
            } else {
                JOptionPane.showMessageDialog(this, "NO SE HA REGISTRADO CORRECTAMENTE");
            }
            Conexion.cerrarconexion();
        }
    }

    public String motivacion() {
        if (resultado >= 8) {
            motivacion = "Alta";
        } else if (resultado > 5 && resultado < 8) {
            motivacion = "Moderada";
        } else if (resultado > 3 && resultado < 5) {
            motivacion = "Baja";
        } else {
            motivacion = "Nula";
        }
        return motivacion;
    }

    ;
    
    public void enviare() {
        mensaje = "El resultado del formulario sobre su nivel de motivacion para dejar de fumar ha sido de " + resultado + "sobre 10"
                + "\nSu motivacion para dejar de fumar es " + motivacion() + "\nSu salud es lo primero. Piense en ello" + "\n\nServicio de prevencion de tabaquismo";
        destinatario = txt_emal.getText();

        Utilidademail ob = new Utilidademail(asunto, mensaje, destinatario, "/documentos/documento.pdf");

        if (ob.enviarmail()) {
            JOptionPane.showMessageDialog(this, "MENSAJE ENVIADO");
        } else {
            JOptionPane.showMessageDialog(this, "MENSAJE NO ENVIADO");
        }

        txt_emal.setText("");
        txt_emal.setEnabled(false);
        btn_emaill.setEnabled(false);

    }

    ;
    
    
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
            java.util.logging.Logger.getLogger(Nuevaencuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevaencuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevaencuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevaencuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevaencuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_algo2;
    private javax.swing.JButton btn_emaill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton opc_algo3;
    private javax.swing.JRadioButton opc_bastante2;
    private javax.swing.JRadioButton opc_bastante3;
    private javax.swing.JRadioButton opc_dudoso4;
    private javax.swing.JRadioButton opc_mucho2;
    private javax.swing.JRadioButton opc_mucho3;
    private javax.swing.JRadioButton opc_nada2;
    private javax.swing.JRadioButton opc_nada3;
    private javax.swing.JRadioButton opc_no1;
    private javax.swing.JRadioButton opc_no4;
    private javax.swing.JRadioButton opc_probable4;
    private javax.swing.JRadioButton opc_si1;
    private javax.swing.JRadioButton opc_si4;
    private javax.swing.JProgressBar progress_motivacion;
    private javax.swing.JRadioButton recibiremail;
    private javax.swing.JTextField txt_emal;
    private javax.swing.JLabel txt_labelencuestador;
    private javax.swing.JLabel txt_puntuacion;
    // End of variables declaration//GEN-END:variables
}
