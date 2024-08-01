package ss8.service.student_service;

import ss8.model.Student;
import ss8.repository.student_repository.IStudentRepository;
import ss8.repository.student_repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository iStudentRepository = new StudentRepositoryImpl();

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void addNewStudent(Student student) {
        iStudentRepository.addNewStudent(student);
    }

    @Override
    public void delete() {
        iStudentRepository.delete();
    }

    @Override
    public void edit() {
        iStudentRepository.edit();
    }

}
