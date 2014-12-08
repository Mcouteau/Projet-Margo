package controller;

import model.Etudiant;
import model.Enseignant;
import model.Administratif;

public class Login {
  public static Object authenticate(String username, String password) {
    switch(username) {
      case "student":
        if(password.equals("student")) {
          // @todo fetch user information in DB
          Etudiant user = new Etudiant("Jean", "Martin", "Célibataire", "4 Rue des carmes, 44000 Nantes");
          return user;
        }
      case "teacher":
        if(password.equals("teacher")) {
          // @todo fetch user information in DB
          Enseignant user = new Enseignant("Richard", "Demont", "Marié", "25 Place des jonquilles, 44000 Nantes", "BTS NRC");
          return user;
        }
      case "admin":
        if(password.equals("admin")) {
          // @todo fetch user information in DB
          Administratif user = new Administratif("Admin", "Admin", "Rien", "Adresse inconnue");
          return user;
        }
      default:
        return null;
    }
  }
}
