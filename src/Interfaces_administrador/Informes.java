/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

/**
 *
 * @author josep
 */
public class Informes extends javax.swing.JPanel {

    /**
     * Creates new form Informes
     */
    public Informes() {
        initComponents();

    }

    Interfaces_administrador.Informe_modos_de_pago panelpagos;
    Interfaces_administrador.Informe_platos panelplatos;
    Interfaces_administrador.Informe_meseros panelmeseros;
    Interfaces_administrador.Informe_tiempo paneltiempos;
    Interfaces_administrador.Informe_pagos_mes panel_pago_mes;
    Interfaces_administrador.Informe_ganancias panel_ganancia;
    Interfaces_administrador.Informe_Inventario panel_inventario;
    Interfaces_administrador.Informe_Cantidad panel_cantidad;

    private String vp1 = "0";
    private String vp2 = "0";
    private String vp3 = "0";
    private String vp4 = "0";
    private String vp5 = "0";
    private String vp6 = "0";
    private String vp7 = "0";
    private String vp8 = "0";

    private void Abrir_pagos() {
        if (vp1.equals("0")) {
            panelpagos = new Interfaces_administrador.Informe_modos_de_pago();
            principal_informes.addTab("Informe de pagos", panelpagos);
            principal_informes.setSelectedComponent(panelpagos);
        } else {
            principal_informes.setSelectedComponent(panelpagos);
        }
        vp1 = "1";
    }

    private void Abrir_platos() {
        if (vp2.equals("0")) {
            panelplatos = new Interfaces_administrador.Informe_platos();
            principal_informes.addTab("Platos del día", panelplatos);
            principal_informes.setSelectedComponent(panelplatos);
        } else {
            principal_informes.setSelectedComponent(panelplatos);
        }
        vp2 = "1";
    }

    private void Abrir_meseros() {
        if (vp3.equals("0")) {
            panelmeseros = new Interfaces_administrador.Informe_meseros();
            principal_informes.addTab("Informes meseros", panelmeseros);
            principal_informes.setSelectedComponent(panelmeseros);
        } else {
            principal_informes.setSelectedComponent(panelmeseros);
        }
        vp3 = "1";
    }

    private void Abrir_tiempo() {
        if (vp4.equals("0")) {
            paneltiempos = new Interfaces_administrador.Informe_tiempo();
            principal_informes.addTab("Informes tiempo", paneltiempos);
            principal_informes.setSelectedComponent(paneltiempos);
        } else {
            principal_informes.setSelectedComponent(paneltiempos);
        }
        vp4 = "1";
    }

    private void Abrir_pagos_mes() {
        if (vp5.equals("0")) {
            panel_pago_mes = new Interfaces_administrador.Informe_pagos_mes();
            principal_informes.addTab("Informes de pagos en el mes", panel_pago_mes);
            principal_informes.setSelectedComponent(panel_pago_mes);
        } else {
            principal_informes.setSelectedComponent(panel_pago_mes);
        }
        vp5 = "1";
    }

    private void Abrir_ganancia() {
        if (vp6.equals("0")) {
            panel_ganancia = new Interfaces_administrador.Informe_ganancias();
            principal_informes.addTab("Informes de ganancias", panel_ganancia);
            principal_informes.setSelectedComponent(panel_ganancia);
        } else {
            principal_informes.setSelectedComponent(panel_ganancia);
        }
        vp6 = "1";
    }

    private void Abrir_inventario() {
        if (vp7.equals("0")) {
            panel_inventario = new Interfaces_administrador.Informe_Inventario();
            principal_informes.addTab("Porciones", panel_inventario);
            principal_informes.setSelectedComponent(panel_inventario);
        } else {
            principal_informes.setSelectedComponent(panel_inventario);
        }
        vp7 = "1";
    }

    private void Abrir_cantidad() {
        if (vp8.equals("0")) {
            panel_cantidad = new Interfaces_administrador.Informe_Cantidad();
            principal_informes.addTab("Cantida de postres vendidos", panel_cantidad);
            principal_informes.setSelectedComponent(panel_cantidad);
        } else {
            principal_informes.setSelectedComponent(panel_cantidad);
        }
        vp8 = "1";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal_informes = new javax.swing.JTabbedPane();
        modo_pago = new javax.swing.JButton();
        platos_dia = new javax.swing.JButton();
        informe_meseros = new javax.swing.JButton();
        informe_tiempo = new javax.swing.JButton();
        informe_pago_mes = new javax.swing.JButton();
        Ingresos = new javax.swing.JButton();
        adiciones = new javax.swing.JButton();
        platos_mes = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modo_pago.setText("Modo de pago");
        modo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modo_pagoActionPerformed(evt);
            }
        });

        platos_dia.setText("Platos pedidos en el dia");
        platos_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platos_diaActionPerformed(evt);
            }
        });

        informe_meseros.setText("Meseros");
        informe_meseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe_meserosActionPerformed(evt);
            }
        });

        informe_tiempo.setText("Tiempos");
        informe_tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe_tiempoActionPerformed(evt);
            }
        });

        informe_pago_mes.setText("Postres vendidos");
        informe_pago_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe_pago_mesActionPerformed(evt);
            }
        });

        Ingresos.setText("Ingresos");
        Ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresosActionPerformed(evt);
            }
        });

        adiciones.setText("Porciones ");
        adiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionesActionPerformed(evt);
            }
        });

        platos_mes.setText("Platos mes");
        platos_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platos_mesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(modo_pago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(platos_dia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informe_meseros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informe_tiempo)
                .addGap(18, 18, 18)
                .addComponent(informe_pago_mes)
                .addGap(18, 18, 18)
                .addComponent(Ingresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(platos_mes)
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal_informes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modo_pago)
                    .addComponent(platos_dia)
                    .addComponent(informe_meseros)
                    .addComponent(informe_tiempo)
                    .addComponent(informe_pago_mes)
                    .addComponent(Ingresos)
                    .addComponent(adiciones)
                    .addComponent(platos_mes))
                .addGap(18, 18, 18)
                .addComponent(principal_informes, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modo_pagoActionPerformed
        Abrir_pagos();
    }//GEN-LAST:event_modo_pagoActionPerformed

    private void platos_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platos_diaActionPerformed
        Abrir_platos();
    }//GEN-LAST:event_platos_diaActionPerformed

    private void informe_meserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe_meserosActionPerformed
        Abrir_meseros();
    }//GEN-LAST:event_informe_meserosActionPerformed

    private void informe_tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe_tiempoActionPerformed
        // TODO add your handling code here:
        Abrir_tiempo();
    }//GEN-LAST:event_informe_tiempoActionPerformed

    private void informe_pago_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe_pago_mesActionPerformed
        Abrir_pagos_mes();
    }//GEN-LAST:event_informe_pago_mesActionPerformed

    private void IngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresosActionPerformed
        Abrir_ganancia();
    }//GEN-LAST:event_IngresosActionPerformed

    private void adicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionesActionPerformed
        Abrir_inventario();
    }//GEN-LAST:event_adicionesActionPerformed

    private void platos_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platos_mesActionPerformed
        Abrir_cantidad();
    }//GEN-LAST:event_platos_mesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresos;
    private javax.swing.JButton adiciones;
    private javax.swing.JButton informe_meseros;
    private javax.swing.JButton informe_pago_mes;
    private javax.swing.JButton informe_tiempo;
    private javax.swing.JButton modo_pago;
    private javax.swing.JButton platos_dia;
    private javax.swing.JButton platos_mes;
    private javax.swing.JTabbedPane principal_informes;
    // End of variables declaration//GEN-END:variables

}
