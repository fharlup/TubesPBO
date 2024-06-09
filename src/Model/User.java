package Model;

public abstract class User{
    private String email;
    private String username;
    private String password;
    private String role;
    private int id;

    public User(String email, String username, String password, String role, int id) throws Exception {
        if(email.length()>100){
            throw new Exception("Panjang email tidak boleh lebih dari 100");
        }
        if (username.length() > 50) {
            throw new Exception("Panjang username tidak boleh lebih dari 50");
        }
        if (password.length() > 50) {
            throw new Exception("Panjang password tidak boleh lebih dari 50");
        }
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
