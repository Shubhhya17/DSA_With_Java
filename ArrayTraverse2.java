// Program to find the total number of pairs in the arrays whose sum is equal to the given value x
// S/I  2,4,5,3,1     target = 5
//S/O   2 
import java.util.Scanner;
class ArrayTraverse2 {
    static int ArrayNumbersSum(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the target Value");
        int target = scanner.nextInt();

        System.out.println("Enter the size of Array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the number of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
            int result = ArrayNumbersSum(arr, target);
            System.out.println("Total Number of pairs with sum " + target + " is " + result);

    }
}
