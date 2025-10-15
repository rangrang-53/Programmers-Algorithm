class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int [2];
        // 짝수 개수가 해당 배열의 index num = 0, 홀수 개수가 해당 배열의 index num = 1

        for (int i : num_list) {
            if (i % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }
}