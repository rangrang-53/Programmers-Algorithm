class Solution {
    public int solution(int[] array, int height) {
        // 머쓱이보다 키가 큰 사람의 수를 세는 변수 n 선언
        int n = 0;
        
        // 향상된 for문을 사용해 배열의 모든 원소를 순회
        for (int i : array) {
            // 현재 사람의 키(i)가 머쓱이의 키(height)보다 크면 카운트 증가
            if (i > height) {
                n++;
            }
        }

        // 머쓱이보다 키 큰 사람의 수 반환
        return n;
    }
}
