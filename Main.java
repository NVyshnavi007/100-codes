import java.util.Scanner;
class Main {

    static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    static boolean isPrime(int n, int i) {

        if (n == i) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else {
            return isPrime(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
