package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số: ");
//        int num;
//        do{
//            num = sc.nextInt();
//        } while(num > 50 || num < 0);

        String[] arrString = {"Ngân", "Thương", "Nam"};
        for (String x : arrString){
            System.out.println(x);
        }
    }
}
