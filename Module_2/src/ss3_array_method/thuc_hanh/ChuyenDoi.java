package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Chuyển C sang F");
            System.out.println("2. Chuyển F sang C");
            System.out.println("3. EXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.print("Nhập độ C cần chuyển sang độ F: ");
                    c = sc.nextDouble();
                    System.out.print("nhiệt độ là " + CsangF(c));
                    break;
                }
                case 2:{
                    System.out.print("Nhập độ F cần chuyển sang độ C: ");
                    f = sc.nextDouble();
                    System.out.print("nhiệt độ là " + FsangC(f));
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
            }
        } while (choice != 0);







    }
        public static double CsangF(double c){
            double result = (9.0 / 5) * c +32;
            return result;
        }

        public static double FsangC(double f){
            double result = (5 / 9.0) * (f - 32);
            return result;
    }
}
