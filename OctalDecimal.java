import java.util.Scanner;
class OctalDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = sc.nextLine();
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.println("Decimal equivalent: " + decimalNumber);
    sc.close();
    }
}