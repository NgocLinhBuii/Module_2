package ss8.service.student_service;

import ss8.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void addNewStudent(Student student);

    void delete();

    void edit();
}
