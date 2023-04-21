import java.util.*;
 
 
public class Test1 {
   public static boolean binary_search(int low, int high, int n) {
       if (low > high)
           return false;
       int mid = low + (high - low) / 2;
       if (mid * mid == n)
           return true;
       if (mid * mid > n)
           return binary_search(low, mid - 1, n);
       return binary_search(mid + 1, high, n);
   }
 
 
   public static boolean judgeSquareSum(int c) {
       for (int a = 0; a * a <= c; a++) {
           int b = c - (int) (a * a);
           if (binary_search(0, b, b))
               return true;
       }
       return false;
   }
 
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int c = sc.nextInt();
       System.out.print((judgeSquareSum(c) ? "YES\n" : "NO\n"));
   }
}
 
