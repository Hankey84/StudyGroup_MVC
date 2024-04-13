package controller;

import model.*;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    StudyGroupService studyGroupService = new StudyGroupService();


    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        return studyGroupService.createStudyGroup(groupName, teacher, students);
    }
}
