public class MinArray {

    static int arr[] = {10, 324, 45, 90, 98};

    static int smallest() {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("smallest in given array is " + smallest());
    }
}