import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ex2 {

    static int numberOfHappyStrings(List<String> strings) {
        int cnt = 0;
        for (int i = 0; i < strings.size(); i++) {
            
            if((strings.get(i)).length() < 2) {
                cnt++;
                continue;
            }
            
            int prev = 0;
            boolean happyString = true;
            for (int j = 1; j < (strings.get(i)).length(); j++) {
                if((strings.get(i)).charAt(prev) == (strings.get(i)).charAt(j)) {
                    happyString = false;
                    break;
                }
                prev++;
            }
            if(happyString) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abbcc", "abc", "abcabc", "cabcbb");
        System.out.println(numberOfHappyStrings(strings));
    }

}