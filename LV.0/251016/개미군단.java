class Solution {
    public int solution(int hp) {
        int result = 0;

        //장군 개미 수
        int soldiers = hp / 5;
        
        // 남은 체력
        int exp = hp % 5;
        
        // 병정 개미 수
        int workers = exp / 3;
        
        int exp2 = exp % 3;
        
        // 최소 개수
        result = soldiers + workers + exp2;

        return result;
    }
}