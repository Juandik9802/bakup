package interfaces_caja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;

/**
 *
 * @author Eduardo Jimenez
 */
public class pago_efectivo extends javax.swing.JFrame {

    String valores = "";
    JTable tabla_pedido;
    int numero, pago;

    ;

    /**
     * Creates new form pago_efectivo
     *
     * @param tablaPedido
     */
    public pago_efectivo(JTable tablaPedido, String nombre, String fechaPedido, String fechaEntrega, int num) {
        this.nombre = nombre;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.numero = num;
        this.setTitle("Efectivo");
        initComponents();
        this.setLocationRelativeTo(null);
        tabla_pedido = tablaPedido;
        obtener_tabla();
        pago = Integer.parseInt(cant_pagar.getText());
    }

    private void obtener_tabla() {
        int fila = tabla_pedido.getRowCount();
        int total_por_mesa = 0;
        for (int i = 0; i < fila; i++) {
            int valor = (int) tabla_pedido.getValueAt(i, 1);
            total_por_mesa = total_por_mesa + valor;
        }
        valores += total_por_mesa;
        cant_pagar.setText(valores);
        //JOptionPane.showMessageDialog(null, "valores de la columna1: " + valores);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cant_recibida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        facturar = new javax.swing.JButton();
        cant_pagar = new javax.swing.JTextField();
        vueltas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText(" efectivo");

        jLabel3.setText("cantidad a pagar:");

        cant_recibida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_recibidaActionPerformed(evt);
            }
        });

        jLabel5.setText("cantidad recibida:");

        jLabel6.setText("cantidad a devolver:");

        facturar.setText("Aceptar");
        facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarActionPerformed(evt);
            }
        });

        cant_pagar.setEditable(false);

        vueltas.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cant_recibida, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cant_pagar)
                            .addComponent(vueltas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_recibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vueltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(facturar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> platos = new ArrayList();

    private void optenerPlatos() {
        int fila = tabla_pedido.getRowCount();
        for (int i = 0; i < fila; i++) {
            platos.add((String) tabla_pedido.getValueAt(i, 0));
            // Con esta condición solo ponemos comas hasta el penúltimo valor :)
        }
    }

    String fechaPedido, fechaEntrega, fechaFacturado;

    private void tomarFecha() {
        Calendar calendario = Calendar.getInstance();
        fechaFacturado = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));//tomar la hora del sistema
        fechaFacturado = fechaFacturado + ";" + String.valueOf(calendario.get(Calendar.MINUTE));
    }

    private void cant_recibidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_recibidaActionPerformed
        int cantidad_pagar = Integer.parseInt(cant_pagar.getText());
        int cantidad_recibida = Integer.parseInt(cant_recibida.getText());
        int cambio = cantidad_recibida - cantidad_pagar;
        String cambio1 = Integer.toString(cambio);
        vueltas.setText(cambio1);
    }//GEN-LAST:event_cant_recibidaActionPerformed
    private final String nombre;
    
    private void facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarActionPerformed
        optenerPlatos();
        tomarFecha();
        codigo.archivoFacturados.añadir(numero, this.getTitle(), platos, fechaPedido, fechaEntrega, fechaFacturado, nombre, pago);
        codigo.archivoFacturados.escribir();
        codigo.archivoPedido.eliminarRegistro(numero);
        codigo.archivoEntregados.eliminarRegistro(numero);
    }//GEN-LAST:event_facturarActionPerformed

    private void facturaPDF() {
        MessageFormat Header = new MessageFormat("Mesa " + numero);
        MessageFormat footer = new MessageFormat("Page[0,number,integer]");
        try {
            tabla_pedido.print(JTable.PrintMode.NORMAL, Header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.out.println("Error al crear el archivo. " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cant_pagar;
    private javax.swing.JTextField cant_recibida;
    private javax.swing.JButton facturar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField vueltas;
    // End of variables declaration//GEN-END:variables

}
