import model.*;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User student = new Student("Иванов Иван", 19);
        User student1 = new Student("Петров Максим", 19);
        User student2 = new Student("Легкова Марина", 21);
        User student3 = new Student("Пряничникова Маша", 20);
        User teacher1 = new Teacher("Грозный Иван", 50, "математика");

        List<User> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // UserView userView = new UserView();
        // userView.UserList(student);
        // userView.UserList(student1);
        // userView.UserList(student2);
        // userView.UserList(student3);
        // userView.UserList(teacher1);

        StudyGroupView studyGroupView = new StudyGroupView();

        // System.out.println(userView.getUserList("student"));
        // System.out.println(userView.getUserList("teacher"));

        // Создание и отображение учебной группы
        StudyGroup studyGroup = studyGroupView.createStudyGroup((Teacher)teacher1, students);
        studyGroupView.displayStudyGroup(studyGroup);

    }
}