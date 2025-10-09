import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 오름차순으로 정렬
        Arrays.sort(array);

        int result = array[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {

            // 현재 값과 이전 값이 같을 때만 count ++
            if (array[i] == array[i - 1]) {
                count++;
            } else{
                count = 1;
            }

            // 최빈값 갱신
            if (count > maxCount) {
                maxCount = count;
                result = array[i];
            } else if (count == maxCount) {
                result = -1;
            }
        }
        return result;
    }
}