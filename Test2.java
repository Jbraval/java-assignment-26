import java.util.*;
 
 
public class Test2 {
   public static int lowerBound(int[] a, int target) {
       int low = 0, high = a.length - 1, ans = a.length;
 
 
       while (low <= high) {
           int mid = (low + high) / 2;
           if (a[mid] >= target) {
               ans = Math.min(ans, mid);
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
 
 
       return ans;
   }
 
 
   public static ArrayList<Integer> findClosestElements(int[] a, int k, int x) {
       int r = lowerBound(a, x);
       int l = r - 1;
       ArrayList<Integer> ans = new ArrayList<>();
       while (ans.size() != k) {
           if ((r == (int) a.length) || (l >= 0 && Math.abs(a[l] - x) <= Math.abs(a[r] - x))) {
               ans.add(a[l--]);
           } else ans.add(a[r++]);
       }
 
 
       Collections.sort(ans);
       return ans;
   }
 
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
 
 
       int k = sc.nextInt();
 
 
       int x = sc.nextInt();
 
 
       ArrayList<Integer> ans = findClosestElements(a, k, x);
       for (int i = 0; i < k; i++) {
           System.out.print(ans.get(i) + " ");
       }
 
 
   }
}
 
