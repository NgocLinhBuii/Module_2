package ss2_Java_Loop.bai_tap;

public class PrimeNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        for (int num = 2; num < 100; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}