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
public class FiliereController {
    
    private String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String DBUSER = "margo";
    private String DBPASS = "margo";  
    //private Classe classeTmp;
    
    
            

    public TableModel Update() {
        String columnNames[] = { "Liste Filiere"};
        DefaultTableModel defModel = new DefaultTableModel();
        defModel.setColumnIdentifiers(columnNames);
    
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
            
            ResultSet rs = statement.executeQuery("select * from \"filiere\"" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            //String codeCLasse = "";
            String LibFiliere = "";
            //String CodeFiliere = "";
            while (rs.next()) {
                //codeCLasse= "N.A";
                LibFiliere=rs.getString("LIBFILIERE");
                
                defModel.addRow(new Object [] {LibFiliere} );
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
    }
    
   
    public DefaultComboBoxModel<String> GetListFiliere(){
        
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
            
            ResultSet rs = statement.executeQuery("select * from \"filiere\"" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            //defModel.addElement( "All");
            String LibFiliere = "";
            while (rs.next()) {
                
                LibFiliere=rs.getString("LIBFILIERE");
                
                defModel.addElement( LibFiliere);
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
        
    }
    public int AddFiliere(String NouvelleFiliere){
        
        int retour;
        
        if (NouvelleFiliere.isEmpty()){
            return -2;
        }
    
        if (NouvelleFiliere.startsWith(" ")){
            return -4;
        }
        
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
            
             String ordreSQLControle= "select count(1) from \"filiere\" where LIBFILIERE=?";//(select codefiliere from filiere where libfiliere=?))" ;
            
            PreparedStatement etatPrepareControle = con.prepareStatement(ordreSQLControle);
            etatPrepareControle.setString(1,NouvelleFiliere);
            
            
            ResultSet rs=etatPrepareControle.executeQuery();
            rs.next();
            if (rs.getInt(1)!=0){
                
                return -3;
            }
            
            
            String ordreSQL= "insert into \"filiere\"(CODEFILIERE,LIBFILIERE,IDPERS) values(SEQ_FILIERE.nextVAL,?,NULL)";//(select codefiliere from filiere where libfiliere=?))" ;
            
            PreparedStatement etatPrepare = con.prepareStatement(ordreSQL);
            etatPrepare.setString(1,NouvelleFiliere);
            
            
            
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
