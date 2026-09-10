import java.util.Scanner;
class Occurence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("enter a digit to find its occurence");
        int num=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==num){
                count++;
            }
            n=n/10;
        }
        System.out.println("the occurence of the digit is "+count);
        sc.close();
    }
}