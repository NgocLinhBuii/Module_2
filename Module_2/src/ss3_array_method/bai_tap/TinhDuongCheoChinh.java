package ss3_array_method.bai_tap;

import java.util.Scanner;

public class TinhDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ma trận vuông: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử cột " + i + "hàng " + j);
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng = " + sum);
    }
}
