package ss8.service.teacher_service;

import ss8.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll();
    void addNewTeacher(Teacher teacher);
    void deleteTeacher();
    void editTeacher();
}
