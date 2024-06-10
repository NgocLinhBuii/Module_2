package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số USD cần đổi: ");
        int usd = sc.nextInt();
        int vnd = usd * 23000;
        System.out.println(vnd);
    }
}
