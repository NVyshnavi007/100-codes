import java.util.Scanner;
class Permu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        System.out.println("Enter the number of chairs");
        int r=sc.nextInt();
        int a=n-r;
        int m1=1;
        int m2=1;
        for(int i=1;i<=n;i++){
            m1=m1*i;
        }
        for(int j=1;j<=a;j++){
            m2=m2*j;
        }
        System.out.println("The number of ways in which students can be seated is "+(m1/m2));
    sc.close();

    }
}