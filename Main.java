
import model.Student;
import model.User;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        User student = new Student("Иванов Иван", 19, 123);
    User student1 = new Student("Петров Максим", 19, 124);
    User student2= new Student("Легкова Марина", 21, 125);
    User student3 = new Student("Пряничникова Маша", 20, 126);

    StudentView studentView = new StudentView();
    studentView.UserList(student);
    studentView.UserList(student1);
    studentView.UserList(student2);
    studentView.UserList(student3);

    System.out.println(studentView.getUserList());
    }
    

    
} 