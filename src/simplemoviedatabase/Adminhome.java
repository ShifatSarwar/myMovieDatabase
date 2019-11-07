package simplemoviedatabase;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Adminhome extends javax.swing.JFrame {
    String currentUser;
    AbstractThings abstractThings=new AbstractThings() {};
    public Adminhome() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        titleset1 = new javax.swing.JLabel();
        titleset2 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        watchedlist = new javax.swing.JLabel();
        watchlist = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        movieTitlefield = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        picturelocationfield = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        retypePasswordLabel = new javax.swing.JLabel();
        addMovieButton = new javax.swing.JButton();
        yearofreleasefield = new javax.swing.JTextField();
        descriptionfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        exitLabel.setBackground(new java.awt.Color(0, 0, 0));
        exitLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(153, 153, 153));
        exitLabel.setText("Exit");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        titleset1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        titleset1.setForeground(new java.awt.Color(255, 255, 255));
        titleset1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleset1.setText("MOVIE");

        titleset2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        titleset2.setForeground(new java.awt.Color(255, 51, 51));
        titleset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        watchedlist.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchedlist.setForeground(new java.awt.Color(153, 153, 153));
        watchedlist.setText("Watchedlist");
        watchedlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchedlistMouseClicked(evt);
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

        logOutLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(153, 153, 153));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Movie Title");

        movieTitlefield.setBackground(new java.awt.Color(0, 0, 0));
        movieTitlefield.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        movieTitlefield.setForeground(new java.awt.Color(204, 204, 204));
        movieTitlefield.setCaretColor(new java.awt.Color(255, 255, 255));
        movieTitlefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                movieTitlefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                movieTitlefieldFocusLost(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Picture File");

        picturelocationfield.setBackground(new java.awt.Color(0, 0, 0));
        picturelocationfield.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        picturelocationfield.setForeground(new java.awt.Color(204, 204, 204));
        picturelocationfield.setCaretColor(new java.awt.Color(255, 255, 255));
        picturelocationfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                picturelocationfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                picturelocationfieldFocusLost(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Year Of Release");

        retypePasswordLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        retypePasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        retypePasswordLabel.setText("Description");

        addMovieButton.setBackground(new java.awt.Color(255, 255, 255));
        addMovieButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        addMovieButton.setForeground(new java.awt.Color(153, 153, 153));
        addMovieButton.setText("Add Movie");
        addMovieButton.setOpaque(false);
        addMovieButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMovieButtonMouseClicked(evt);
            }
        });
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });

        yearofreleasefield.setBackground(new java.awt.Color(0, 0, 0));
        yearofreleasefield.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        yearofreleasefield.setForeground(new java.awt.Color(204, 204, 204));
        yearofreleasefield.setCaretColor(new java.awt.Color(255, 255, 255));

        descriptionfield.setBackground(new java.awt.Color(0, 0, 0));
        descriptionfield.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        descriptionfield.setForeground(new java.awt.Color(204, 204, 204));
        descriptionfield.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel)
                .addGap(93, 93, 93)
                .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(watchedlist)
                .addGap(18, 18, 18)
                .addComponent(watchlist)
                .addGap(14, 14, 14)
                .addComponent(logOutLabel)
                .addGap(138, 138, 138))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(picturelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(movieTitlefield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearofreleasefield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(retypePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(414, 414, 414)
                    .addComponent(addMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(447, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieTitlefield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picturelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearofreleasefield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleset2)
                        .addComponent(titleset1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logOutLabel)
                        .addComponent(watchlist))
                    .addComponent(exitLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(watchedlist))
                        .addComponent(searchbar, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(addMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeto(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void watchlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchlistMouseClicked
        this.dispose();
        abstractThings.openWatchList(currentUser);
    }//GEN-LAST:event_watchlistMouseClicked

    private void watchedlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchedlistMouseClicked
        this.dispose();
        abstractThings.openWatchedList(currentUser);
    }//GEN-LAST:event_watchedlistMouseClicked

    private void movieTitlefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_movieTitlefieldFocusGained

    }//GEN-LAST:event_movieTitlefieldFocusGained

    private void movieTitlefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_movieTitlefieldFocusLost

    }//GEN-LAST:event_movieTitlefieldFocusLost

    private void picturelocationfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_picturelocationfieldFocusGained

    }//GEN-LAST:event_picturelocationfieldFocusGained

    private void picturelocationfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_picturelocationfieldFocusLost

    }//GEN-LAST:event_picturelocationfieldFocusLost

    private void addMovieButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieButtonMouseClicked
        PreparedStatement statement;
        ResultSet resultset;
        String movieTitle = movieTitlefield.getText();
        int yearOfRelease= Integer.parseInt(yearofreleasefield.getText());
        String description = descriptionfield.getText();
        String picturelocation=picturelocationfield.getText();

        if(movieTitle.isEmpty()==true||yearOfRelease==0||description.isEmpty()==true||picturelocation.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "One or more field is empty");
        } else {
            String checkquery="SELECT * FROM `movies` WHERE `TITLE`=?";
            String query="INSERT INTO `movies` (`TITLE`, `PICTURE`, `YEAR`, `DESCRIPTION`) VALUES (?, ?, ?,?)";
                try {
                    statement=DatabaseConnection.getConnection().prepareStatement(checkquery);
                    statement.setString(1, movieTitle);
                    resultset=statement.executeQuery();
                    if(resultset.next()) {
                        JOptionPane.showMessageDialog(null, "Movie cannot be added multiple times.");
                    }else {
                        statement=DatabaseConnection.getConnection().prepareStatement(query);
                        statement.setString(1, movieTitle);
                        statement.setString(2, picturelocation);
                        statement.setInt(3, yearOfRelease);
                        statement.setString(4, description);
                        statement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New Movie Added");
                    }
                }catch (SQLException ex) {
                   Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
               }
            
        }
    }//GEN-LAST:event_addMovieButtonMouseClicked

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed
       
    }//GEN-LAST:event_addMovieButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieButton;
    private javax.swing.JTextField descriptionfield;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JTextField movieTitlefield;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField picturelocationfield;
    private javax.swing.JLabel retypePasswordLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel titleset1;
    private javax.swing.JLabel titleset2;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel watchedlist;
    private javax.swing.JLabel watchlist;
    private javax.swing.JTextField yearofreleasefield;
    // End of variables declaration//GEN-END:variables
}
