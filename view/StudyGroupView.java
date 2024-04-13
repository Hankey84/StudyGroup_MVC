package view;

import model.*;

import java.util.ArrayList;
import java.util.List;
import controller.StudyGroupController;

public class StudyGroupView {
    
    private StudyGroupController studyGroupController = new StudyGroupController();
    private List<User> students;

    public StudyGroupView(){
        this.students = new ArrayList<>();
    }

    public void addStudent(User student){
               students.add(student);
    }
    
    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        System.out.println("Новая учебная группа '" + groupName +"' из " + students.size() + " студентов сформирована, " + teacher);
        return studyGroupController.createStudyGroup(groupName, teacher, students);
    }

    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }

    public List<User> getStudents() {
        return students;
    }
}
