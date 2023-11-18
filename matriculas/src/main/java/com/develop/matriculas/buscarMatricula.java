/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.develop.matriculas;

/**
 *
 * @author estrosebas
 */
import libreria.*;
import javax.swing.JOptionPane;

public class buscarMatricula extends javax.swing.JFrame {

    /**
     * Creates new form modificarAlumno
     */
    public buscarMatricula() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        id_Matricula = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        id_Alumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nivel_m = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grado_m = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        estado_m = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        metodo_Pago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        monto_Pago = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        id_Usuario = new javax.swing.JTextField();
        observaciones = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 10, 10, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese la ID :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Buscar matricula");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 22));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 10));

        id_Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_MatriculaActionPerformed(evt);
            }
        });
        jPanel2.add(id_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 56, 101, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 56, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 91, 300, 10));

        jLabel4.setText("id_Alumno :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, -1, -1));

        id_Alumno.setEditable(false);
        id_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_AlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(id_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 107, 200, -1));

        jLabel5.setText("Nivel :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        nivel_m.setEditable(false);
        jPanel2.add(nivel_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 135, 231, -1));

        jLabel6.setText("Grado :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, -1, -1));

        grado_m.setEditable(false);
        jPanel2.add(grado_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 163, 226, -1));

        jLabel8.setText("Estado :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, -1, -1));

        estado_m.setEditable(false);
        jPanel2.add(estado_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 191, 223, -1));

        jLabel9.setText("Metodo de pago :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 222, -1, -1));

        metodo_Pago.setEditable(false);
        jPanel2.add(metodo_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 219, 170, -1));

        jLabel10.setText("Monto pago :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 247, -1, -1));

        jLabel11.setText("Observaciones :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 275, -1, -1));

        monto_Pago.setEditable(false);
        jPanel2.add(monto_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 244, 192, -1));

        jLabel12.setText("ID Usuario :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 303, -1, -1));

        id_Usuario.setEditable(false);
        jPanel2.add(id_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 300, 204, -1));

        observaciones.setEditable(false);
        jPanel2.add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 272, 181, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 330));

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backe.jpg"))); // NOI18N
        jLabel1.setText("r");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        matriculas back = new matriculas();
        back.setVisible(true);
        this.setVisible(false); // Oculta el JFrame actual
    }//GEN-LAST:event_backActionPerformed
    // Método que maneja la búsqueda de un alumno

    private void buscar() {
        try {
            int idmatri = Integer.parseInt(id_Matricula.getText()); // Asegúrate de manejar NumberFormatException
            MatriculaDAO matriDAO = new MatriculaDAO();
            Matricula matricula = matriDAO.buscarMatriculaPorID(idmatri);
            if (matricula != null) {
                // Rellenar los campos con la información del representante
                id_Alumno.setText(Integer.toString(matricula.getId_Alumno()));
                nivel_m.setText(matricula.getNivel_m());
                grado_m.setText(Integer.toString(matricula.getGrado_m()));
                metodo_Pago.setText(matricula.getMetodo_Pago());
                estado_m.setText(matricula.getEstado_m());
                monto_Pago.setText(Double.toString(matricula.getMonto_Pago()));
                observaciones.setText(matricula.getObservaciones());
                id_Usuario.setText(matricula.getId_Usuario());
            } else {
                JOptionPane.showMessageDialog(this, "Matricula no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void id_MatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_MatriculaActionPerformed

    }//GEN-LAST:event_id_MatriculaActionPerformed

    private void id_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_AlumnoActionPerformed

    }//GEN-LAST:event_id_AlumnoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(buscarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField estado_m;
    private javax.swing.JTextField grado_m;
    private javax.swing.JTextField id_Alumno;
    private javax.swing.JTextField id_Matricula;
    private javax.swing.JTextField id_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField metodo_Pago;
    private javax.swing.JTextField monto_Pago;
    private javax.swing.JTextField nivel_m;
    private javax.swing.JTextField observaciones;
    // End of variables declaration//GEN-END:variables
}
