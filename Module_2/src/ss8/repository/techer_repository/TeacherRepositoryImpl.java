package ss8.repository.techer_repository;

import ss8.model.Teacher;

import java.time.LocalDate;

public class TeacherRepositoryImpl implements ITeacherRepository{
    private static final Teacher[] teachers;
    static {
        teachers = new Teacher[10];
        teachers[0] = new Teacher(1,"T-001","Bui Van A", LocalDate.parse("1992-05-10"), "AA@codegym.com",19000);
        teachers[1] = new Teacher(2,"T-001","Bui Van B", LocalDate.parse("1992-05-10"), "BB@codegym.com",19000);
        teachers[2] = new Teacher(3,"T-001","Bui Van C", LocalDate.parse("1992-05-10"), "CC@codegym.com",19000);
    }

    @Override
    public Teacher[] findAll() {
        return teachers;
    }
}
