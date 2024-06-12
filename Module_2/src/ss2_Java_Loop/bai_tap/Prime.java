package ss2_Java_Loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra: ");
        int count = sc.nextInt();

        System.out.println("Các số nguyên tố đầu tiên là:");

        int num = 2;
        int printedCount = 0;

        while (printedCount < count) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                printedCount++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
