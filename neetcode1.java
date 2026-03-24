class neetcode1

{
public class Main {
    public static void main(String[] args) {

        int[] originalarr = {1, 4, 1, 2};

        int n = originalarr.length;
        int[] dupearray = new int[2 * n];

        for (int i = 0; i < n; i++) {
            dupearray[i] = originalarr[i];
            dupearray[i + n] = originalarr[i];
        }

        // print result
        for (int i = 0; i < dupearray.length; i++) {
            System.out.print(dupearray[i] + " ");
        }
    }
}