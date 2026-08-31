import java.util.Scanner;
class BinaryDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter binary number:");
        String binary=sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        System.out.print("the decimal number is:"+decimal);
    sc.close();

    }
}