package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh cần tìm: ");
        String input = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input)) {
                System.out.println("Đã tìm thấy tên " + students[i] + " vị trí thứ " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Không tìm thấy");
        }
    }
}
