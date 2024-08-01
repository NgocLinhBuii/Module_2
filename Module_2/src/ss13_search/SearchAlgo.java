package ss13_search;

import java.util.Scanner;

public class SearchAlgo {
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu trong mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap so nguyen can tim kiem");
        int v = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
