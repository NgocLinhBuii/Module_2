package ss3_array_method.bai_tap;

import java.util.Scanner;

public class Dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi kí tự: ");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần đến: ");
        char kyTu = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println(count);
    }
}
