package view;

import model.*;
import java.util.List;
import controller.StudyGroupController;

public class StudyGroupView {
    private StudyGroupController studyGroupController = new StudyGroupController();
    
    public StudyGroup createStudyGroup(Teacher teacher, List<User> students) {
        System.out.println("Новая учебная группа из " + students.size() + " студентов создана, " + teacher);
        return studyGroupController.createStudyGroup(teacher, students);
    }

    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }
}
