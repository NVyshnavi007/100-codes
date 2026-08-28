import java.util.Scanner;
class AutomorphicNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int a=num*num;
        int temp=a%10;
        if(num==temp){
            System.out.println(" it is automorphic number");

        }

        else{
            System.out.println(" it is not automorphic number");
        }
        sc.close();

    }
}