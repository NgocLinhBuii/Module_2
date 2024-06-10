package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class KtraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Năm nhuận");
                } else{
                    System.out.println("không phải năm nhuận");
                }
            } else {
                System.out.println("năm nhuận");
            }
        } else {
            System.out.println("Không phải năm nhuận");
        }
    }
}
