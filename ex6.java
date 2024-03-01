import java.util.ArrayList;
import java.util.HashMap;

public class ex6 {
    static boolean isValidSequence(int[] array, int[] sequence) {

        HashMap<Integer, ArrayList<Integer> > map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer currArrayInteger = Integer.valueOf(array[i]);
            ArrayList<Integer> newArrayList = map.getOrDefault(currArrayInteger, new ArrayList<>());
            newArrayList.add(Integer.valueOf(i));
            map.put(currArrayInteger, newArrayList);
        }

        int prevIndex = -1;
        for (int i = 0; i < sequence.length; i++) {
            if(!map.containsKey(Integer.valueOf(sequence[i]))) return false;
            
            ArrayList<Integer> currArrayList = map.get(Integer.valueOf(sequence[i]));

            if(prevIndex != -1 && currArrayList.get(0) < prevIndex) return false;
            
            prevIndex = currArrayList.get(0);
            currArrayList.remove(0);
            if(currArrayList.size()==0) map.remove(Integer.valueOf(sequence[i]));
            else map.put(Integer.valueOf(sequence[i]), currArrayList);
            
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = new int[]{5,1,22,25,6,-1,8,10};
        int[] sequence = new int[]{1,6,-1,10};
        System.out.println(isValidSequence(array, sequence));
    }

}