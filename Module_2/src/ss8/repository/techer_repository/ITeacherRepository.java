package ss8.repository.techer_repository;

import ss8.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> findAll();
    void addNewTeacher(Teacher teacher);
    void delete();
    void edit();
}
