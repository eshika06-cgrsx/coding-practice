class Main {


    static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 1, 5, 2, 3};

        bubbleSort(arr, n);
        printArray(arr, n);
    }
}