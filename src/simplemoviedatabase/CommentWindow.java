package simplemoviedatabase;

import javax.swing.JOptionPane;

public class CommentWindow extends javax.swing.JFrame {
    String currentUser;
    String movieTitle;
    AbstractThings abstractThings=new AbstractThings() {};

    public CommentWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcommentArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        postORdeleteButton = new javax.swing.JButton();
        backORrepostLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jcommentArea.setColumns(20);
        jcommentArea.setRows(5);
        jScrollPane1.setViewportView(jcommentArea);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Write Your Review");

        postORdeleteButton.setBackground(new java.awt.Color(255, 255, 255));
        postORdeleteButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        postORdeleteButton.setForeground(new java.awt.Color(153, 153, 153));
        postORdeleteButton.setText("Remove Comment");
        postORdeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postORdeleteButtonActionPerformed(evt);
            }
        });

        backORrepostLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        backORrepostLabel.setForeground(new java.awt.Color(255, 255, 255));
        backORrepostLabel.setText("Get back to Comments...");
        backORrepostLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backORrepostLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backORrepostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(postORdeleteButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backORrepostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postORdeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
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
    public void setLabelValues(int choice) {
        if(choice==0) {
            backORrepostLabel.setText("Get back to comments...");
            postORdeleteButton.setText("Post");
            jcommentArea.setText("");
        } else {
            backORrepostLabel.setText("Repost");
            postORdeleteButton.setText("Remove Comment");
            String ucomment=abstractThings.getUserComment(currentUser, movieTitle);
            jcommentArea.setText(ucomment);
        }
    }
    private void postORdeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postORdeleteButtonActionPerformed
        if((postORdeleteButton.getText()).equals("Post")) {
            String query="INSERT INTO `userreview` (`EMAIL`, `NAME`, `COMMENT`, `TITLE`) VALUES (?,?,?,?)";
            if(jcommentArea.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Cannot add empty review.", "Write Something...",2);
            } else {
                String comment=jcommentArea.getText();
                abstractThings.postToList(currentUser, movieTitle, query, comment);
                JOptionPane.showMessageDialog(null, "Your post has been succesfully uploaded.", movieTitle,2);
            }
        } else {
            String query="DELETE FROM `userreview` WHERE `EMAIL`=? AND `TITLE`=?";
            abstractThings.deleteComment(currentUser, movieTitle, query);
            JOptionPane.showMessageDialog(null, "Your post has been deleted.", movieTitle,2);
            
        }
        this.dispose();
        abstractThings.openUserComments(currentUser, movieTitle);
    }//GEN-LAST:event_postORdeleteButtonActionPerformed

    private void backORrepostLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backORrepostLabelMouseClicked
        if((backORrepostLabel.getText()).equals("Repost")) {           
            if(jcommentArea.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Cannot add empty review.", "Write Something...",2);
            } else {
                String comment=jcommentArea.getText();
                String query="UPDATE `userreview` SET `COMMENT`=? WHERE `EMAIL`=? AND `TITLE`=?";
                abstractThings.updateList(currentUser, movieTitle, query, comment);
                JOptionPane.showMessageDialog(null, "Your post has been succesfully updated.", movieTitle,2);
            }
        }
        this.dispose();
        abstractThings.openUserComments(currentUser, movieTitle);
    }//GEN-LAST:event_backORrepostLabelMouseClicked

   
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
            java.util.logging.Logger.getLogger(CommentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backORrepostLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jcommentArea;
    private javax.swing.JButton postORdeleteButton;
    // End of variables declaration//GEN-END:variables
}
