package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Etudiant;
import model.Enseignant;
import model.Administratif;
import model.Intervenant;
import model.Personne;
import model.Technicien;

public class Login {
 
  public static Personne authenticate(String username, String password) {
      try {            
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "margo", "margo");
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
            
            ResultSet rs = statement.executeQuery("select p.NOM,p.PRENOM,p.TYPEPERSONNE,p.ADRESSE,p.SITUATION,p.MDP,p.IDPERS from PERSONNE p WHERE p.LOGIN='"+username+"'");
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );

            rs.next();
            int role = rs.getInt(3);
            String nom = rs.getString(1);
            String prenom = rs.getString(2);
            String adresse = rs.getString(4);
            String situation = rs.getString(5);
            String mdp = rs.getString(6);
            int id = rs.getInt(7);
            
            if(rs.wasNull()) return null;
            rs.close();
            statement.close();
            con.close();
      
        if(password.equals(mdp)){
                Personne user = new Personne(id,nom,prenom,adresse,situation,role);
            }else{
                return null;
                }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    return null;
  }
}
