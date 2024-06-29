package ss8.service.student_service;

import ss8.model.Student;
import ss8.repository.student_repository.IStudentRepository;
import ss8.repository.student_repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository iStudentRepository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return iStudentRepository.findAll();
    }
}
