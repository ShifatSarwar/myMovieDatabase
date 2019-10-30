package simplemoviedatabase;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DatabaseConnection {
    private static String serverName="localhost";
    private static String username="root";
    private static String dbname="moviedatabase";
    private static Integer portnumber=3306;
    private static String password="";
    
    
        public static Connection getConnection() {
      
            Connection connection=null;
            MysqlDataSource datasource=new MysqlDataSource();
            datasource.setServerName(serverName);
            datasource.setUser(username);
            datasource.setPassword(password);
            datasource.setDatabaseName(dbname);
            datasource.setPortNumber(portnumber);
            try {
                connection= datasource.getConnection();
            } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> "+DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return connection;
        }
}
   