import java.util.Scanner;
class LcmNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n1=sc.nextInt();
        System.out.print("enter another number:");
        int n2=sc.nextInt();
        int lcm=1;
        int res;
        if (n1>n2){
            res=n2;

        }
        else{
            res=n1;
        }
        for (int i=res;i<1+(n1*n2);i++){
            if (i%n1==0 && i%n2==0){
                lcm=i;
                break;
            }
        }
        System.out.println("lcm of two numbers is:"+lcm);
        sc.close();

    }
}