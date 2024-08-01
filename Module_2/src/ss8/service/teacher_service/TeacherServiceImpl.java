package ss8.service.teacher_service;

import ss8.model.Teacher;
import ss8.repository.techer_repository.ITeacherRepository;
import ss8.repository.techer_repository.TeacherRepositoryImpl;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherRepository iTeacherRepository = new TeacherRepositoryImpl();

    @Override
    public List<Teacher> findAll() {
        return iTeacherRepository.findAll();
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        iTeacherRepository.addNewTeacher(teacher);
    }

    @Override
    public void deleteTeacher() {
        iTeacherRepository.delete();
    }

    @Override
    public void editTeacher() {
        iTeacherRepository.edit();
    }
}

