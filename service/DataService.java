package service;

import java.util.ArrayList;
import java.util.List;
import model.*;


public class DataService {

    private List<User> students = new ArrayList<>();
    private List<User> teacher = new ArrayList<>();

    public void addUserList(User user) {
        if (user instanceof Student) {
            students.add(user);
        } else if (user instanceof Teacher) {
            teacher.add(user);
        }
    }

    public List<User> getUserList(String type) {
        if (type.equals("student")) {
            return students;
        } else if (type.equals("teacher")) {
            return teacher;
        }
        return null;
    }   
}