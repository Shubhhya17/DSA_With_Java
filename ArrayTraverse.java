
//Find the First Repetation number in the Array and Print
// S/I  2 3 4 2 3
// O/P  2 is the first repeting number;
import java.util.Scanner;

class ArrayTraverse {
    static int firstRepetitionNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Elements in the the Array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Number of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = firstRepetitionNumber(arr);
        if (result != -1) {
            System.err.println("The first repeating numbers is: " + result);
        } else {
            System.err.println("No repeating numbers found");
        }
    }
}
