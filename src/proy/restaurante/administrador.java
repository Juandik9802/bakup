/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

/**
 *
 * @author josep
 */
public class administrador extends javax.swing.JFrame {

    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        Abrir_panel1();
        Abrir_panel2();
        Abrir_panel3();
    }
    Interfaces.mesas panel1;
    Interfaces.menu panel2;
    Interfaces.Informes panel3;
    
    public String vp1="0";
    public String vp2="0";
    public String vp3="0";
    
    private void Abrir_panel1(){
        if(vp1.equals("0")){
        panel1=new Interfaces.mesas();
        principal.addTab("cantidad mesas", panel1);
        principal.setSelectedComponent(panel1);
        }else{
        principal.setSelectedComponent(panel1);
        }
        vp1="1";
    }
    private void Abrir_panel2(){
        if(vp2.equals("0")){
        panel2=new Interfaces.menu();
        principal.addTab("menu", panel2);
        principal.setSelectedComponent(panel2);
        }else{
        principal.setSelectedComponent(panel2);
        }
        vp2="1";
    }
    private void Abrir_panel3(){
        if(vp3.equals("0")){
        panel3=new Interfaces.Informes();
        principal.addTab("Informes", panel3);
        principal.setSelectedComponent(panel3);
        }else{
        principal.setSelectedComponent(panel3);
        }
        vp3="1";
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
        cantidad_mesas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        cantidad_mesas.setText("jButton1");
        cantidad_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_mesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cantidad_mesas))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cantidad_mesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidad_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_mesasActionPerformed
        Abrir_panel1();
    }//GEN-LAST:event_cantidad_mesasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        administrador obt =new administrador();
        obt.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cantidad_mesas;
    private javax.swing.JTabbedPane principal;
    // End of variables declaration//GEN-END:variables
}
