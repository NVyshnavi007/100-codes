class StrongNumber{
    public static void main(String[] args) {
        int num = 145; 
        int temp = num;
        int strong = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            strong += fact;
            temp /= 10;
        }

        if (strong == num) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }
}