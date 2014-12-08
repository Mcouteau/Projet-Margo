package model;

public class Login {
  public static boolean authenticate(String username, String password) {
    if (username.equals("admin") && password.equals("admin")) {
      return true;
    }
    return false;
  }
}
