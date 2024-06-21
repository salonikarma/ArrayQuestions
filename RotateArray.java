

    public class RotateArray {

        public static void main(String[] args) {
            // Example usage
            int[] arr = {1, 2, 3, 4, 5};
            int d = 2;
            int n = arr.length;

            // Rotate the array
            rotateArr(arr, d, n);

            // Print the rotated array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // Function to rotate an array by d elements in counter-clockwise direction.
        static void rotateArr(int arr[], int d, int n) {
            // Normalize d if it is greater than or equal to n
            d = d % n;

            // Temporary array to store the rotated elements
            int[] ar = new int[n];

            // Copy the rotated part of the array
            for(int i = 0; i < n; i++) {
                ar[i] = arr[(i + d) % n];
            }

            // Copy the temporary array back to the original array
            for(int i = 0; i < n; i++) {
                arr[i] = ar[i];
            }
        }
    }

