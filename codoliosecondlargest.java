class codoliosecondlargest {

    public int secondLargestElement(int[] nums) {

        int n = nums.length;

        int largest = nums[0];
        int secondLargest = -1;

        for(int i = 1; i < n; i++) {

            if(nums[i] > largest) {

                secondLargest = largest;
                largest = nums[i];

            }

            else if(nums[i] < largest && nums[i] > secondLargest) {

                secondLargest = nums[i];

            }

        }

        return secondLargest;

    }

}