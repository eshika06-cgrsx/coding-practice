class leetcode2078 {

    public static int maxDistance(int[] colors) {

        int n = colors.length;
        int maxDist = 0;

        // compare with first house
        for(int i = n-1; i >= 0; i--) {

            if(colors[i] != colors[0]) {
                maxDist = i;
                break;
            }
        }

        // compare with last house
        for(int i = 0; i < n; i++) {

            if(colors[i] != colors[n-1]) {
                maxDist = Math.max(maxDist, n-1-i);
                break;
            }
        }

        return maxDist;
    }


    public static void main(String[] args) {

        int[] colors = {1,1,1,6,1,1,1};

        int result = maxDistance(colors);

        System.out.println(result);
    }
}