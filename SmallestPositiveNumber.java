
    public class SmallestPositiveNumber {
        // Function to find the smallest positive number missing from the array.
        static int missingNumber(int arr[], int size) {
            int i = 0;
            // Step 1: Place each number in its correct index position if possible
            while (i < size) {
                // Check if the number is positive and within the range [1, size]
                if (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                    // Swap arr[i] with arr[arr[i]-1] to place arr[i] in its correct position
                    int correctIndex = arr[i] - 1;
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++; // Move to the next if current is already in place
                }
            }
            // Step 2: Find the smallest positive missing number
            for (i = 0; i < size; i++) {
                if (arr[i] != i + 1) // If arr[i] != i+1, then (i+1) is the missing number
                    return i + 1;
            }
            // Step 3: If all numbers from 1 to size are present, the missing number is size + 1
            return size + 1;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 0};
            System.out.println("Smallest positive missing number: " + missingNumber(arr1, arr1.length)); // Output: 3

            int[] arr2 = {3, 4, -1, 1};
            System.out.println("Smallest positive missing number: " + missingNumber(arr2, arr2.length)); // Output: 2

            int[] arr3 = {1, 2, 3, 4, 5};
            System.out.println("Smallest positive missing number: " + missingNumber(arr3, arr3.length)); // Output: 6
        }
    }

