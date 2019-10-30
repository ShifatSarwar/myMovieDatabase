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

}
