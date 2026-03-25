class neetcodeanagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        int[] count = new int[26];

        // add counts from s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // subtract using t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // check
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}