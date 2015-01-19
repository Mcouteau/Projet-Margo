
package margo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import margo.view.MainJFrame;

public class Margo {
  
  public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
  public static final String DBUSER = "margo";
  public static final String DBPASS = "margo";
  
    public static void main(String[] args) throws SQLException {
//        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//        
//        Connection dbcon = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
//        Statement stmt = dbcon.createStatement();
//        
//        stmt.close();
//        dbcon.close();
      MainJFrame mainFrame = new MainJFrame();
      System.out.println("Launching program");
      mainFrame.setVisible(false);
      mainFrame.setLocationRelativeTo(null) ;
    }
    
}
