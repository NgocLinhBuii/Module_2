package ss3_array_method;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr2D = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
