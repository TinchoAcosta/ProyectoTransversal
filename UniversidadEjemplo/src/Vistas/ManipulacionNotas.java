/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ManipulacionNotas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManipulacionNotas
     */
    private final String expRegNum = "^[1-9][0-9]*$";
    private List<Alumno> alumnos;
    private List<Inscripcion> inscripciones;
    private InscripcionData insData;
    private AlumnoData aluData;
    private MateriaData matData;
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna == 2){
                return true;
            }else{
                return false;                
            }
        }
    };
    public ManipulacionNotas() {
        initComponents();
        insData = new InscripcionData();
        aluData = new AlumnoData();
        matData = new MateriaData();
        cargarCombo();
        armarCabecera();
        if(jcbLista.getItemCount()>0){
            Alumno a = (Alumno)jcbLista.getSelectedItem();
            cargarTabla(a.getIdAlumno());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLista = new javax.swing.JLabel();
        jcbLista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlDni = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jlLista.setText("Seleccione un alumno:");

        jcbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlDni.setText("DNI:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlLista)
                                .addGap(39, 39, 39)
                                .addComponent(jcbLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
//        int idM, nota;
//        Alumno a = (Alumno)jcbLista.getSelectedItem();
//        idM = (Integer)modelo.getValueAt(jtTabla.getSelectedRow(), 0);
//        nota = (Integer)modelo.getValueAt(jtTabla.getSelectedRow(), 2);
//        insData.actuailizarNota(a.getIdAlumno(), idM, nota);
//        System.out.println(nota);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int dni;
        if(jtfDni.getText().matches(expRegNum)){
           dni = Integer.parseInt(jtfDni.getText());
           Alumno a = aluData.buscarAlumnoPorDni(dni);
           if(a!=null){
            jcbLista.setSelectedItem(a);               
           }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido (mayor a 0)");
        }    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaActionPerformed

        int id;
        Alumno a = (Alumno)jcbLista.getSelectedItem();
        if(a!=null){
            id = a.getIdAlumno();
            cargarTabla(id);            
        }else{
            JOptionPane.showMessageDialog(this, "No hay alumno seleccionado.");
        }
    }//GEN-LAST:event_jcbListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbLista;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlLista;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfDni;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        alumnos = aluData.listarAlumnos();
        for (Alumno alumno : alumnos) {
            jcbLista.addItem(alumno);
        }
    }
    
    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        jtTabla.setModel(modelo);
    }
    
    private void borrarFilas() {
        int filas = modelo.getRowCount()-1;
        for (int i = filas; i  >=0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarTabla(int id) {
        borrarFilas();
        Materia m;
        inscripciones = insData.obtenerInscripcionesPorAlumno(id);
            for(Inscripcion i : inscripciones){
                m = i.getMateria();
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),i.getNota()});                
            }
    }
}