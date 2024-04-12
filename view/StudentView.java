package view;

import java.util.List;

import controller.Controller;
import model.User;

// Создать package – view. Работу продолжаем в нем
//2. Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход

public class StudentView {
    private Controller controller = new Controller();

    public void UserList(User user){
        controller.UserList(user);
        System.out.println("Студент" + user + "добавлен");
        
    }

    public List<User> getUserList(){
        return controller.getUserList("student");
        
    }
    
}