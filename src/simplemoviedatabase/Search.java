package simplemoviedatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Search extends AbstractThings{
    
    boolean searchButtonAction(String query, String movieName, String currentUser) {
        PreparedStatement statement;
        ResultSet resultset;
        try {
            statement=DatabaseConnection.getConnection().prepareStatement(query);
            statement.setString(1,movieName);
            resultset=statement.executeQuery();
            if(resultset.next()) { 
               return true;
            } else {
                JOptionPane.showMessageDialog(null, "Movie Not Found", "Try Again",2);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    @Override
    int search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
