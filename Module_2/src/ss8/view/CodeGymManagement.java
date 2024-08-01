package ss8.view;

import ss8.controller.StudentController;
import ss8.controller.TeacherController;

import java.util.Scanner;
//view -> control -> service -> repo
public class CodeGymManagement {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        StudentController studentController = new StudentController();
//        studentController.displayStudent();
//        System.out.println();
//        TeacherController teacherController = new TeacherController();
//        teacherController.displayTeacher();
        chooseFunction();

    }

    public static void chooseFunction() {
        do {
            System.out.println("Lựa chọn chức năng: \n" +
                    "1. Quản lý sinh viên \n" +
                    "2. Quản lý giảng viên \n" +
                    "3. Kết thúc chương trình.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    chooseStudentFunction();
                    break;
                case 2:
                    chooseTeacherFunction();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG NHẬP LẠI.");
            }
        } while (true);
    }

    public static void chooseStudentFunction() {
        do {
            System.out.println("Lựa chọn chức năng: \n" +
                    "1. Hiển thị sinh viên \n" +
                    "2. Thêm mới sinh viên \n" +
                    "3. Chỉnh sửa \n" +
                    "4. Xóa sinh viên \n" +
                    "5. Quay về menu chính");
            int choice = Integer.parseInt(sc.nextLine());
            StudentController studentController = new StudentController();
            switch (choice) {
                case 1:
                    System.out.println("DANH SÁCH SINH VIÊN:");
                    studentController.displayStudent();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa:");
                    studentController.editStudent();
                    break;
                case 4:
                    System.out.println("Xóa sinh viên:");
                    studentController.deleteStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("VUI LÒNG NHẬP LẠI.");
            }
        } while (true);
    }

    public static void chooseTeacherFunction() {
        do {
            System.out.println("Lựa chọn chức năng: \n" +
                    "1. Hiển thị giảng viên \n" +
                    "2. Thêm mới giảng viên \n" +
                    "3. Chỉnh sửa \n" +
                    "4. Xóa giảng viên \n" +
                    "5. Quay về menu chính");
            int choice = Integer.parseInt(sc.nextLine());
            TeacherController teacherController = new TeacherController();
            switch (choice) {
                case 1:
                    System.out.println("DANH SÁCH GIẢNG VIÊN:");
                    teacherController.displayTeacher();
                    break;
                case 2:
                    teacherController.addTeacher();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa:");
                    teacherController.editTeacher();
                    break;
                case 4:
                    System.out.println("Xóa giảng viên:");
                    teacherController.deleteTeacher();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("VUI LÒNG NHẬP LẠI.");
            }
        } while (true);
    }
}
