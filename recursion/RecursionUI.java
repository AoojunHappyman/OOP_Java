public class RecursionUI{

    public static int sumEven(int n){
        if(n <= 1){
            return 0;
        }
        if (n % 2 != 0) return sumEven(n - 1);
        return n + sumEven(n - 2);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) return "";
        return reverseString(str.substring(1)) + str.charAt(0);
    }
 
    public static void main(String[] args) {
        System.out.println("Sum of even numbers up to 6: " + sumEven(6));
        System.out.println("Sum of even numbers up to 7: " + sumEven(7));
        System.out.println("Reversed String of \"world\": " + reverseString("world"));
        System.out.println("Reversed String of \"hello\": " + reverseString("hello"));
    }
}
