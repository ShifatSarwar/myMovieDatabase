package simplemoviedatabase;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import org.json.JSONObject; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONException;


public class MovieDetails extends javax.swing.JFrame {
     int movieID;
     String currentUser;
     AbstractThings abstractThings=new AbstractThings() {};
    
 
    public MovieDetails() {
       initComponents();
    }
    
    public void setLabelTitle(String title) {
        titleLabel.setText(title);
    }
    
    public void setMovieRating(String title) {
        jRatingLabel.setText(abstractThings.getCalculatedRating(title));
    } 
    
    public void setMovieYear(String year) {
        yearLabel.setText(year);
    }
    
    public void setMovieDescription(String des) {
        desArea.setText(des);
    }
    
    public void setPoster(String picURL) {
        ImageIcon icon=new ImageIcon("C:\\Users\\Admin\\Downloads\\Movie_Posters\\"+picURL);
        Image imagefits =icon.getImage();
        Image imagefitting=imagefits.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH);
        picLabel.setIcon(new ImageIcon(imagefitting));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        titleset2 = new javax.swing.JLabel();
        titleset1 = new javax.swing.JLabel();
        homelabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desArea = new javax.swing.JTextArea();
        addtowatchedlist = new javax.swing.JButton();
        addTowatchlist = new javax.swing.JButton();
        usercommentsLabel = new javax.swing.JLabel();
        watchlistLabel = new javax.swing.JLabel();
        watchedListLabel1 = new javax.swing.JLabel();
        imdbLabel = new javax.swing.JLabel();
        jRatingLabel = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        trailerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

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

        titleset2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset2.setForeground(new java.awt.Color(255, 51, 51));
        titleset2.setText("DB");

        titleset1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        titleset1.setForeground(new java.awt.Color(255, 255, 255));
        titleset1.setText("MOVIE");

        homelabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        homelabel.setForeground(new java.awt.Color(153, 153, 153));
        homelabel.setText("Home");
        homelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homelabelMouseClicked(evt);
            }
        });

        logOutLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(153, 153, 153));
        logOutLabel.setText("Log Out");
        logOutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 51, 51));
        titleLabel.setText("No Movie");

        yearLabel.setBackground(new java.awt.Color(0, 0, 0));
        yearLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(204, 204, 204));
        yearLabel.setText("2000");

        picLabel.setText("jLabel1");

        desArea.setEditable(false);
        desArea.setBackground(new java.awt.Color(0, 0, 0));
        desArea.setColumns(20);
        desArea.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        desArea.setForeground(new java.awt.Color(255, 255, 255));
        desArea.setLineWrap(true);
        desArea.setRows(5);
        desArea.setWrapStyleWord(true);
        desArea.setBorder(null);
        jScrollPane1.setViewportView(desArea);

        addtowatchedlist.setBackground(new java.awt.Color(255, 255, 255));
        addtowatchedlist.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addtowatchedlist.setForeground(new java.awt.Color(153, 153, 153));
        addtowatchedlist.setText("Add to Watched List");
        addtowatchedlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addtowatchedlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtowatchedlistActionPerformed(evt);
            }
        });

        addTowatchlist.setBackground(new java.awt.Color(255, 255, 255));
        addTowatchlist.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addTowatchlist.setForeground(new java.awt.Color(153, 153, 153));
        addTowatchlist.setText("Add to Watchlist");
        addTowatchlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTowatchlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTowatchlistActionPerformed(evt);
            }
        });

        usercommentsLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        usercommentsLabel.setForeground(new java.awt.Color(153, 153, 153));
        usercommentsLabel.setText("User Comments");
        usercommentsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usercommentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usercommentsLabelMouseClicked(evt);
            }
        });

        watchlistLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchlistLabel.setForeground(new java.awt.Color(153, 153, 153));
        watchlistLabel.setText("Watchlist");
        watchlistLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        watchlistLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchlistLabelMouseClicked(evt);
            }
        });

        watchedListLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        watchedListLabel1.setForeground(new java.awt.Color(153, 153, 153));
        watchedListLabel1.setText("Watched List");
        watchedListLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        watchedListLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchedListLabel1MouseClicked(evt);
            }
        });

        imdbLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        imdbLabel.setForeground(new java.awt.Color(255, 204, 0));
        imdbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imdbLabel.setText("IMDB");
        imdbLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imdbLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imdbLabelMouseClicked(evt);
            }
        });

        jRatingLabel.setBackground(new java.awt.Color(0, 0, 0));
        jRatingLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jRatingLabel.setForeground(new java.awt.Color(255, 0, 51));
        jRatingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRatingLabel.setText("Not Rated ");
        jRatingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRatingLabelMouseClicked(evt);
            }
        });

        jlabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(153, 153, 153));
        jlabel1.setText("Movie Rating:");
        jlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel1MouseClicked(evt);
            }
        });

        trailerLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        trailerLabel.setForeground(new java.awt.Color(255, 0, 51));
        trailerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trailerLabel.setText("Watch Trailer");
        trailerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trailerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trailerLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(watchedListLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(watchlistLabel)
                                .addGap(18, 18, 18)
                                .addComponent(homelabel)
                                .addGap(18, 18, 18)
                                .addComponent(logOutLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(usercommentsLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRatingLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 161, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(addTowatchlist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(addtowatchedlist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(imdbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(trailerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(435, 435, 435)
                    .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(374, 374, 374)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logOutLabel)
                            .addComponent(homelabel)
                            .addComponent(watchlistLabel)
                            .addComponent(watchedListLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleset1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleset2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addTowatchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addtowatchedlist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yearLabel)
                                .addGap(18, 18, 18)
                                .addComponent(usercommentsLabel)))
                        .addGap(10, 10, 10)
                        .addComponent(jRatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(imdbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trailerLabel)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(415, Short.MAX_VALUE)
                    .addComponent(jlabel1)
                    .addGap(119, 119, 119)))
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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String movieName=searchbar.getText();
        boolean found=abstractThings.searchButtonAction(movieName, currentUser);
        if(found) {      
            this.dispose();    
        } else {
            JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addtowatchedlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtowatchedlistActionPerformed
        String checkQuery="SELECT * FROM `watchedlist` WHERE `MOVIE_ID`=? AND `EMAIL`=?";
        String query="INSERT INTO`watchedlist` (`MOVIE_ID`, `EMAIL`) VALUES (?, ?)";
        abstractThings.addToList(checkQuery,query,movieID,currentUser);
    }//GEN-LAST:event_addtowatchedlistActionPerformed

    private void addTowatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTowatchlistActionPerformed
        String checkQuery="SELECT * FROM `watchlist` WHERE `MOVIE_ID`=? AND `EMAIL`=?";
        String query="INSERT INTO`watchlist` (`MOVIE_ID`, `EMAIL`) VALUES (?, ?)";
        abstractThings.addToList(checkQuery,query,movieID,currentUser);
    }//GEN-LAST:event_addTowatchlistActionPerformed

    private void usercommentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usercommentsLabelMouseClicked
        this.dispose();  
        abstractThings.openUserComments(currentUser, titleLabel.getText());
    }//GEN-LAST:event_usercommentsLabelMouseClicked

    private void watchlistLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchlistLabelMouseClicked
        this.dispose();
        abstractThings.openWatchList(currentUser);
    }//GEN-LAST:event_watchlistLabelMouseClicked

    private void watchedListLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchedListLabel1MouseClicked
        this.dispose();
        abstractThings.openWatchedList(currentUser);
    }//GEN-LAST:event_watchedListLabel1MouseClicked

    private void imdbLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imdbLabelMouseClicked
        String title = (titleLabel.getText()).replaceAll("\\s+", "+");
        
        String url= "http://www.omdbapi.com/?apikey=d87b5a9a&t="+title; 
        try { 
            JSONObject json = readJsonFromUrl(url);
            URI uri = new URI("https://www.imdb.com/title/"+json.get("imdbID"));
            java.awt.Desktop.getDesktop().browse(uri);
  
         } catch (FileNotFoundException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | JSONException | URISyntaxException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_imdbLabelMouseClicked
    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
         }
        return sb.toString();
  }
    private void jRatingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRatingLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRatingLabelMouseClicked

    private void jlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabel1MouseClicked

    private void trailerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trailerLabelMouseClicked

    }//GEN-LAST:event_trailerLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTowatchlist;
    private javax.swing.JButton addtowatchedlist;
    private javax.swing.JTextArea desArea;
    private javax.swing.JLabel homelabel;
    private javax.swing.JLabel imdbLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jRatingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleset1;
    private javax.swing.JLabel titleset2;
    private javax.swing.JLabel trailerLabel;
    private javax.swing.JLabel usercommentsLabel;
    private javax.swing.JLabel watchedListLabel1;
    private javax.swing.JLabel watchlistLabel;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables

}
