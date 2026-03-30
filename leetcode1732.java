class leetcode1732 {

    public static int largestAltitude(int[] gain) {

        int current = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++) {

            current = current + gain[i];

            if(current > max) {
                max = current;
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] gain = {-5,1,5,0,-7};

        int result = largestAltitude(gain);

        System.out.println(result);
    }
}