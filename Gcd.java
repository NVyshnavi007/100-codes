import java.util.Scanner;

class Gcd {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator:");
        int n1 = sc.nextInt();

        System.out.println("Enter denominator:");
        int d1 = sc.nextInt();

        System.out.println("Enter numerator:");
        int n2 = sc.nextInt();

        System.out.println("Enter denominator:");
        int d2 = sc.nextInt();

        int denom = d1 * d2;
        int numer = n1 * d2 + n2 * d1;

        int gcd = gcd(numer, denom);

        numer = numer / gcd;
        denom = denom / gcd;

        System.out.println("The sum of the fractions is: " + numer + "/" + denom);

        sc.close();
    }
}