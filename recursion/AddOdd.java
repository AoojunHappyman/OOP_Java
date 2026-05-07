import java.util.Scanner;

public class AddOdd {
    public static int sumOdd(int n){
        if(n == 0) return 0;
        if(n %2 != 0) return n + sumOdd(n - 1);
        return sumOdd(n-1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOdd(n));
    }
}
