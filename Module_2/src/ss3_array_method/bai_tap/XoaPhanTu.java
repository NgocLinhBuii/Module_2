package ss3_array_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();


        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }


        if (index == -1) {
            System.out.println("Không tìm thấy phần tử cần xóa.");
        } else {

            int[] newArr = new int[arr.length - 1];


            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }


            for (int i = index; i < newArr.length; i++) {
                newArr[i] = arr[i + 1];
            }

            System.out.print("Mảng sau khi xóa phần tử " + x + " là: ");
            for (int c : newArr) {
                System.out.print(c + " ");
            }
        }
    }
}
