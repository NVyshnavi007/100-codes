import java.util.Scanner;
class HexDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String hex_num=sc.nextLine();
        int decimal_num=Integer.parseInt(hex_num,16);
        System.out.println("The decimal equivalent of "+hex_num+" is "+decimal_num);
    sc.close();
    }
}