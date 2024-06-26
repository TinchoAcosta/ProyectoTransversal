/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author debor
 */
public class FormularioMateria extends javax.swing.JInternalFrame {
    
    private final String expRegNum = "^[1-9][0-9]*$";
    private final String expRegLetra = "^\\D+$";
    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jlIdMateria = new javax.swing.JLabel();
        jlNombreMateria = new javax.swing.JLabel();
        jlAñoMateria = new javax.swing.JLabel();
        jtIdMateria = new javax.swing.JTextField();
        jtNombreMateria = new javax.swing.JTextField();
        jtAñoMateria = new javax.swing.JTextField();
        jbBuscarMat = new javax.swing.JButton();
        jlEstadoMateria = new javax.swing.JLabel();
        jbNuevoMateria = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jbSalirMateria = new javax.swing.JButton();
        jcEstado = new javax.swing.JCheckBox();
        jbModificar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setTitle("Formulario Materia");

        jlIdMateria.setText("Id");

        jlNombreMateria.setText("Nombre");

        jlAñoMateria.setText("Año");

        jtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdMateriaActionPerformed(evt);
            }
        });

        jbBuscarMat.setText("Buscar");
        jbBuscarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMatActionPerformed(evt);
            }
        });

        jlEstadoMateria.setText("Estado");

        jbNuevoMateria.setText("Nuevo");
        jbNuevoMateria.setEnabled(false);
        jbNuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMateriaActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardarMateria.setText("Guardar");
        jbGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMateriaActionPerformed(evt);
            }
        });

        jbSalirMateria.setText("Salir");
        jbSalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMateriaActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevoMateria)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jbGuardarMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalirMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreMateria)
                            .addComponent(jlAñoMateria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlEstadoMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcEstado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtNombreMateria)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIdMateria)
                        .addGap(48, 48, 48)
                        .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscarMat)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdMateria)
                    .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarMat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreMateria)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlAñoMateria)
                        .addComponent(jtAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlEstadoMateria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoMateria)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardarMateria)
                    .addComponent(jbSalirMateria)
                    .addComponent(jbModificar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdMateriaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int id;
        if(validarNum(jtIdMateria)){
            id = Integer.parseInt(jtIdMateria.getText());            
        }else{
            return;
        }       
        MateriaData matData = new MateriaData();
        matData.eliminarMateria(id);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMateriaActionPerformed
        limpiarCampos();
        AccesoCampos(true);
    }//GEN-LAST:event_jbNuevoMateriaActionPerformed

    private void jbSalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMateriaActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMateriaActionPerformed

    private void jbBuscarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMatActionPerformed
        int id;
        if(validarNum(jtIdMateria)){
            id = Integer.parseInt(jtIdMateria.getText());            
        }else{
            return;
        }
        
        MateriaData MatData = new MateriaData();
        Materia mat = MatData.buscarMateria(id);
        if(mat==null){
            return;
        }
        jtNombreMateria.setText(mat.getNombre());
        jtAñoMateria.setText(mat.getAño() + "");
        jcEstado.setSelected(mat.isEstado());
        jbNuevoMateria.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbGuardarMateria.setEnabled(false);
        AccesoCampos(false);
    }//GEN-LAST:event_jbBuscarMatActionPerformed

    private void jbGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMateriaActionPerformed
        String nombre;
        int anio; 
        
        if(validarNombre()){
            nombre = jtNombreMateria.getText();            
        }else{
            return;
        }
        
        if(validarNum(jtAñoMateria)){
            anio = Integer.parseInt(jtAñoMateria.getText());            
        }else{
            return;
        }
        
        MateriaData matData = new MateriaData();
        Materia m = new Materia(anio, nombre, true);
        matData.guardarMateria(m);
        limpiarCampos();
    }//GEN-LAST:event_jbGuardarMateriaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int año,id;
        String nombre;
        
        if(validarNum(jtIdMateria) && validarNum(jtAñoMateria)){
            id = Integer.parseInt(jtIdMateria.getText());
            año = Integer.parseInt(jtAñoMateria.getText());          
        }else{
            return;
        }
        if(validarNombre()){
            nombre = jtNombreMateria.getText();            
        }else{
            return;
        }
                
        MateriaData matData = new MateriaData();
        Materia m = new Materia();
        m.setIdMateria(id);
        m.setAño(año);
        m.setNombre(nombre);
        matData.modificarMateria(m);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
    }//GEN-LAST:event_jbModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton jbBuscarMat;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevoMateria;
    private javax.swing.JButton jbSalirMateria;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JLabel jlAñoMateria;
    private javax.swing.JLabel jlEstadoMateria;
    private javax.swing.JLabel jlIdMateria;
    private javax.swing.JLabel jlNombreMateria;
    private javax.swing.JTextField jtAñoMateria;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables

    private void AccesoCampos(boolean estado) {
        jcEstado.setEnabled(estado);
        jtIdMateria.setEnabled(estado);
    }

    private void limpiarCampos() {
        jtNombreMateria.setText("");
        jtIdMateria.setText("");
        jtAñoMateria.setText("");
    }
    
    private boolean validarNum(JTextField jtf) {
        if(jtf.getText().matches(expRegNum)){
            return true;            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un número válido (número mayor a 0) en ID y/o Año.");
            return false;
        }
    }
    
    private boolean validarNombre(){
        if(jtNombreMateria.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un nombre.");
            return false;
        }
        if(!jtNombreMateria.getText().matches(expRegLetra)){
            JOptionPane.showMessageDialog(this, "El nombre NO puede contener números.");
            return false;
        }
        return true;
    }

}
