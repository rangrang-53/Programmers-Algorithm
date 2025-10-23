import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
            // 약수
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) result.add(i);
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(i -> i).toArray();
    }
}