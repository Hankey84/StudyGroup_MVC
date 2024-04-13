package controller;
import service.DataService;
import java.util.List;

import model.User;

public class Controller {
    
    DataService service = new DataService();


    public void addUserList(User user){
        service.addUserList(user);        
    }

    public List<User> getUserList(String type){
        return service.getUserList(type);
    }
}