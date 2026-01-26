class LeetCode3110d
{

public static void main (String [] args )
{
String s="hello";
int answer=0;
for(int i=0;i<s.length()-1;i++)
{
char first = s.charAt(i);
char second= s.charAt(i+1);
int firstAscii=first;
int secondAscii=second;
int temp =Math.abs( firstAscii-secondAscii);
answer=answer+temp;
}
System.out.println(answer);
}
}