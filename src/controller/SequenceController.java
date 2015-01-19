/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Etudiant
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Classe;
import oracle.sql.*;
/**
 *
 * @author Etudiant
 */
public class SequenceController {
    
    private String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String DBUSER = "margo";
    private String DBPASS = "margo";  
    //private Classe classeTmp;
    
    
            

    public int CreateSequence(String newSequence) {
        //String columnNames[] = { "Lib Classe","Liste Filiere"};
        //DefaultTableModel defModel = new DefaultTableModel();
        //defModel.setColumnIdentifiers(columnNames);
        int retour=-1;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            if (con == null)
                System.out.println("con classe ko ");
            else
                System.out.println("con classe ok ");
            Statement statement = con.createStatement();
            if (statement == null)
                System.out.println("statement classe ko ");
            else
                System.out.println("statement classe ok ");
            
            //System.out.println("test1 : " + SaisieNom.getText());
            
            String ordreSQL= "DECLARE\n" +
                "  v_dummy NUMBER;\n" +
                "BEGIN\n" +                
                "  SELECT 1\n" +
                "  INTO v_dummy\n" +
                "  FROM user_sequences\n" +
                "  WHERE sequence_name = ?;\n" +
                
                "EXCEPTION\n" +
                "  WHEN no_data_found THEN\n" +
                "    EXECUTE IMMEDIATE 'CREATE SEQUENCE "+newSequence+" INCREMENT BY 1 MAXVALUE 100000 MINVALUE 1 CACHE 20';\n" +
                "END;";
            PreparedStatement etatPrepare = con.prepareStatement(ordreSQL);
            etatPrepare.setString(1,newSequence);
            //etatPrepare.setString(2, newSequence);
            
            
            retour=etatPrepare.executeUpdate();
            etatPrepare.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
        
    }    
}
