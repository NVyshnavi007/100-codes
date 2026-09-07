import java.util.Scanner;
class SumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        if (num < 2) {
            System.out.println("Number should be greater than or equal to 2.");
            return;
        }
        
        // Check if the number can be expressed as the sum of two prime numbers
        boolean found = false;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " can be expressed as the sum of " + i + " and " + (num - i));
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        }
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}