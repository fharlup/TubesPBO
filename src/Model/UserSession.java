package Model;

public class UserSession {
    private static int id;
    private static String email;
    private static String username;
    private static String password;
    private static String role;
    
  
    public UserSession(String email, String username, String password, String role, int id) {
        UserSession.email = email;
        UserSession.username = username;
        UserSession.password = password;
        UserSession.role = role;
        UserSession.id = id;
    }

    // Getters and setters
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserSession.id = id;
    }
    
    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UserSession.email = email;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserSession.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserSession.password = password;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        UserSession.role = role;
    }
    
    public static void clearSession() {
        id = 0;
        email = null;
        username = null;
        password = null;
        role = null;
    }
}
