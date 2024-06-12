package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int viTri = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                viTri = i;
            }
        }
        System.out.println("max trong mảng là: "+max + " ở vị trí " + viTri);
    }
}
