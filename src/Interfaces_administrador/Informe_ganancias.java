/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.archivoFacturados;
import java.text.MessageFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class Informe_ganancias extends javax.swing.JPanel {

    DefaultTableModel model;
    String cant_vendida = " ";
    private int total_por_mesa;
    private int pago_meseros;
    private int pago_platos;
    private int ganancias;
    Timer timer;
    TimerTask timerTask;

    /**
     * Creates new form Informe_ganancias
     */
    public Informe_ganancias() {
        initComponents();
        iniciar_tabla();
        insertar_fila();
        obtener_tabla();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                iniciar_tabla();
                insertar_fila();
                obtener_tabla();

            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 10000, 10000);

        //    incertarColunas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        generar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ganancia = new javax.swing.JTextField();

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datos);

        generar.setText("Generar PDF");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N

        jLabel2.setText("Total:");

        ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generar)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        MessageFormat Header = new MessageFormat("Ganancias");
        MessageFormat footer = new MessageFormat("Programación II");
        try {
            datos.print(JTable.PrintMode.NORMAL, Header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.out.println("Error al crear el archivo. " + ex);
        }
    }//GEN-LAST:event_generarActionPerformed

    private void gananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciaActionPerformed

    private void iniciar_tabla() {
        model = new DefaultTableModel();
        model.addColumn("Mesa");
        model.addColumn("Numero de platos por mesa");
        model.addColumn("Mesero");
        model.addColumn("Total");
        datos.setModel(model);
    }

    private void insertar_fila() {
        for (codigo.facturacion object : archivoFacturados.facturados) {
            String[] agregar = new String[4];
            agregar[0] = String.valueOf(object.getNumero());
            agregar[1] = String.valueOf(object.getPlatos().size());
            agregar[2] = object.getNombre();
            agregar[3] = String.valueOf(object.getCantidadPaga());
            model.addRow(agregar);
        }
    }

    private void obtener_tabla() {
       
        String valores="";
        int fila = datos.getRowCount();
        int total_por_mesa = 0;
        for (int i = 0; i < fila; i++) {
            int valor = Integer.parseInt((String) datos.getValueAt(i, 3));
            total_por_mesa = total_por_mesa + valor;
        }
        valores += total_por_mesa;        
        ganancia.setText(valores);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datos;
    private javax.swing.JTextField ganancia;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
