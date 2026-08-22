import java.util.Scanner;
class arm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        while(num>0){
            int sum=0;
            int temp=num;
            int n=String.valueOf(num).length();
            while(temp>0){
                int r=temp%10;
                sum=sum+(int)Math.pow(r,n);
                temp=temp/10;
            }
            if(num==sum){
                System.out.println(num+" is an armstrong number");
            }
            else{
                System.out.println(num+" is not an armstrong number");
            }
            System.out.println("enter a number");
            num=sc.nextInt();
        }
        sc.close();
    }
}