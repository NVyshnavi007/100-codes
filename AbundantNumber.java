import java.util.Scanner;
class AbundantNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum>num){
            System.out.println("it is abundant number");
        }
        else{
            System.out.println("it is not abundant number");
        }
        sc.close();
    }
}