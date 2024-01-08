package Controllers;
import Models.User;
import java.util.ArrayList;

public class LoginController {
    User userObj;
    ArrayList<User> userDB;

    public LoginController() {
        userDB=new ArrayList<>();
        userDB.add(new User("test1", "123", "invoice"));
        userDB.add(new User("test2", "456", "Employee"));
        userDB.add(new User("test3", "789", "Jobs"));
        userDB.add(new User("test4", "101112", "Suppliers"));
        userDB.add(new User("test5", "131415", "Spareparts"));
    }
    
    public User addUser(String userName, String password, String Type) {
        userObj = new User(userName, password, Type);
        return userObj;
    }
    public User validateUser(User user)
    {
        for(User u:userDB)
        {
            if(user.getUsername().equals(u.getUsername())&& user.getPassword().equals(u.getPassword()))
            {
                return u;
            }
        }
        return null;
    }
}