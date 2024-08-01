package ss8.repository.student_repository;

import ss8.model.Student;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepositoryImpl implements IStudentRepository {
    private static final List<Student> students;
    Scanner scanner = new Scanner(System.in);

    static {
        students = new ArrayList<>();
        students.add(new Student(1, "HV-001", "Nguyen Van A", LocalDate.parse("1999-10-20"), "A@gmail.com", "C0324"));
        students.add(new Student(2, "HV-002", "Nguyen Van B", LocalDate.parse("1999-10-20"), "B@gmail.com", "C0324"));
        students.add(new Student(3, "HV-003", "Nguyen Van C", LocalDate.parse("1999-10-20"), "C@gmail.com", "C0324"));
        students.add(new Student(4, "HV-004", "Nguyen Van D", LocalDate.parse("1999-10-20"), "D@gmail.com", "C0324"));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void addNewStudent(Student student) {
        students.add(student);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
