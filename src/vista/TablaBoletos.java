/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Boleto;

/**
 *
 * @author Ariel
 */
public class TablaBoletos extends javax.swing.JFrame {

    /**
     * Creates new form TablaBoletos
     */
    DefaultTableModel modelo;
    ArrayList<Boleto> boletos;
    public TablaBoletos(ArrayList<Boleto> boletos) {
        this.boletos=boletos;
        initComponents();
        String cabecera[]={"Pasajero", "CI", "Asignado", "Fecha", "Origen", "Destino", "Costo", "Hora", "Clase"};
        String datos[][]={};
        modelo = new DefaultTableModel(datos, cabecera);
        table.setModel(modelo);
        int anchos [] = {120,100,100,100,100,100,100,100,100};
        for(int i=0; i<9; i++){
        	table.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        cargarDatos();
    }
    public void cargarDatos(){
        for(int i=0;i<boletos.size();i++){
                modelo.addRow(boletos.get(i).getForTable());
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

        scpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setTitle("Tabla de Boletos Vendidos");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pasajero", "CI", "Asignado", "Fecha", "Origen", "Destino", "Costo", "Hora", "Clase"
            }
        ));
        scpane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scpane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scpane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scpane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
