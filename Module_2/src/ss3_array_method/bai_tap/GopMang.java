package ss3_array_method.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử Arr1: ");
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Nhập số lượng phần tử Arr2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        int []arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        }

        for( int x : arr3){
            System.out.print(x);
        }
    }
}
