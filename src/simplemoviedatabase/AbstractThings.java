package simplemoviedatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    
    public void postToList(String cUser, String movieName, String query, String comment){
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
    
    public void updateList(String cUser, String movieName, String query, String comment) {
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,comment);
            statement.setString(2, cUser);
            statement.setString(3, movieName);
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
   
}
