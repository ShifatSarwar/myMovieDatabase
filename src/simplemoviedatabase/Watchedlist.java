package simplemoviedatabase;

import java.awt.Color;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Watchedlist extends javax.swing.JFrame {
    String currentUser;
    DefaultListModel dm=new DefaultListModel();
    AbstractThings abstractThings=new AbstractThings() {};

    public Watchedlist() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleset1 = new javax.swing.JLabel();
        titleset2 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        logOutLabel = new javax.swing.JLabel();
        homelabel = new javax.swing.JLabel();
        watchlist = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jwatchedlist = new javax.swing.JList<>();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titleset1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset1.setForeground(new java.awt.Color(255, 255, 255));
        titleset1.setText("MOVIE");

        titleset2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset2.setForeground(new java.awt.Color(255, 51, 51));
        titleset2.setText("DB");

        searchbar.setForeground(new java.awt.Color(153, 153, 153));
        searchbar.setText("Search Movies...");
        searchbar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchbarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchbarFocusLost(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        removeButton.setForeground(new java.awt.Color(153, 153, 153));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        logOutLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(153, 153, 153));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        homelabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        homelabel.setForeground(new java.awt.Color(153, 153, 153));
        homelabel.setText("Home");
        homelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homelabelMouseClicked(evt);
            }
        });

        watchlist.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchlist.setForeground(new java.awt.Color(153, 153, 153));
        watchlist.setText("Watchlist");
        watchlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchlistMouseClicked(evt);
            }
        });

        jwatchedlist.setBackground(new java.awt.Color(0, 0, 0));
        jwatchedlist.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jwatchedlist.setForeground(new java.awt.Color(204, 204, 204));
        jwatchedlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jwatchedlistMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jwatchedlistMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jwatchedlist);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Watchedlist");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addComponent(watchlist)
                        .addGap(18, 18, 18)
                        .addComponent(homelabel)
                        .addGap(18, 18, 18)
                        .addComponent(logOutLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logOutLabel)
                        .addComponent(homelabel)
                        .addComponent(watchlist)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void searchbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchbarFocusGained
        if(searchbar.getText().trim().toLowerCase().equals("search movies...")) {
            searchbar.setText("");
            searchbar.setForeground(Color.black);
        }
    }//GEN-LAST:event_searchbarFocusGained

    private void searchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchbarFocusLost
        if(searchbar.getText().trim().toLowerCase().equals("")) {
            Color customColor = new Color(153,153,255);
            searchbar.setForeground(customColor);
            searchbar.setText("Search movies...");

        }
    }//GEN-LAST:event_searchbarFocusLost

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeto(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void homelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelabelMouseClicked
        this.dispose();    
        abstractThings.goHome(currentUser);
    }//GEN-LAST:event_homelabelMouseClicked

    public void fillList() {
        
        dm.clear();
        String query="SELECT `MOVIE_ID` FROM `watchedlist` WHERE `EMAIL` = ?";
        String result=abstractThings.fillArray(currentUser, query);
        String[] values = result.split(",");
        for(String index:values) {
            String result2=abstractThings.getPicURL(index);
            ImageIcon icon=new ImageIcon("C:\\Users\\Admin\\Downloads\\Movie_Posters\\"+result2);
            Image imagefits =icon.getImage();
            Image imagefitting=imagefits.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
            dm.addElement(new ImageNText(index, new ImageIcon(imagefitting)));      
        }
        jwatchedlist.setCellRenderer(new Renderer());
        jwatchedlist.setModel(dm);
        
    }
    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        try {
            int index=jwatchedlist.getSelectedIndex();
            Object val=jwatchedlist.getSelectedValue();
            ImageNText is=(ImageNText)val;
            Object mName=is.getName();
            String movieName=mName.toString();
            String query="DELETE FROM `watchedlist` WHERE `MOVIE_ID`=? AND `EMAIL`=?";
            abstractThings.removeFromList(currentUser, movieName,query);
            dm.removeElementAt(index);
            JOptionPane.showMessageDialog(null, "Movie removed from list", movieName,2);
        } catch(ArrayIndexOutOfBoundsException e) {}
    }//GEN-LAST:event_removeButtonActionPerformed

    private void watchlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchlistMouseClicked
         this.dispose();
         abstractThings.openWatchList(currentUser);
    }//GEN-LAST:event_watchlistMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String movieName=searchbar.getText();
        boolean found=abstractThings.searchButtonAction(movieName,currentUser);
        if(found) {      
            this.dispose();    
        } else {
            JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jwatchedlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jwatchedlistMouseClicked
        if (evt.getClickCount()==2 ){
            Object val=jwatchedlist.getSelectedValue();
            ImageNText is=(ImageNText)val;
            Object mName=is.getName();
            String movieName=mName.toString();
            boolean found=abstractThings.searchButtonAction(movieName,currentUser);
            if(found) {      
                this.dispose();    
            } else {
               JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
            }
        }
    }//GEN-LAST:event_jwatchedlistMouseClicked

    private void jwatchedlistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jwatchedlistMousePressed

    }//GEN-LAST:event_jwatchedlistMousePressed

   
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
            java.util.logging.Logger.getLogger(Watchedlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Watchedlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Watchedlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Watchedlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Watchedlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jwatchedlist;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel titleset1;
    private javax.swing.JLabel titleset2;
    private javax.swing.JLabel watchlist;
    // End of variables declaration//GEN-END:variables
}
