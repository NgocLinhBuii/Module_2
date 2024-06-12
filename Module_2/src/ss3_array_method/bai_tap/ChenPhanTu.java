package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        if(index <= -1 || index >= arr.length){
            System.out.println("Không có vị trí");
        }
        int []newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = x;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("Mảng mới: ");
        for(int c : newArr){
            System.out.print(c + " ");
        }
    }
}
