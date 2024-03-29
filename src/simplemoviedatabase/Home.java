package simplemoviedatabase;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    String currentUser;
    AbstractThings abstractThings=new AbstractThings() {};
  
    public Home() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleset1 = new javax.swing.JLabel();
        titleset2 = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        watchlist = new javax.swing.JLabel();
        watchedMovies = new javax.swing.JLabel();
        theatres = new javax.swing.JLabel();
        advanceSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titleset1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset1.setForeground(new java.awt.Color(255, 255, 255));
        titleset1.setText("MOVIE");

        titleset2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset2.setForeground(new java.awt.Color(255, 51, 51));
        titleset2.setText("DB");

        logOutLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(153, 153, 153));
        logOutLabel.setText("Log Out");
        logOutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        exitLabel.setBackground(new java.awt.Color(0, 0, 0));
        exitLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(153, 153, 153));
        exitLabel.setText("Exit");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

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

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        watchlist.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchlist.setForeground(new java.awt.Color(153, 153, 153));
        watchlist.setText("Watchlist");
        watchlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        watchlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchlistMouseClicked(evt);
            }
        });

        watchedMovies.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchedMovies.setForeground(new java.awt.Color(153, 153, 153));
        watchedMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        watchedMovies.setText("Watched Movies");
        watchedMovies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        watchedMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchedMoviesMouseClicked(evt);
            }
        });

        theatres.setBackground(new java.awt.Color(0, 0, 0));
        theatres.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        theatres.setForeground(new java.awt.Color(255, 255, 255));
        theatres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theatres.setText("Movies Available In Theatres");
        theatres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theatres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theatresMouseClicked(evt);
            }
        });

        advanceSearch.setBackground(new java.awt.Color(0, 0, 0));
        advanceSearch.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        advanceSearch.setForeground(new java.awt.Color(255, 51, 51));
        advanceSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advanceSearch.setText("Advanced Search");
        advanceSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        advanceSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advanceSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logOutLabel)
                .addGap(39, 39, 39)
                .addComponent(exitLabel)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(watchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(watchedMovies))
                                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(theatres, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(advanceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watchedMovies)
                    .addComponent(watchlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(theatres)
                .addGap(18, 18, 18)
                .addComponent(advanceSearch)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeto(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String movieName=searchbar.getText();
        boolean found=abstractThings.searchButtonAction(movieName,currentUser);
        if(found) {      
            this.dispose();    
        } else {
            JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void watchlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchlistMouseClicked
         this.dispose();
         abstractThings.openWatchList(currentUser);
    }//GEN-LAST:event_watchlistMouseClicked

    private void watchedMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchedMoviesMouseClicked
         this.dispose();
         abstractThings.openWatchedList(currentUser);
    }//GEN-LAST:event_watchedMoviesMouseClicked

    private void theatresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theatresMouseClicked
        ChooseTheatre choosetheatre=new ChooseTheatre();
        choosetheatre.setVisible(true);
        choosetheatre.pack();
        choosetheatre.setLocationRelativeTo(null);
        choosetheatre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }//GEN-LAST:event_theatresMouseClicked

    private void advanceSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advanceSearchMouseClicked
        AdvancedSearch advancenedsearch= new AdvancedSearch();
       advancenedsearch.search();
    }//GEN-LAST:event_advanceSearchMouseClicked


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advanceSearch;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel theatres;
    private javax.swing.JLabel titleset1;
    private javax.swing.JLabel titleset2;
    private javax.swing.JLabel watchedMovies;
    private javax.swing.JLabel watchlist;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
