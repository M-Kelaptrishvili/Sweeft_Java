import java.util.HashSet;
import java.util.Set;

public class ex4 {
    static int[] findIntersection(int[]nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            first.add(Integer.valueOf(nums1[i]));
        }

        for(int i = 0; i < nums2.length; i++) {
            Integer currInteger = Integer.valueOf(nums2[i]);
            if(first.contains(currInteger)) result.add(currInteger);
        }
        
        Object[] integerArrayResult = result.toArray();
        int[] intArrayResult = new int[integerArrayResult.length];
        for (int i = 0; i < integerArrayResult.length; i++) {
            intArrayResult[i] = ((Integer)integerArrayResult[i]).intValue();
        }
        return intArrayResult;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{3,4,4,5,6,7};
        int[] intersection = findIntersection(nums1, nums2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }
    }
}