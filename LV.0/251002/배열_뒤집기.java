class Solution {
    public int[] solution(int[] num_list) {
        // 배열 길이
        int k = num_list.length;
        
        // 같은 길이의 결과 배열 준비
        int[] answer = new int[k];
        
        // 뒤집어서 채우기
        for (int i = 0; i < k; i++) {
            answer[i] = num_list[k - 1 - i];
        }
        
        return answer;
    }
}