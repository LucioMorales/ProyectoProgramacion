package proyectoprogramacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class InterfazReserva extends javax.swing.JFrame {
    private Conexion conectarReserva;
        
    public InterfazReserva() {
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
        conectarReserva.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelReserva = new javax.swing.JButton();
        tfDNIReserva = new javax.swing.JTextField();
        lblNumeroReserva = new javax.swing.JLabel();
        lblDNIReserva = new javax.swing.JLabel();
        lblNoches = new javax.swing.JLabel();
        tftiempor = new javax.swing.JTextField();
        lblTituloReserva = new javax.swing.JLabel();
        btnNextReserva = new javax.swing.JButton();
        lblCantPers = new javax.swing.JLabel();
        cbNroHabitacion = new javax.swing.JComboBox<>();
        cbPersonas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancelReserva.setText("Volver");
        btnCancelReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReservaActionPerformed(evt);
            }
        });

        lblNumeroReserva.setText("Numero de Habitacion:");

        lblDNIReserva.setText("DNI:");

        lblNoches.setText("Cantidad de Noches:");

        lblTituloReserva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloReserva.setText("Reserva");

        btnNextReserva.setText("Finalizar");
        btnNextReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextReservaActionPerformed(evt);
            }
        });

        lblCantPers.setText("Cantidad de Personas :");

        cbPersonas.setMaximumRowCount(4);
        cbPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextReserva)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTituloReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDNIReserva)
                                    .addComponent(lblNoches))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblCantPers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNumeroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDNIReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(tftiempor, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(cbNroHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPersonas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantPers)
                    .addComponent(cbPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroReserva)
                    .addComponent(cbNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDNIReserva, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDNIReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftiempor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoches))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextReserva)
                    .addComponent(btnCancelReserva))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReservaActionPerformed
        // TODO add your handling code here:
        InterfazReserva.this.setVisible(false);
        InterfazMenu menu2 = new InterfazMenu();
    }//GEN-LAST:event_btnCancelReservaActionPerformed

    private void btnNextReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextReservaActionPerformed
        // TODO add your handling code here:
        int textTiempo = Integer.parseInt(tftiempor.getText());
        int textDniReserva = Integer.parseInt(tfDNIReserva.getText());
        int tfNroReserva = Integer.parseInt((String) cbNroHabitacion.getSelectedItem());
        insert(textDniReserva,tfNroReserva,textTiempo);
        InterfazReserva.this.setVisible(false);
        InterfazMenu menu3 = new InterfazMenu();
    }//GEN-LAST:event_btnNextReservaActionPerformed

    private void cbPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonasActionPerformed
        // TODO add your handling code here:
        int item = Integer.parseInt((String) cbPersonas.getSelectedItem());
        cbNroHabitacion.setModel(fillCombo(item));
    }//GEN-LAST:event_cbPersonasActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazReserva().setVisible(true);
            }
        });
    }
    
    public void insert(int DNI,int NUMERO,int TIEMPO) {
        String sql = "INSERT INTO RESERVA(DNI,NUMERO,TIEMPO) VALUES(?,?,?)";
 
        try (Connection conn = Conexion.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, DNI);
            pstmt.setInt(2, NUMERO);
            pstmt.setInt(3, TIEMPO);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public DefaultComboBoxModel fillCombo(int CANTPERS){
        String[] nrohabitacion = null;
        String sql = "SELECT A.NUMERO FROM HABITACION A " +
                     "WHERE NOT EXISTS (" +
                     "SELECT NUMERO FROM RESERVA R WHERE A.NUMERO = R.NUMERO) AND A.CANTPERS =  ? ";
        try (Connection conn = Conexion.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, CANTPERS);
            
            ResultSet rs  = pstmt.executeQuery();
            List <String> habdisponibles = new ArrayList<>();
            
            while (rs.next()) {
                habdisponibles.add(rs.getString("NUMERO"));
            }
            nrohabitacion = new String[habdisponibles.size()];
            nrohabitacion = habdisponibles.toArray(nrohabitacion);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return new javax.swing.DefaultComboBoxModel<>(nrohabitacion);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelReserva;
    private javax.swing.JButton btnNextReserva;
    private javax.swing.JComboBox<String> cbNroHabitacion;
    private javax.swing.JComboBox<String> cbPersonas;
    private javax.swing.JLabel lblCantPers;
    private javax.swing.JLabel lblDNIReserva;
    private javax.swing.JLabel lblNoches;
    private javax.swing.JLabel lblNumeroReserva;
    private javax.swing.JLabel lblTituloReserva;
    private javax.swing.JTextField tfDNIReserva;
    private javax.swing.JTextField tftiempor;
    // End of variables declaration//GEN-END:variables
}
