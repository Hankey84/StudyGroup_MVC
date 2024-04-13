package service;

import java.util.List;
import model.*;

public class StudyGroupService {

    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        return new StudyGroup(groupName, teacher, students);
    }
}
