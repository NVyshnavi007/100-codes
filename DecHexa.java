import java.util.Scanner;
class DecHexa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal representation: " + hexadecimal.toUpperCase());
    sc.close();
    }
}