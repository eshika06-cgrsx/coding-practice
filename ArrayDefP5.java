class ArrayDefP5 {
 public static void main(String[] args) {
String name = "Rakesh Sharma";
int length = name.length();
System.out.println("The Length of the string is : " + length);
for (int i = length - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}
