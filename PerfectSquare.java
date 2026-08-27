import java.util.Scanner;
class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int a = (int) Math.sqrt(num);
        if (a * a == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
        scanner.close();
    }
}