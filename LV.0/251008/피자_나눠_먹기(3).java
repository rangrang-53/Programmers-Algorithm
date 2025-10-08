class Solution {
    public int solution(int slice, int n) {
        
        int result = 0;
        
         // 딱 나누어 떨어질 때 → 피자 판 추가 필요 없음
        if (n % slice == 0) {
            result = n/slice;
        }
        
        // 나머지가 있을 때 → 한 판 더 필요
        else {
            result = (n/slice) + 1;
        }

        return result;
    }
}