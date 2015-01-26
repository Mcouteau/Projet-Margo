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
import java.util.Vector;
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
            
            ResultSet rs = statement.executeQuery("select * from \"CLASSE\" c join \"FILIERE\" f on c.CODEFILIERE=f.CODEFILIERE order by LIBCLASSE" );
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
    
   
    public ComboBoxModel<String> GetListClasse(){
        
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
            
            ResultSet rs = statement.executeQuery("select * from \"CLASSE\" order by LIBCLASSE" );
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
    
    public String GetCodeClasseByIndex(int indexClasse){
        
        //String columnNames[] = { "Lib Classe"};
        
        //defModel.setColumnIdentifiers(columnNames);
        Vector<String> VectorClasse= new Vector<String>();
    
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
            
            ResultSet rs = statement.executeQuery("select CODECLASSE from \"CLASSE\" order by LIBCLASSE" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            VectorClasse.addElement( "All");
            String CodeClasse = "";
            while (rs.next()) {
                CodeClasse= rs.getString("CODECLASSE");
                VectorClasse.addElement( CodeClasse);
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (String) VectorClasse.get(indexClasse);
        
        
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
            
            String ordreSQL= "insert into \"CLASSE\"(CODECLASSE,LIBCLASSE,CODEFILIERE) values(SEQ_CLASSE.nextVAL,?,(select CODEFILIERE from \"FILIERE\" where LIBFILIERE=?))" ;
            
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
