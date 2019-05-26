package leetcode;
import java.util.TreeMap;
/**
 *
 * @author Karina
 */
public class Leetcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] A = new int[] {10,13,12,14,15};
        int[] A = new int[] {5,1,3,4,2};
        int N = A.length;
        boolean[] odd = new boolean[N];
        boolean[] even = new boolean[N];
        odd[N - 1] = true;
        even[N - 1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(A[N - 1], N - 1);

        for (int i = N - 2; i >= 0; i--) {
            int num = A[i];
            Integer lower = map.floorKey(num);
            Integer higher = map.ceilingKey(num);

            if (lower != null) {
                even[i] = odd[map.get(lower)];
                System.out.println("Lower: " + lower + "    Even[i]" + even[i]);
            }

            if (higher != null) {
                odd[i] = even[map.get(higher)];
                System.out.println("Higher: " + higher + "    Odd[i]" + even[i]);
            }

            map.put(A[i], i);
        }

        System.out.println("val:");
        int count = 0;
        for (boolean val : odd) {
            System.out.println(val);
            if (val) count++;
        }
        System.out.println(count);
    }
}
