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
public class ClasseController {
    
    private String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String DBUSER = "margo";
    private String DBPASS = "margo";  
    //private Classe classeTmp;
    
    
            

    public TableModel Update() {
        String columnNames[] = { "Lib Classe","Liste Filiere"};
        DefaultTableModel defModel = new DefaultTableModel();
        defModel.setColumnIdentifiers(columnNames); 
        SequenceController seq_classe= new SequenceController();
        seq_classe.CreateSequence("SEQ_CLASSE");
        
    
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
            
            ResultSet rs = statement.executeQuery("select * from \"classe\" c join \"filiere\" f on c.codefiliere=f.codefiliere" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            
            String LibClasse = "";
            String LibFiliere = "";
            while (rs.next()) {
                
                LibClasse=rs.getString("LIBCLASSE");
                LibFiliere = rs.getString("LIBFILIERE");;
                defModel.addRow(new Object [] {LibClasse,LibFiliere} );
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
    }
    
   
    public DefaultComboBoxModel<String> GetListClasse(){
        
        //String columnNames[] = { "Lib Classe"};
        DefaultComboBoxModel<String> defModel = new DefaultComboBoxModel<String>();
        //defModel.setColumnIdentifiers(columnNames);
    
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
            
            ResultSet rs = statement.executeQuery("select * from \"classe\"" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            defModel.addElement( "All");
            String LibClasse = "";
            while (rs.next()) {
                
                LibClasse=rs.getString("LIBCLASSE");
                
                defModel.addElement( LibClasse);
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
        
    }
    public int AddClasse(String NouvelleClasse,String Filiere){
        
        int retour;
    
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
            
            String ordreSQL= "insert into \"classe\"(CODECLASSE,LIBCLASSE,CODEFILIERE) values(SEQ_CLASSE.nextVAL,?,(select codefiliere from \"filiere\" where libfiliere=?))" ;
            
            PreparedStatement etatPrepare = con.prepareStatement(ordreSQL);
            etatPrepare.setString(1,NouvelleClasse);
            etatPrepare.setString(2, Filiere);
            
            
            retour=etatPrepare.executeUpdate();
            etatPrepare.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            retour=-1;
        }
        return retour;
        
        
    }
}
