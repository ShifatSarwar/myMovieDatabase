package simplemoviedatabase;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChooseTheatre extends javax.swing.JFrame {

    public ChooseTheatre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chooseLabel = new javax.swing.JLabel();
        jTheatresCombo = new javax.swing.JComboBox<>();
        goToButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        chooseLabel.setBackground(new java.awt.Color(0, 0, 0));
        chooseLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        chooseLabel.setForeground(new java.awt.Color(255, 51, 51));
        chooseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLabel.setText("Choose From Available Theatres");
        chooseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseLabelMouseClicked(evt);
            }
        });

        jTheatresCombo.setBackground(new java.awt.Color(51, 51, 51));
        jTheatresCombo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTheatresCombo.setForeground(new java.awt.Color(255, 255, 255));
        jTheatresCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cineplex", "Blockbuster" }));

        goToButton.setBackground(new java.awt.Color(255, 255, 255));
        goToButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        goToButton.setForeground(new java.awt.Color(153, 153, 153));
        goToButton.setText("Go...");
        goToButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chooseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTheatresCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(goToButton)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(chooseLabel)
                .addGap(18, 18, 18)
                .addComponent(jTheatresCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseLabelMouseClicked
        AdvancedSearch advancenedsearch= new AdvancedSearch();
        advancenedsearch.search();
    }//GEN-LAST:event_chooseLabelMouseClicked

    private void goToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToButtonActionPerformed
       try {
            URI uri;
       
            if(jTheatresCombo.getSelectedItem().toString().equals("Cineplex")) {
                String u="https://www.cineplexbd.com";
                uri=new URI(u);
                java.awt.Desktop.getDesktop().browse(uri);
                this.dispose();
            } else if(jTheatresCombo.getSelectedItem().toString().equals("Blockbuster")) {
                String u="https://blockbusterbd.com";
                uri=new URI(u);
                java.awt.Desktop.getDesktop().browse(uri);
                this.dispose();
            }
            
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(ChooseTheatre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_goToButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseTheatre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseTheatre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JButton goToButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jTheatresCombo;
    // End of variables declaration//GEN-END:variables
}