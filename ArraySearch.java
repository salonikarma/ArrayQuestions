
class ArraySearch {
    public static void main(String args[]) {
        // Example usage
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;

        // Call the search function
        int result = search(arr, n, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    // Function to search an element x in an array arr of size n
    static int search(int arr[], int n, int x) {
        // Corrected code
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}


