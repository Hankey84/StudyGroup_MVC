package view;

import java.util.List;

import controller.Controller;
import model.*;

public class UserView {
    private Controller controller = new Controller();

    public void addUser(User user) {
        if (user instanceof Student) {
            controller.addUserList(user);
            System.out.println("Студент" + user + "добавлен");
        } else if (user instanceof Teacher) {
            controller.addUserList(user);
            System.out.println("Преподователь" + user + "добавлен");
        }
    }

    public List<User> getUserList(String type) {
        switch (type) {
            case "student":
                return controller.getUserList("student");
            case "teacher":
                return controller.getUserList("teacher");
            default:
                return null;
        }
    }
}