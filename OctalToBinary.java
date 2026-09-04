import java.util.Scanner;
class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.nextLine();
        
        
        int decimalNumber = Integer.parseInt(octalInput, 8);
        
        
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        
        System.out.println("Decimal number is: " + decimalNumber);
        System.out.println("Binary number is: " + binaryNumber);
        
    scanner.close();
    }
}