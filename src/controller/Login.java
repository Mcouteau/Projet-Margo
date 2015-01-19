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
import model.Technicien;

public class Login {
 
  public static Object authenticate(String username, String password) {
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
            
            ResultSet rs = statement.executeQuery("select p.NOM,p.PRENOM,t.LIBELLE,p.ADRESSE,p.SITUATION,p.MDP from PERSONNE p inner join TYPEPERSONNE t ON p.TYPEPERSONNE=t.ID WHERE p.LOGIN='"+username+"'");
            //ResultSet rs = statement.executeQuery("select * from \"classe\" where nom='"+SaisieNom.getText()+"'" );
            //ResultSet rs = statement.executeQuery("SELECT table_name FROM user_tables" );

            rs.next();
            String role = rs.getString(3);
            String nom = rs.getString(1);
            String prenom = rs.getString(2);
            String adresse = rs.getString(4);
            String situation = rs.getString(5);
            String mdp = rs.getString(6);
            
            if(rs.wasNull()) return null;
            rs.close();
            statement.close();
            con.close();
            switch(role) {
      case "Etudiant":
        if(password.equals(mdp)) {
          // @todo fetch user information in DB
          Etudiant user = new Etudiant(nom, prenom, adresse, situation);
          return user;
        }
      case "Professeur":
        if(password.equals(mdp)) {
          // @todo fetch user information in DB
          Enseignant user = new Enseignant(nom, prenom, adresse, situation,"");
          return user;
        }
      case "Administratif":
        if(password.equals(mdp)) {
          // @todo fetch user information in DB
          Administratif user = new Administratif(nom, prenom, adresse, situation);
          return user;
        }
      case "Intervenant":
        if(password.equals(mdp)) {
          // @todo fetch user information in DB
          Intervenant user = new Intervenant(nom, prenom, adresse, situation);
          return user;
        }
      case "Technicien":
        if(password.equals(mdp)) {
          // @todo fetch user information in DB
          Technicien user = new Technicien(nom, prenom, adresse, situation,"");
          return user;
        }
      default:
        return null;
    }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    return null;
  }
}
