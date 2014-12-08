package model;

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
