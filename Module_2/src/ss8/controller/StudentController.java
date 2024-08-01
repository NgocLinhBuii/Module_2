package ss8.controller;

import ss8.model.Student;
import ss8.service.student_service.IStudentService;
import ss8.service.student_service.StudentServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();
    private final Scanner sc = new Scanner(System.in);
    private final List<Student> students = new ArrayList<>();

    public void displayStudent() {
        List<Student> students = iStudentService.findAll();
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void addStudent() {
        System.out.println("Nhập ID học viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã học viên");
        String code = sc.nextLine();
        System.out.println("Nhập tên học viên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String pattern = "dd/MM/yyyy";
        LocalDate birthday = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(pattern));
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập lớp học viên");
        String className = sc.nextLine();
        Student student = new Student(id, code, name, birthday, email, className);
        iStudentService.addNewStudent(student);
    }

    public void deleteStudent() {
        List<Student> students = iStudentService.findAll();
        System.out.println("Nhập mã học viên cần xóa: ");
        String studentCode = sc.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getCode().equals(studentCode)) {
                students.remove(student);
                System.out.println("\nXóa thành công học viên!");
                found = true;
                break;
            }
        }if(!found){
        System.out.println("Không tìm thấy học viên có mã " + studentCode);
        }
        iStudentService.delete();
    }

    public void editStudent() {
        List<Student> students = iStudentService.findAll();
        System.out.println("Nhập mã học viên cần sửa: ");
        String studentCode = sc.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getCode().equals(studentCode)) {
                System.out.println("Nhập tên học viên: ");
                String name = sc.nextLine();
                System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
                String pattern = "dd/MM/yyyy";
                LocalDate dob = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(pattern));
                System.out.println("Nhập email: ");
                String email = sc.nextLine();
                System.out.println("Nhập tên lớp: ");
                String className = sc.nextLine();
                Student editedStudent = new Student(student.getId(), studentCode, name, dob, email, className);
                students.set(students.indexOf(student), editedStudent);
                System.out.println("\nSửa thông tin học viên thành công!");
                found = true;
                break;
            }
        }if(!found) {
            System.out.println("Không tìm thấy học viên có mã " + studentCode);
        }
        iStudentService.edit();
    }
}
