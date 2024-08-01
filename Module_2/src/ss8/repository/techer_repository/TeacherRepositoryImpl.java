package ss8.repository.techer_repository;

import ss8.model.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepositoryImpl implements ITeacherRepository{
    Scanner scanner = new Scanner(System.in);
    private static final List<Teacher> teachers;
    static {
        teachers = new ArrayList<>();
        teachers.add(new Teacher(1,"T-001","Bui Van A", LocalDate.parse("1992-05-10"), "AA@codegym.com",19000));
        teachers.add(new Teacher(2,"T-001","Bui Van B", LocalDate.parse("1992-05-10"), "BB@codegym.com",19000));
        teachers.add(new Teacher(3,"T-001","Bui Van C", LocalDate.parse("1992-05-10"), "CC@codegym.com",19000));
    }

    @Override
    public List<Teacher> findAll() {
        return teachers;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
