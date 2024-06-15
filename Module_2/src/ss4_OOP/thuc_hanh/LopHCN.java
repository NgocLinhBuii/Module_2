package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class LopHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều cao ");
        double height = sc.nextDouble();
        HCN h = new HCN(width, height);
        System.out.println("Hình chữ nhật " + h.display());
        System.out.println("Chu vi " + h.getPerimeter());
        System.out.println("Diện tich " + h.getArea());
    }
}
