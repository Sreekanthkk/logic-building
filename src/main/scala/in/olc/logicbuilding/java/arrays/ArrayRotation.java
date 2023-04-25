package in.olc.logicbuilding.in.olc.logicbuilding.java.arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayRotation {
  public static void main(String[] args)
        {
            // Initialize the array
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            // Number of elements to rotate to the right
            int k = 2;

            // Call the rotateArray function to rotate the array
            rotateArray(arr, k);

            // Print the rotated array
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        // Function to rotate an array by k elements to the
        // right
        public static void rotateArray(ArrayList<Integer> arr,
                                       int k)
        {
            // Find the size of the array
            int n = arr.size();

            // Mod k with the size of the array
            // To handle the case where k is greater than the
            // size of the array
            k %= n;

            // Reverse the entire array
            Collections.reverse(arr);

            // Reverse the first k elements
            for (int i = 0; i < k / 2; i++) {
                int temp = arr.get(i);
                arr.set(i, arr.get(k - i - 1));
                arr.set(k - i - 1, temp);
            }

            // Reverse the remaining n-k elements
            for (int i = k; i < (n + k) / 2; i++) {
                int temp = arr.get(i);
                arr.set(i, arr.get(n + k - i - 1));
                arr.set(n + k - i - 1, temp);
            }
        }

}
