package in.olc.logicbuilding.in.olc.logicbuilding.java.arrays;

public class ArrayRot_Opt {
        // Function to leftRotate array multiple
        // times
        static void leftRotate(int[] arr, int n, int k)
        {
        /* To get the starting point of
        rotated array */
            int mod = k % n;
            int temp;
            // Prints the rotated array from
            // start position
            for (int i = 0; i < n; ++i) {
                temp = (i + mod) % n;
                System.out.print(arr[(i + mod) % n] + " ");
            }
            System.out.println();
        }

        // Driver code
        public static void main(String[] args)
        {
            int[] arr = { 1, 3, 5, 7, 9 };
            int n = arr.length;

            int k = 2;

            // Function Call
            leftRotate(arr, n, k);

            k = 3;

            // Function Call
            leftRotate(arr, n, k);

            k = 4;

            // Function Call
            leftRotate(arr, n, k);
        }

}
