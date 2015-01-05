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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Classe;
import model.Etudiant;
import oracle.sql.*;
/**
 *
 * @author Etudiant
 */
public class EtudiantController {
    
    private String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String DBUSER = "margo";
    private String DBPASS = "margo";  
    //private Classe classeTmp;
    
    
            

    public TableModel Update() {
        //String columnNames[] = { "ID","Nom","Prenom","Situation","Adresse","Classe"};
        String columnNames[] = { "Nom","Prenom","Situation","Adresse","Classe"};
        DefaultTableModel defModel = new DefaultTableModel();
        defModel.setColumnIdentifiers(columnNames);
    
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            if (con == null)
                System.out.println("con etudiant ko ");
            else
                System.out.println("con etudiant ok ");
            Statement statement = con.createStatement();
            if (statement == null)
                System.out.println("statement etudiant ko ");
            else
                System.out.println("statement etudiant ok ");
            
            //System.out.println("test1 : " + SaisieNom.getText());
            
            ResultSet rs = statement.executeQuery("select * from \"etudiant\" e join \"classe\" c on c.codeclasse=e.codeclasse" );
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            String idEtudiant = "";
            String nom = "";
            String prenom = "";
            String situation = "";
            String adresse = "";
            String libclasse = "";
            while (rs.next()) {
                idEtudiant= rs.getString("IDPERS");
                nom= rs.getString("NOM");
                prenom= rs.getString("PRENOM");
                situation= rs.getString("SITUATION");
                adresse= rs.getString("ADRESSE");
                libclasse= rs.getString("LIBCLASSE");
                //Etudiant(String nomPersonne, String prenomPersonne, String situationFam, String adress)
                Etudiant tmpEtu= new Etudiant(nom,prenom,situation,adresse);
                defModel.addRow(tmpEtu.RetourTableau(libclasse) );  
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
    }
    public TableModel Update(Object classe) {
        //String columnNames[] = { "ID","Nom","Prenom","Situation","Adresse","Classe"};
        String columnNames[] = { "Nom","Prenom","Situation","Adresse","Classe"};
        DefaultTableModel defModel = new DefaultTableModel();
        defModel.setColumnIdentifiers(columnNames);
    
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            if (con == null)
                System.out.println("con etudiant ko ");
            else
                System.out.println("con etudiant ok ");
            Statement statement = con.createStatement();
            if (statement == null)
                System.out.println("statement etudiant ko ");
            else
                System.out.println("statement etudiant ok ");
            
            ResultSet rs ;
            //System.out.println("test1 : " + SaisieNom.getText());
            if ( classe.toString() == "All"){
                rs = statement.executeQuery("select * from \"etudiant\" e join \"classe\" c on c.codeclasse=e.codeclasse");
            }
            else{
                rs = statement.executeQuery("select * from \"etudiant\" e join \"classe\" c on c.codeclasse=e.codeclasse where LIBCLASSE = '"+ classe.toString()+"'");
            }
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );
            
            String nom = "";
            String prenom = "";
            String situation = "";
            String adresse = "";
            String libclasse = "";
            while (rs.next()) {
                
                nom= rs.getString("NOM");
                prenom= rs.getString("PRENOM");
                situation= rs.getString("SITUATION");
                adresse= rs.getString("ADRESSE");
                libclasse= rs.getString("LIBCLASSE");
                //Etudiant(String nomPersonne, String prenomPersonne, String situationFam, String adress)
                Etudiant tmpEtu= new Etudiant(nom,prenom,situation,adresse);
                defModel.addRow(tmpEtu.RetourTableau(libclasse));  
                
                
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defModel;
        
    }
}