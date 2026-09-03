import java.util.Scanner;
class BinOct{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNum = sc.nextLine();
        
        int decimalNum = Integer.parseInt(binaryNum, 2);
        String octalNum = Integer.toOctalString(decimalNum);
        
        System.out.println("The octal number is: " + octalNum);
    sc.close();
    }
}