package ss8.controller;
import ss8.model.Teacher;
import ss8.service.teacher_service.ITeacherService;
import ss8.service.teacher_service.TeacherServiceImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private final ITeacherService iTeacherService = new TeacherServiceImpl();
    private static final Scanner sc = new Scanner(System.in);
    private final List<Teacher> teachers = new ArrayList<>();

    public void displayTeacher() {
        List<Teacher> teachers = iTeacherService.findAll();
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    public void addTeacher() {
        System.out.println("Nhập ID giảng viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã giảng viên");
        String code = sc.nextLine();
        System.out.println("Nhập tên giảng viên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String pattern = "dd/MM/yyyy";
        LocalDate birthday = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(pattern));
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập luơng giảng viên");
        int salary = Integer.parseInt(sc.nextLine());
        Teacher teacher = new Teacher(id, code, name, birthday, email, salary);
        iTeacherService.addNewTeacher(teacher);
    }

    public void deleteTeacher() {
        List<Teacher> teachers = iTeacherService.findAll();
        System.out.println("Nhập mã giảng viên cần xóa: ");
        String teacherCode = sc.nextLine();
        boolean found = false;
        for (Teacher teacher : teachers) {
            if (teacher.getCode().equals(teacherCode)) {
                teachers.remove(teacher);
                System.out.println("\nXóa thành công!");
                found = true;
                break;
            }
        }if(!found){
        System.out.println("Không tìm thấy giảng viên");
        }
        iTeacherService.deleteTeacher();
    }

    public void editTeacher() {
        List<Teacher> teachers = iTeacherService.findAll();
        System.out.println("Nhập mã giảng viên cần sửa: ");
        String teacherCode = sc.nextLine();
        boolean found = false;
        for (Teacher teacher : teachers) {
            if (teacher.getCode().equals(teacherCode)) {
                System.out.println("Nhập tên giảng viên: ");
                teacher.setName(sc.nextLine());
                System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
                String pattern = "dd/MM/yyyy";
                teacher.setBirthday(LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(pattern)));
                System.out.println("Nhập email: ");
                teacher.setEmail(sc.nextLine());
                System.out.println("Nhập lương: ");
                teacher.setSalary(Integer.parseInt(sc.nextLine()));
                teachers.set(teachers.indexOf(teacher), teacher);
                System.out.println("\nSửa thành công thông tin giảng viên!");
                found = true;
                break;
            }
        }if(!found){
        System.out.println("Không tìm thấy giảng viên");
        }
        iTeacherService.editTeacher();
    }
}
