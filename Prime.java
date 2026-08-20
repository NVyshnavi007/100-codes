import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("prime number");
                break;
            }
            else{
                System.out.println("not a prime number");
                break;
            }
            
        }
        sc.close();

    }
}