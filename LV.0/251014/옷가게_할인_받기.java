class Solution {
    public int solution(int price) {
        int result = 0;

        // 조건별 할인율 적용
        // 1) 100,000원 이상 ~ 300,000원 미만 → 5% 할인
        if (price >= 100000 && price < 300000) {
            result = (int) (price * 0.95);
        }
        // 2) 300,000원 이상 ~ 500,000원 미만 → 10% 할인
        else if (price >= 300000 && price < 500000) {
            result = (int) (price * 0.9);
        }

        // 3) 500,000원 이상 → 20% 할인
        else if (price >= 500000) {
            result = (int) (price * 0.8);
        }
        
        // 4) 그 외 (100,000원 미만) → 할인 없음
        else {
            result = price;
        }
        return result;
    }
}