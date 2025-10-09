import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 배열 길이 구하기
        int k = array.length;
        
        // 오름차순 정렬
        Arrays.sort(array);
        
        // 중앙 인덱스 값 선택
        int result = array[k/2];
        
        // 중앙 값 반환
        return result;
    }
}