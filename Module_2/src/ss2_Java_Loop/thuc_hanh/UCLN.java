package ss2_Java_Loop.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter b: ");
        b = sc.nextInt();
        if (a == 0 || b == 0){
            System.out.println("không có UC");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN: " + a);
    }
}
