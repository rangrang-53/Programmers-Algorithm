class Solution {
    public int solution(int angle) {
        int result = 0;
        
        // 문제 조건에 따른 각도 분류
        // 1: 예각 (0 < angle < 90)
        // 2: 직각 (angle == 90)
        // 3: 둔각 (90 < angle < 180)
        // 4: 평각 (angle == 180)
        if (0 < angle && angle < 90) {
            result = 1;
        } else if (angle == 90) {
            result = 2;
        } else if (90 < angle && angle < 180) {
            result = 3;
        } else {
            result = 4;
        }
        
        return result;
    }
}
