import java.util.Scanner;
import java.util.ArrayList;

class PrimeRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find prime numbers:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {

            boolean isPrime = true;

            if (i < 2) {
                isPrime = false;
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                a.add(i);
            }
        }

        System.out.println(a);

        sc.close();
    }
}