import java.util.Scanner;
class ArmRang{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find armstrong numbers:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for(int i = start; i <= end; i++){
            int num = i;
            int sum = 0;
            int digits = String.valueOf(num).length();
            while(num > 0){
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}