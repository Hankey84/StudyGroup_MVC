package service;

// import java.util.ArrayList;
import java.util.List;
import model.*;

public class StudyGroupService {

    // private List<User> students = new ArrayList<>();

    // public void addStudentList(User student){
    //     students.add((Student)student);
    // }

    public StudyGroup createStudyGroup(Teacher teacher1, List<User> students) {
        return new StudyGroup(teacher1, students);
    }
}
