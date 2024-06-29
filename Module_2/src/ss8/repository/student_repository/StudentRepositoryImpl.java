package ss8.repository.student_repository;

import ss8.model.Student;
import java.time.LocalDate;

public class StudentRepositoryImpl implements IStudentRepository {
    private static final Student[] students;
    static {
        students = new Student[10];
        students[0] = new Student(1, "HV-001", "Nguyen Van A", LocalDate.parse("1999-10-20"), "A@gmail.com", "C0324");
        students[1] = new Student(2, "HV-002", "Nguyen Van B", LocalDate.parse("1999-10-20"), "B@gmail.com", "C0324");
        students[2] = new Student(3, "HV-003", "Nguyen Van C", LocalDate.parse("1999-10-20"), "C@gmail.com", "C0324");
        students[3] = new Student(4, "HV-004", "Nguyen Van D", LocalDate.parse("1999-10-20"), "D@gmail.com", "C0324");
    }

    @Override
    public Student[] findAll() {
        return students;
    }
}
