package proyectoprogramacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class InterfazReporte extends javax.swing.JFrame {
    
    private Conexion conectarReporte;

    public InterfazReporte() {
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
        conectarReporte.connect();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloReporte = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        btnVolverReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloReporte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloReporte.setText("Reporte");

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Numero", "Cant. Personas", "Noches", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReporte.setName(""); // NOI18N
        jScrollPane2.setViewportView(tbReporte);

        btnVolverReporte.setText("Volver");
        btnVolverReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lblTituloReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverReporte)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTituloReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverReporte)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverReporteActionPerformed
        // TODO add your handling code here:
        InterfazReporte.this.setVisible(false);
        InterfazMenu menu4 = new InterfazMenu();
    }//GEN-LAST:event_btnVolverReporteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazReporte().setVisible(true);
            }
        });
    }
    
    public void fillTable(){
        String sql = "SELECT H.NOMBRE,H.DNI,A.NUMERO,A.CANTPERS,R.TIEMPO,A.PREXNOC * R.TIEMPO AS TOTAL " + 
                     "FROM HUESPED H,HABITACION A,RESERVA R " + 
                     "WHERE R.NUMERO = A.NUMERO AND R.DNI = H.DNI";
        
        try (Connection conn = Conexion.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            ResultSet rs  = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbReporte.getModel();
            
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString(1), 
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4), 
                            rs.getString(5),
                            rs.getString(6)
                        }
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverReporte;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JTable tbReporte;
    // End of variables declaration//GEN-END:variables
}
