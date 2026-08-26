import java.util.Scanner;
class RangePrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter end range: ");
        int n2 = sc.nextInt();
        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");
        for(int i = n1; i <= n2; i++){
            if(i > 1){
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}