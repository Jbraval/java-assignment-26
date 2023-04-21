import java.util.*;
 
 
public class Test3 {
   public static int singleNonDuplicate(ArrayList<Integer> a) {
       if (a.size() == 1) return a.get(0);
       int low = 0, high = a.size() - 1, mid, val;
       while (low < high) {
           mid = low + (high - low) / 2;
           val = (mid % 2 == 0) ? mid + 1 : mid - 1;
           if (a.get(mid) == a.get(val)) low = mid + 1;
           else high = mid;
       }
       return a.get(low);
   }
 
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> a = new ArrayList<>();
       for (int i = 0; i < n; i++) {
           a.add(sc.nextInt());
       }
       System.out.print(singleNonDuplicate(a));
   }
}