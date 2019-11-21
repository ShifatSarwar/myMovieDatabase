package simplemoviedatabase;

import java.util.ArrayList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.web.WebView;
import javax.swing.DefaultListModel;

public class TrailerList extends javax.swing.JFrame {
    DefaultListModel dm=new DefaultListModel();
    String url;
    boolean track=false;
    AbstractThings abstractThings=new AbstractThings() {};
    public TrailerList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chooseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtrailerList = new javax.swing.JList<>();
        backORrepostLabel = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        chooseLabel.setBackground(new java.awt.Color(0, 0, 0));
        chooseLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        chooseLabel.setForeground(new java.awt.Color(255, 51, 51));
        chooseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLabel.setText("Choose Trailer to Watch");

        jtrailerList.setBackground(new java.awt.Color(0, 0, 0));
        jtrailerList.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jtrailerList.setForeground(new java.awt.Color(204, 204, 204));
        jtrailerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jtrailerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtrailerListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtrailerListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtrailerList);

        backORrepostLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        backORrepostLabel.setForeground(new java.awt.Color(255, 255, 255));
        backORrepostLabel.setText("Get back to Comments...");
        backORrepostLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backORrepostLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backORrepostLabelMouseClicked(evt);
            }
        });

        goBack.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        goBack.setForeground(new java.awt.Color(255, 255, 255));
        goBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goBack.setText("Dismiss Trailer Page");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(backORrepostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(chooseLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(backORrepostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtrailerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtrailerListMouseClicked
        if (evt.getClickCount()==2 ) {
            abstractThings.deleteTempData();
            int value=jtrailerList.getSelectedIndex();
            ArrayList<String> trailerkeys=abstractThings.getTrailersKey(url); 
          //  abstractThings.playTrailer(trailerkeys.get(value));
            abstractThings.setTempTable(jtrailerList.getSelectedValue(),trailerkeys.get(value));
            Trailer t=new Trailer();
            new Thread((Runnable) t).start();
            track=true;
          //  t.launchMediaPlayer(); 
        }
    }//GEN-LAST:event_jtrailerListMouseClicked

    private void jtrailerListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtrailerListMousePressed

    }//GEN-LAST:event_jtrailerListMousePressed

    private void backORrepostLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backORrepostLabelMouseClicked

    }//GEN-LAST:event_backORrepostLabelMouseClicked

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
       this.dispose();
    }//GEN-LAST:event_goBackMouseClicked
    
    public void fillList() {
        jtrailerList.setModel(dm);
        ArrayList<String> trailerName=abstractThings.getTrailersName(url);
        for(String index:trailerName) {
            dm.addElement(index);      
        }
    }
     
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
            java.util.logging.Logger.getLogger(TrailerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrailerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrailerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrailerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrailerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backORrepostLabel;
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jtrailerList;
    // End of variables declaration//GEN-END:variables
}
