import java.lang.reflect.Array;
import java.util.Scanner;

//WAP
public class abc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Bubble sort");
        System.out.println("2. Selection sort");
        System.out.println("3. Quick sort");
        System.out.println("4. Insertion sort");
        System.out.println("5. Merge sort");

        System.out.println("Enter your choice: ");
        int ch = Integer.parseInt(s.nextLine());
        switch (ch) {
            case 1:
                int arr[] = {5, 1, 4, 2, 8};
                int l = arr.length;

                for (int i = 0; i < l; i++) {
                    for (int j = 1; j < l; j++) {
                        if (arr[j - 1] > arr[j]) {
                            int temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                        }
                    }
                    for(i = 0; i < l; i++) {
                        System.out.println(arr[i]);
                    }
                }
        }
    }
}