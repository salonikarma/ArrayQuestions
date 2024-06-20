
    public class MajorityElement {
        static int majorityElement(int a[], int size) {
            int candidate = a[0];
            int count = 1;

            // Phase 1: Find a candidate for the majority element
            for (int i = 1; i < size; i++) {
                if (a[i] == candidate) {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {
                    candidate = a[i];
                    count = 1;
                }
            }

            // Phase 2: Validate if the candidate is indeed the majority element
            count = 0;
            for (int i = 0; i < size; i++) {
                if (a[i] == candidate) {
                    count++;
                }
            }

            if (count > size / 2) {
                return candidate;
            } else {
                return -1; // No majority element found
            }
        }

        public static void main(String[] args) {
            int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
            int size = arr.length;
            int majority = majorityElement(arr, size);
            if (majority != -1) {
                System.out.println("Majority element is: " + majority);
            } else {
                System.out.println("No majority element found");
            }
        }
    }

