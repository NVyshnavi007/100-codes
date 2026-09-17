class NonZero{
    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);

    }
    public static void main(String args[]){
        int n=5;
        int factorial=fact(n);
        while ((factorial%10)==0){
            factorial=factorial/10;

        }
        System.out.println(factorial%10);
    }
}