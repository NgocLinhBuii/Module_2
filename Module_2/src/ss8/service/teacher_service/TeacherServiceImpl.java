package ss8.service.teacher_service;

import ss8.model.Teacher;
import ss8.repository.techer_repository.ITeacherRepository;
import ss8.repository.techer_repository.TeacherRepositoryImpl;

public class TeacherServiceImpl implements ITeacherService{
    private final ITeacherRepository iTeacherRepository = new TeacherRepositoryImpl();

    @Override
    public Teacher[] findAll() {
        return iTeacherRepository.findAll();
    }
}
