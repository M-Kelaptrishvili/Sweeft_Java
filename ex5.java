public class ex5 {
    static int lenOfLongSubarr(int[] array, int k) {
        if(k<0) {
            k*=-1;
            for (int i = 0; i < array.length; i++) {
                array[i] *=-1;
            }
        }
        return lenOfLongSubarrHelper(array, k, 0, 0);
    }

    static int lenOfLongSubarrHelper(int[] array, int k, int cnt, int i) {
        if(k == 0) {
            int result = 0;
            if(i<=(array.length-1)) result = Math.max(lenOfLongSubarrHelper(array, k-array[i], cnt+1, i+1), lenOfLongSubarrHelper(array, k, cnt, i+1));
            return Math.max(cnt, result);
        }
        if(i>(array.length-1)) return -1;

        return Math.max(lenOfLongSubarrHelper(array, k-array[i], cnt+1, i+1), lenOfLongSubarrHelper(array, k, cnt, i+1));
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,2,2,3,4,1};
        int k = 8;
        System.out.println(lenOfLongSubarr(array, k));
    }

}