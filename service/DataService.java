package service;

import java.util.ArrayList;
import java.util.List;
import model.User;
import model.Student;
import model.Teacher;

public class DataService {

    private List<User> student = new ArrayList<>();
    private List<User> teacher = new ArrayList<>();

    public void UserList(User user) {
        if (user instanceof Student) {
            student.add(user);
        } else if (user instanceof Teacher) {
            teacher.add(user);
        }
    }

    public List<User> getUserList(String type) {
        if (type.equals("student")) {
            return student;
        } else if (type.equals("teacher")) {
            return teacher;
        }
        return null;
    }
}