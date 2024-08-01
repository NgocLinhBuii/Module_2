package ss8.repository.student_repository;

import ss8.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void addNewStudent(Student student);
    void delete();
    void edit();
}
