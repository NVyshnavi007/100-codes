import java.util.Scanner;
class Counting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("enter divisor");
        int d=sc.nextInt();
        int count1=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            if(count==d){
                count1++;
            }
            }
        
        }
        System.out.println(count1);
        sc.close();
    }
}