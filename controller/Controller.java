package controller;
import service.DataService;
import java.util.List;

import model.User;

// 1. Создать package – controller. Работу продолжаем в нем
// 2. Создать класс Controller агрегирующий в себе необходимые классы в виде полей, а инициализируем прям в поле.

public class Controller {
    
    DataService service = new DataService();


    public void UserList(User user){
        service.UserList(user);
        
    }

    public List<User> getUserList(String type){
        return service.getUserList(type);
    }
}