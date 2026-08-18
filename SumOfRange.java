import java.util.Scanner;
class SumOfRange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start=sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<end+1;i++)
            {
            sum+=i;
            }
        System.out.println("The sum of numbers from "+start+" to "+end+" is: "+sum);

        sc.close();

    }
    

}