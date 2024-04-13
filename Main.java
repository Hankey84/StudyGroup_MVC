import model.*;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> students;

    public Main(){
        this.students = new ArrayList<>();
    }

    public void addStudent(User student){
               students.add(student);
    }
    public static void main(String[] args) {
        // Создаем экземпляры класса User(его потомков) для проверки работы MVC
        User student1 = new Student("Иванов Иван", 19);
        User student2 = new Student("Петров Максим", 19);
        User student3 = new Student("Легкова Марина", 21);
        User student4 = new Student("Пряничникова Маша", 20);
        User teacher1 = new Teacher("Перельман Григорий", 57, "математика");
        User student5 = new Student("Николаев Семён", 21);
        User student6 = new Student("Юрьева Татьяна", 19);
        User student7 = new Student("Никифирова Анна", 20);
        User student8= new Student("Комаров Павел", 19);
        User student9= new Student("Синичкина Валерия", 20);
        User teacher2 = new Teacher("Ландау Лев", 60, "физика");

        Main students1 = new Main();
        students1.addStudent(student1);
        students1.addStudent(student2);
        students1.addStudent(student3);
        students1.addStudent(student4);
        Main students2 = new Main();
        students2.addStudent(student5);
        students2.addStudent(student6);
        students2.addStudent(student7);
        students2.addStudent(student8);
        students2.addStudent(student9);

        // Добавление студентов через представление пользователей(делали на 5 семинаре)
        // UserView userView = new UserView();
        // userView.addUser(student1);
        // userView.addUser(student2);
        // userView.addUser(student3);
        // userView.addUser(student4);
        // userView.addUser(teacher1);        
        // System.out.println(userView.getUserList("student"));
        // System.out.println(userView.getUserList("teacher"));
        
        // Создание и отображение учебных групп
        StudyGroupView studyGroupView = new StudyGroupView();
        StudyGroup studyGroup1 = studyGroupView.createStudyGroup("М-100", (Teacher)teacher1, students1.getStudents());
        StudyGroup studyGroup2 = studyGroupView.createStudyGroup("Ф-200", (Teacher)teacher2, students2.getStudents());
        studyGroupView.displayStudyGroup(studyGroup1);
        studyGroupView.displayStudyGroup(studyGroup2);
    }

    public List<User> getStudents() {
        return students;
    }
}