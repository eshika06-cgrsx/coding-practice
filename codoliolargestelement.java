class codoliolargestelement {

    public int largestElement(int[] nums) {

        int n = nums.length;

        int biggestnum = nums[0];

        for(int i = 1; i < n; i++) {

            if(nums[i] > biggestnum) {

                biggestnum = nums[i];

            }

        }

        return biggestnum;

    }

}