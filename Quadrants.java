import java.util.Scanner;
class Quadrants{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point is in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in Quadrant IV.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point is on the Y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("The point is on the X-axis.");
        } else {
            System.out.println("The point is at the origin.");
        }
    scanner.close();
    }
}