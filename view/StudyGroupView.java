package view;

import model.*;
import java.util.List;
import controller.StudyGroupController;

public class StudyGroupView {
    private StudyGroupController studyGroupController = new StudyGroupController();
    
    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        System.out.println("Новая учебная группа '" + groupName +"' из " + students.size() + " студентов сформирована, " + teacher);
        return studyGroupController.createStudyGroup(groupName, teacher, students);
    }

    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }
}
