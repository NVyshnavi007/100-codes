import java.util.Scanner;
class Decoder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int c=1;
        while (num>0){
            int digit = num%10;
            c=c+1;
            if ((num/10)>26){
                num=num/10;
            }
            else{
                break;
            }
        
            
    

        }
        System.out.println("the number of ways to decode the given number is:"+c);
        sc.close();
    }
}