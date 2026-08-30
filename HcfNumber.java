import java.util.Scanner;
class HcfNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n1=sc.nextInt();
        System.out.println("enter another number:");
        int n2 = sc.nextInt();
        int min=0;
        int hcf=1;
        if (n1>n2){
            min=n2;

        }
        else{
            min=n1;
        }
        for (int i=1;i<min;i++){
            if (n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println("hcf of two numbers is "+hcf);
        sc.close();

    }
}