import java.util.Scanner;
class Palin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        while(num>0){
            int rev=0;
            int temp=num;
            while(temp>0){
                int digit=temp%10;
                rev=rev*10+digit;
                temp=temp/10;
            }
            if(num==rev){
                System.out.println(num+" is a palindrome");
            }else{
                System.out.println(num+" is not a palindrome");
            }
            System.out.println("enter a number");
            num=sc.nextInt();
        }
        sc.close();

    }
}