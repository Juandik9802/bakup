/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

/**
 *
 * @author Eduardo Jimenez
 */
public class menu extends javax.swing.JPanel {

    /**
     * Creates new form menu
     */
    public menu() {
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

        gruposMenu = new javax.swing.ButtonGroup();
        icono_menu = new javax.swing.JLabel();
        menuDia = new javax.swing.JRadioButton();
        menuSemana = new javax.swing.JRadioButton();
        contenedorMenus = new javax.swing.JTabbedPane();

        icono_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/menu.jpg"))); // NOI18N

        gruposMenu.add(menuDia);
        menuDia.setText("Menu Dia");
        menuDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDiaActionPerformed(evt);
            }
        });

        gruposMenu.add(menuSemana);
        menuSemana.setText("Menu Semana");
        menuSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSemanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_menu)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(menuDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(menuSemana)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contenedorMenus)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuDia)
                    .addComponent(menuSemana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedorMenus))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSemanaActionPerformed
        panelmenu1();
    }//GEN-LAST:event_menuSemanaActionPerformed

    private void menuDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDiaActionPerformed
        panelmenu();
    }//GEN-LAST:event_menuDiaActionPerformed
    menuSemana menu1;
    menuDia menu;
    String vp1="0",vp2="0";
    
    private void panelmenu(){
        if (vp1.equals("0")){
            menu=new menuDia();
            contenedorMenus.addTab("Menu del Dia", menu);
            contenedorMenus.setSelectedComponent(menu);
        }else{
            contenedorMenus.setSelectedComponent(menu);
        }
        vp1="1";
    }
    private void panelmenu1(){
        if (vp2.equals("0")){
            menu1=new menuSemana();
            contenedorMenus.addTab("Menu de la Semana", menu1);
            contenedorMenus.setSelectedComponent(menu1);
        }else{
            contenedorMenus.setSelectedComponent(menu1);
        }
        vp2="1";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane contenedorMenus;
    private javax.swing.ButtonGroup gruposMenu;
    private javax.swing.JLabel icono_menu;
    private javax.swing.JRadioButton menuDia;
    private javax.swing.JRadioButton menuSemana;
    // End of variables declaration//GEN-END:variables
}
