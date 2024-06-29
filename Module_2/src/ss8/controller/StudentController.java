package ss8.controller;

import ss8.model.Student;
import ss8.service.student_service.IStudentService;
import ss8.service.student_service.StudentServiceImpl;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();
    public void displayStudent(){
        Student[] students = iStudentService.findAll();
        for(Student s : students){
            if(s == null){
                break;
            }
            System.out.println(s);
        }
    }
}
