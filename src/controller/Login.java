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
public class Login {
  public static boolean authenticate(String username, String password) {
    switch(username) {
      case "student":
        return password.equals("student");
      case "teacher":
        return password.equals("teacher");
      case "admin":
        return password.equals("admin");
    }
    return false;
  }
}
