import java.util.Scanner;
class Powe{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base=sc.nextInt();
        System.out.println("Enter the exponent number: ");
        int exponent=sc.nextInt();
        long result=1;
        for(int i=1;i<=exponent;i++){
            result=result*base;
        }
        System.out.println(result);
        sc.close();
    }
}