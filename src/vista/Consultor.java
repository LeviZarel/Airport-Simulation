/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Pais;

/**
 *
 * @author Ariel
 */
public class Consultor extends javax.swing.JFrame {

    /**
     * Creates new form Consultor
     */
    private Pais pais;
    private String granString="";
    public Consultor(Pais pais) {
        this.pais=pais;
        initComponents();
    }
    
    public void mostrarAeropuertosConAviones(){
        granString+=pais.printAeropuertos();
        areaResp.setText(granString);
    }
    public void mostrarAeropuertos(){
        granString+=" Aeropuerto de La Paz\n Aeropuerto de Cochabamba\n Aeropuerto de Santa Cruz"
                + "\n Aeropuerto de Trinidad\n Aeropuerto de Cobija\n Aeropuerto de Sucre\n Aeropuerto de Tarija\n";
        areaResp.setText(granString);
    }
    public void mostrarBoletos(){
       granString+=pais.printBoletos();
       areaResp.setText(granString);
    }
    public void mostrarPasajeros(){
        granString+=pais.printPasajeros();
        areaResp.setText(granString);
    }
    public void limpiar(){
        granString="";
        areaResp.setText(granString);
    }
    public void cantidadDePasajeros(){
        granString+="\nLa cantidad de pasajeros registrados es "+(pais.getPasajerosConBoleto().size()+pais.getPasajeros().size());
        areaResp.setText(granString);
    }
    public void cantidadAviones(){
        granString+="\nLa cantidad de Aviones registrados es "+pais.getCantAviones();
        areaResp.setText(granString);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cajaConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResp = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultor");

        jLabel1.setText("Consulta");

        areaResp.setEditable(false);
        areaResp.setColumns(20);
        areaResp.setRows(5);
        jScrollPane1.setViewportView(areaResp);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String consulta=cajaConsulta.getText().toLowerCase();
        
        if(consulta.contains("cantidad")&&consulta.contains("aviones")){
            cantidadAviones();
        }
        else if(/*consulta.contains("aeropuertos")&&*/consulta.contains("aviones"))
            mostrarAeropuertosConAviones();
        if(consulta.contains("aeropuerto"))
            mostrarAeropuertos();
        if(consulta.contains("boletos"))
            mostrarBoletos();
        if(consulta.contains("cantidad")&&consulta.contains("pasajeros")){
            cantidadDePasajeros();
        }
        else if(consulta.contains("pasajeros"))
            mostrarPasajeros();
        if(consulta.contains("borrar")||consulta.contains("eliminar")||consulta.contains("limpiar")||consulta.contains("vaciar"))
            limpiar();
        if(consulta.contains("borra")||consulta.contains("elimina")||consulta.contains("limpia")||consulta.contains("vacia"))
            limpiar();
        
    }//GEN-LAST:event_btnConsultarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResp;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JTextField cajaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
