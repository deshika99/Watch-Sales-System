package Models;

public class User {

    private String Username;
    private String Password;
    private String Type;

    public User(String Username, String Password, String Type) {
        this.Username = Username;
        this.Password = Password;
        this.Type = Type;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
   
}
