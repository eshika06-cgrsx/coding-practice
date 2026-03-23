class leetcode1299 {

    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};

        int maxRight = -1;

        for(int i = arr.length - 1; i >= 0; i--) {

            int temp = arr[i];   // store current value

            arr[i] = maxRight;   // replace with biggest on right

            if(temp > maxRight) {
                maxRight = temp; // update biggest
            }
        }

        // print result
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}