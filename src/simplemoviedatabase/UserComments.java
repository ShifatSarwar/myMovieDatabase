package simplemoviedatabase;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserComments extends javax.swing.JFrame {
    String currentUser;
    String movieTitle;
    DefaultListModel dm=new DefaultListModel();
    AbstractThings abstractThings=new AbstractThings() {};

    public UserComments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleset2 = new javax.swing.JLabel();
        titleset1 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        commentButton = new javax.swing.JButton();
        watchlist = new javax.swing.JLabel();
        homelabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jcommentlist = new javax.swing.JList<>();
        watchedlist = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        posterLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titleset2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        titleset2.setForeground(new java.awt.Color(255, 51, 51));
        titleset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleset2.setText("DB");

        titleset1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        titleset1.setForeground(new java.awt.Color(255, 255, 255));
        titleset1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleset1.setText("MOVIE");

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

        commentButton.setBackground(new java.awt.Color(255, 255, 255));
        commentButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        commentButton.setForeground(new java.awt.Color(153, 153, 153));
        commentButton.setText("Comment");
        commentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentButtonMouseClicked(evt);
            }
        });
        commentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentButtonActionPerformed(evt);
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

        homelabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        homelabel.setForeground(new java.awt.Color(153, 153, 153));
        homelabel.setText("Home");
        homelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homelabelMouseClicked(evt);
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

        jcommentlist.setBackground(new java.awt.Color(0, 0, 0));
        jcommentlist.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jcommentlist.setForeground(new java.awt.Color(204, 204, 204));
        jcommentlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jcommentlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcommentlistMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcommentlistMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jcommentlist);

        watchedlist.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchedlist.setForeground(new java.awt.Color(153, 153, 153));
        watchedlist.setText("Watchedlist");
        watchedlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchedlistMouseClicked(evt);
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

        posterLabel.setText("jLabel1");

        titleLabel.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setText("MOVIE NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(watchedlist)
                        .addGap(18, 18, 18)
                        .addComponent(watchlist)
                        .addGap(18, 18, 18)
                        .addComponent(homelabel)
                        .addGap(18, 18, 18)
                        .addComponent(logOutLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(posterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(commentButton)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleset2)
                        .addComponent(titleset1))
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logOutLabel)
                        .addComponent(homelabel)
                        .addComponent(watchlist)
                        .addComponent(watchedlist))
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(commentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(posterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void setPosterandTitle() {
        titleLabel.setText(movieTitle);
        String picURL=abstractThings.getPicURL(movieTitle);
        ImageIcon icon=new ImageIcon("C:\\Users\\Admin\\Downloads\\Movie_Posters\\"+picURL);
        Image imagefits =icon.getImage();
        Image imagefitting=imagefits.getScaledInstance(posterLabel.getWidth(), posterLabel.getHeight(), Image.SCALE_SMOOTH);
        posterLabel.setIcon(new ImageIcon(imagefitting));
    }

    
    private void searchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchbarFocusLost
        if(searchbar.getText().trim().toLowerCase().equals("")) {
            Color customColor = new Color(153,153,255);
            searchbar.setForeground(customColor);
            searchbar.setText("Search movies...");
        }
    }//GEN-LAST:event_searchbarFocusLost

    private void commentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentButtonActionPerformed
        
    }//GEN-LAST:event_commentButtonActionPerformed

    private void watchlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchlistMouseClicked
        this.dispose();
        abstractThings.openWatchList(currentUser);
    }//GEN-LAST:event_watchlistMouseClicked

    private void homelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelabelMouseClicked
        this.dispose();
        abstractThings.goHome(currentUser);
    }//GEN-LAST:event_homelabelMouseClicked

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeto(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void jcommentlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcommentlistMouseClicked
        if (evt.getClickCount()==2 ){
            String movieName=jcommentlist.getSelectedValue();
            String umail=movieName.substring(0,movieName.indexOf(":"));
            boolean found=abstractThings.verifyUser(umail,currentUser);
            if(found) {      
                this.dispose();
                CommentWindow commentwindow= new CommentWindow();
                commentwindow.setVisible(true);
                commentwindow.movieTitle=movieTitle;
                commentwindow.currentUser=currentUser;
                commentwindow.setLabelValues(1);
                commentwindow.pack();
                commentwindow.setLocationRelativeTo(null);
                commentwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } 
        }
    }//GEN-LAST:event_jcommentlistMouseClicked

    private void jcommentlistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcommentlistMousePressed

    }//GEN-LAST:event_jcommentlistMousePressed

    private void watchedlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchedlistMouseClicked
        this.dispose();
        abstractThings.openWatchedList(currentUser);
    }//GEN-LAST:event_watchedlistMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String movieName=searchbar.getText();
        boolean found=abstractThings.searchButtonAction(movieName,currentUser);
        if(found) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    
    public void fillList() {
        jcommentlist.setModel(dm);
        String query="SELECT * FROM `userreview` WHERE `TITLE` = ?";
        ArrayList<String>result;
        result=abstractThings.fillComments(currentUser, query, movieTitle);
        for(String index:result) {
            dm.addElement(index);
        }
        
    }
    
    private void commentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentButtonMouseClicked
        if (abstractThings.verifyCommented(currentUser,movieTitle)) {
            JOptionPane.showMessageDialog(null, "Comment Already Posted", "Try Editing Comment from List",2);
        }else {
            this.dispose();
            CommentWindow commentwindow= new CommentWindow();
            commentwindow.setVisible(true);
            commentwindow.movieTitle=movieTitle;
            commentwindow.currentUser=currentUser;
            commentwindow.setLabelValues(0);
            commentwindow.pack();
            commentwindow.setLocationRelativeTo(null);
            commentwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_commentButtonMouseClicked

   
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
            java.util.logging.Logger.getLogger(UserComments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserComments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserComments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserComments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserComments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commentButton;
    private javax.swing.JLabel homelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jcommentlist;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleset1;
    private javax.swing.JLabel titleset2;
    private javax.swing.JLabel watchedlist;
    private javax.swing.JLabel watchlist;
    // End of variables declaration//GEN-END:variables

}
