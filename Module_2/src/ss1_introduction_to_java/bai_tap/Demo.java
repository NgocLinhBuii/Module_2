package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        double salary = sc.nextDouble();
        System.out.println(salary);
        float height = sc.nextFloat();
        System.out.println(height);
        char kiTu = sc.next().charAt(0);
        System.out.println(kiTu);
        String hoVaTen = sc.nextLine();
        System.out.println(hoVaTen);
        int tuoi = sc.nextInt();
        System.out.println(tuoi);

    }
}
