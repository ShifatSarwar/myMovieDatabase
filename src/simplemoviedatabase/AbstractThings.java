package simplemoviedatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbstractThings {
    PreparedStatement statement;
    ResultSet resultset;
    
    boolean searchButtonAction(String movieName, String cUser) { 
        String query="SELECT * FROM `movies` WHERE `TITLE` = ?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,movieName);
            resultset=statement.executeQuery();
            if(resultset.next()) {
                MovieDetails movieDetails= new MovieDetails();
                movieDetails.currentUser=cUser;
                movieDetails.movieID=resultset.getInt("MOVIE_ID");
                movieDetails.setLabelTitle(resultset.getString("TITLE"));
                movieDetails.setMovieYear(resultset.getString("YEAR"));
                movieDetails.setMovieDescription(resultset.getString("DESCRIPTION"));
                movieDetails.setPoster(resultset.getString("PICTURE"));
                movieDetails.setMovieRating(resultset.getString("TITLE"));
                movieDetails.setVisible(true);
                movieDetails.pack();
                movieDetails.setLocationRelativeTo(null);
                movieDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               return true;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    void addToList(String checkQuery, String query, int movieID, String cUser) {
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(checkQuery);
            statement.setInt(1,movieID);
            statement.setString(2, cUser);
            resultset=statement.executeQuery();
            if (resultset.next()) {
                JOptionPane.showMessageDialog(null, "Movie Already Added", "Try Something New",2);
            } else {  
                statement=DatabaseConnection.getConnection().prepareStatement(query);
                statement.setInt(1, movieID);
                statement.setString(2,cUser);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Movie Added", "Try Something New",2);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void openWatchedList(String cUser) {
        Watchedlist watchedlist=new Watchedlist();
        watchedlist.currentUser=cUser;
        watchedlist.fillList();
        watchedlist.setVisible(true);
        watchedlist.pack();
        watchedlist.setLocationRelativeTo(null);
        watchedlist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openWatchList(String cUser) {
        Watchlist watchlist=new Watchlist();
        watchlist.currentUser=cUser;
        watchlist.fillList();
        watchlist.setVisible(true);
        watchlist.pack();
        watchlist.setLocationRelativeTo(null);
        watchlist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String fillArray(String cUser, String query) {
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,cUser);
            resultset=statement.executeQuery();
            String result="";
            ArrayList<Integer> record=new ArrayList<>();
            while (resultset.next()) {
                record.add(resultset.getInt("MOVIE_ID"));
            }
            query="SELECT `TITLE` FROM `movies` WHERE `MOVIE_ID` = ?";
            for(int index:record) {               
                statement=DatabaseConnection.getConnection().prepareStatement(query);
                statement.setInt(1,index);
                resultset=statement.executeQuery();
                if(resultset.next()) {
                    result=resultset.getString("TITLE")+","+result;
                }
            }
            
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public void removeFromList(String cUser, String movieName, String query) {
        String checkQuery="SELECT `MOVIE_ID` FROM `movies` WHERE `TITLE`=?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(checkQuery);
            statement.setString(1,movieName);
            resultset=statement.executeQuery();
            if(resultset.next()) {
               int movieID=resultset.getInt("MOVIE_ID");
               statement=DatabaseConnection.getConnection().prepareStatement(query);
               statement.setInt(1,movieID);
               statement.setString(2, cUser);
               statement.executeUpdate();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> fillComments(String cUser, String query, String mTitle) {
        ArrayList<String> record=new ArrayList<>();
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,mTitle);
            resultset=statement.executeQuery();    
            while (resultset.next()) {
                record.add(resultset.getString("NAME")+": "+resultset.getString("COMMENT"));
            }
            return record;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;
    }
    
    public void postToList(String cUser, String movieName, String query, String comment, int rate){
        try {
            String anotherquery="SELECT `name` FROM `users` WHERE `EMAIL`=?";
               statement=DatabaseConnection.getConnection().prepareStatement(anotherquery);
               statement.setString(1,cUser);
               resultset=statement.executeQuery();
               String uname="";
               if(resultset.next()) {
                    uname=resultset.getString("name");
               }
               statement=DatabaseConnection.getConnection().prepareStatement(query);
               statement.setString(1,cUser);
               statement.setString(2, uname);
               statement.setString(3, comment);
               statement.setString(4,movieName);
               statement.setInt(5,rate);
               statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void openUserComments(String cUser, String title) {
        UserComments usercomments=new UserComments();
        usercomments.currentUser=cUser;
        usercomments.movieTitle=title;
        usercomments.fillList();
        usercomments.setPosterandTitle();
        usercomments.setVisible(true);
        usercomments.pack();
        usercomments.setLocationRelativeTo(null);
        usercomments.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String getPicURL(String movieName) {
        String picUrl="";
        String query="SELECT `PICTURE` FROM `movies` WHERE `TITLE`=?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,movieName);
            resultset=statement.executeQuery(); 
            if(resultset.next()) {
               picUrl=resultset.getString("PICTURE");
            }
            return picUrl;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return picUrl;
    }
    
    public boolean verifyCommented(String cUser, String movieName) {
        String checkQuery="SELECT * FROM `userreview` WHERE `EMAIL`=? AND `TITLE`=?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(checkQuery);
            statement.setString(1,cUser);
            statement.setString(2, movieName);
            resultset=statement.executeQuery();
            if(resultset.next()) {
               return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean verifyUser(String name, String cUser) {
        String query="SELECT `email` FROM `users` WHERE `name`=?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,name);
            resultset=statement.executeQuery();
            String umail="";
            if(resultset.next()) {
                umail=resultset.getString("email");
            }
            if(umail.equals(cUser)) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
    
    public String getUserComment(String cUser, String mName) {
        try {
            String anotherquery="SELECT `COMMENT` FROM `userreview` WHERE `EMAIL`=? AND `TITLE`=?";
               statement=DatabaseConnection.getConnection().prepareStatement(anotherquery);
               statement.setString(1,cUser);
               statement.setString(2,mName);
               resultset=statement.executeQuery();
               String comment="";
               if(resultset.next()) {
                    comment=resultset.getString("COMMENT");
               }
               return comment;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public void updateList(String cUser, String movieName, String query, String comment, int rate) {
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,comment);
            statement.setInt(2, rate);
            statement.setString(3, cUser);
            statement.setString(4, movieName);
            statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteComment(String cUser, String movieName, String query) {
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,cUser);
            statement.setString(2, movieName);
            statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goHome(String cUser) {
        if(cUser.equals("admin@moviedb.com")) {
            Adminhome home=new Adminhome();
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
            home.currentUser=cUser;
            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            Home home= new Home();    
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
            home.currentUser=cUser;
            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
    }
    
    public String getCalculatedRating(String movietitle) {
        String query="SELECT `RATE` FROM `userreview` WHERE `TITLE`=?";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,movietitle);
            resultset=statement.executeQuery();
            double rate=0.0;
            int count=0;
            while(resultset.next()) {
                rate=rate+resultset.getInt("RATE");
                count++;
            }
            if(count==0) {
                return "Not Rated";
            }else {
                rate=rate/count;
                return String.valueOf(rate);           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Not Rated";
    }
    
    public int getUserRating(String cUser, String mName) {
        try {
            String anotherquery="SELECT `RATE` FROM `userreview` WHERE `EMAIL`=? AND `TITLE`=?";
            statement=DatabaseConnection.getConnection().prepareStatement(anotherquery);
            statement.setString(1,cUser);
            statement.setString(2,mName);
            resultset=statement.executeQuery();
            int rate=0;
            if(resultset.next()) {
                rate=resultset.getInt("RATE");
            }
            return rate;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public String getIMDBID(String title) {
        String url= "http://www.omdbapi.com/?apikey=d87b5a9a&t="+title; 
        try { 
            JSONObject json = readJsonFromUrl(url);
            return json.getString("imdbID");         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | JSONException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
        return "";
    }
    
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
    
    public ArrayList<String> getTrailersName(String url) {
        ArrayList<String> trailerName=new ArrayList<>();
        try { 
            JSONObject json = readJsonFromUrl(url);
            JSONObject jsonVideo =json.getJSONObject("videos");
            JSONArray jsonVideoResult=jsonVideo.getJSONArray("results");      
            for (int i = 0; i < jsonVideoResult.length(); i++) {
                JSONObject jsonobject = jsonVideoResult.getJSONObject(i);
                trailerName.add(jsonobject.getString("name"));  
            }
            return trailerName;
        } catch (FileNotFoundException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | JSONException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
        return trailerName;
    }
    
    public ArrayList<String> getTrailersKey(String url) {
        ArrayList<String> trailerKeys=new ArrayList<>();
        try { 
            JSONObject json = readJsonFromUrl(url);
            JSONObject jsonVideo =json.getJSONObject("videos");
            JSONArray jsonVideoResult=jsonVideo.getJSONArray("results");         
            for (int i = 0; i < jsonVideoResult.length(); i++) {
                JSONObject jsonobject = jsonVideoResult.getJSONObject(i);
                trailerKeys.add(jsonobject.getString("key"));
            }
            return trailerKeys;
        } catch (FileNotFoundException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | JSONException ex) {
             Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
         }   
        return trailerKeys;
    }
    
    public void setTempTable(String name, String key) {
        String query="INSERT INTO`tempuse` (`NAME`, `TKEY`) VALUES (?, ?)";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,name);
            statement.setString(2, key);
            statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getTempName() {
        try {
            String query="SELECT `NAME` FROM `tempuse`";
            String name="";
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            resultset=statement.executeQuery();
            if(resultset.next()) {
                name=resultset.getString("NAME");
            }
            return name;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public String getTempKey() {
        try {
            String query="SELECT `TKEY` FROM `tempuse`";
            String key="";
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            resultset=statement.executeQuery();
            if(resultset.next()) {
                key=resultset.getString("TKEY");
            }
            return key;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public void deleteTempData() {
        String query="DELETE FROM `tempuse`";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTempTable2(ArrayList<String> a) {
        String query="INSERT INTO`tempusetwo` (`TKEY`) VALUES (?)";
        try {
            for(String index: a) {
                statement=DatabaseConnection.getConnection().prepareStatement(query);
                statement.setString(1,index);
                statement.executeUpdate(); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTrackerValue(Boolean track) {
        String query="DELETE FROM `tracker`";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        query="INSERT INTO `tracker` (`TRACK`) VALUES (?)";
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setBoolean(1,track);
            statement.executeUpdate();             
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Boolean fetchTrackerValue() {
        try {
            String query="SELECT `TRACK` FROM `tracker`";
            Boolean key=false;
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            resultset=statement.executeQuery();
            if(resultset.next()) {
                key=resultset.getBoolean("TRACK");
            }
            return key;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
