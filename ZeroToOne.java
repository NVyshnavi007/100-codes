import java.util.Scanner;
class ZeroToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String temp = "";
        if (n == 0) {
            System.out.println("Result: 1");
            sc.close();
            
        }
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                digit = 1;
                temp += String.valueOf(digit);
            } else {
                temp += String.valueOf(digit);
            }
            n = n / 10;
        }
        String result = new StringBuilder(temp).reverse().toString();
        System.out.println("Result:" + result);
        sc.close();
    }
}