package ss8.controller;

import ss8.model.Teacher;
import ss8.service.teacher_service.ITeacherService;
import ss8.service.teacher_service.TeacherServiceImpl;

public class TeacherController {
    private ITeacherService iTeacherService = new TeacherServiceImpl();
    public void displayTeacher(){
        Teacher[] teachers = iTeacherService.findAll();
        for(Teacher t : teachers){
            if(t == null){
                break;
            }
            System.out.println(t);
        }
    }
}
