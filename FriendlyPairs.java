import java.util.Scanner;
class FriendlyPairs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n1=sc.nextInt();
        System.out.println("enter another number:");
        int n2=sc.nextInt();
        int s1=0;
        int s2=0;
        for (int i=1;i<n1;i++){
            if (n1%i==0){
                s1=s1+i;
            }
        }
        for (int i=1;i<n2;i++){
            if (n2%i==0){
                s2=s2+i;
            }
        }
        int c1=s1/n1;
        int c2=s2/n2;
        if (c1==c2){
            System.out.println("they are friendly pairs");
        }
        else{
            System.out.println("they are not friendly pairs");
        }
        sc.close();
    }
}