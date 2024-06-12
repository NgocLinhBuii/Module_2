package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int []arr;
        do{
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.print("Nhâp lại");
            }
        }while(size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }
        for (int x: arr){
            System.out.print(x + " ");
        }
    }
}
