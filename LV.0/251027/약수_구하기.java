import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution (int n){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        Collections.sort(result);
        // ArrayList → int[] 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}