public class MoveZeros
{
 public static void main(String[] args)
{
//Original Array
int[] OrgArr = {0, 1, 0, 3, 12};
 int n = OrgArr.length;//5
//New Array
 int[] NewArr = new int[n];//Creating a new array of size 5
 int index = 0;
// Copy non-zero elements
 for (int i = 0; i < n; i++)
{
 if (OrgArr[i] != 0)
{
 NewArr[index++] = OrgArr[i];
 }
}
 // Print result
 for (int i = 0; i < n; i++) {
 System.out.print(NewArr[i] + " ");}
}
}