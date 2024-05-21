/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author debor
 */
public class Gestor extends javax.swing.JFrame {

    /**
     * Creates new form Gestor
     */
    public Gestor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormularioAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormularioMateria = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiInscripciones = new javax.swing.JMenuItem();
        jmiNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAlumnoPorMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor Universidad de la punta");
        setPreferredSize(new java.awt.Dimension(915, 690));
        setResizable(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");

        jmiFormularioAlumno.setText("Formulario de Alumno");
        jmiFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormularioAlumno);

        jmbBarraMenu.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiFormularioMateria.setText("Formulario Materia");
        jmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiFormularioMateria);

        jmbBarraMenu.add(jmMateria);

        jmAdministracion.setText("Administración");

        jmiInscripciones.setText("Manejo de inscripciones");
        jmAdministracion.add(jmiInscripciones);

        jmiNotas.setText("Manipulación de notas");
        jmAdministracion.add(jmiNotas);

        jmbBarraMenu.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiAlumnoPorMateria.setText("Alumnos por materias");
        jmConsultas.add(jmiAlumnoPorMateria);

        jmbBarraMenu.add(jmConsultas);

        jmSalir.setText("Salir");

        jmiSalir.setText("¿Desea Salir?");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmiSalir);

        jmbBarraMenu.add(jmSalir);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumno fa = new FormularioAlumno();
        fa.setVisible(true);
        escritorio.add(fa);
        escritorio.moveToFront(fa);
    }//GEN-LAST:event_jmiFormularioAlumnoActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fm = new FormularioMateria();
        fm.setVisible(true);
        escritorio.add(fm);
        escritorio.moveToFront(fm);
    }//GEN-LAST:event_jmiFormularioMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiAlumnoPorMateria;
    private javax.swing.JMenuItem jmiFormularioAlumno;
    private javax.swing.JMenuItem jmiFormularioMateria;
    private javax.swing.JMenuItem jmiInscripciones;
    private javax.swing.JMenuItem jmiNotas;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}