/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

import Interfaces_administrador.*;

/**
 *@author Juan Diego
 * @author josep
 */
public class administrador extends javax.swing.JFrame {

    
    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        Abrir_panel1();
        Abrir_panel6();
        Abrir_panel3();
        Abrir_panel5();
        Abrir_panel7();
        Abrir_panel4();
        Abrir_panel2();
        
    }
    mesas panel1;
    menu panel4;
    Informes panel2;
    meseros panel3;
    platos plato;
    muestraMenuSemana menu;
    InterfasListaMeseros listamesero;
    
    private String vp1="0";
    private String vp2="0";
    private String vp3="0";
    private String vp4="0",vp5="0";
    
    private void Abrir_panel1(){
        if(vp1.equals("0")){
        panel1=new Interfaces_administrador.mesas();
        principal.addTab("Cantidad mesas", panel1);
        principal.setSelectedComponent(panel1);
        }else{
        principal.setSelectedComponent(panel1);
        }
        vp1="1";
    }    
    private void Abrir_panel4(){
        if(vp4.equals("0")){
        panel4=new Interfaces_administrador.menu();
        principal.addTab("Creacion de Menu", panel4);
        //principal.setSelectedComponent(panel4);
        }else{
        principal.setSelectedComponent(panel4);
        }
        vp4="1";
    }
    private void Abrir_panel2(){
        if(vp2.equals("0")){
        panel2=new Interfaces_administrador.Informes();
        principal.addTab("Informes", panel2);
        //principal.setSelectedComponent(panel2);
        }else{
        principal.setSelectedComponent(panel2);
        }
        vp2="1";
    }
    private void Abrir_panel3(){
        if(vp3.equals("0")){
        panel3=new Interfaces_administrador.meseros();
        principal.addTab("Añadir Mesero", panel3);
        //principal.setSelectedComponent(panel3);
        }else{
        principal.setSelectedComponent(panel3);
        }
        vp3="1";
    }    
    private void Abrir_panel5(){
        if(vp5.equals("0")){
        plato=new Interfaces_administrador.platos();
        principal.addTab("Agregar platillos", plato);
        //principal.setSelectedComponent(plato);
        }else{
        principal.setSelectedComponent(plato);
        }
        vp1="5";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane principal;
    // End of variables declaration//GEN-END:variables
    String vpl6="0";
    private void Abrir_panel6() {
        if(vpl6.equals("0")){
            listamesero=new InterfasListaMeseros();
            principal.addTab("Lista de Meseros", listamesero);
        }else{
            principal.setSelectedComponent(panel1);
        }
        vpl6="1";
    }
    String vpl7="0";
    private void Abrir_panel7() {
        if(vpl7.equals("0")){
            menu=new muestraMenuSemana();
            principal.addTab("Ver menu", menu);
        }else{
            principal.setSelectedComponent(menu);
        }
        vpl7="1";
    }
}
