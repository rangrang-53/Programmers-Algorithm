class Solution {
    public int solution(int n, int k) {
        // 서비스 음료 개수: 양꼬치 10인분당 음료 1개 무료
        int freeDrinks = n / 10;
        
        // 총 금액 = (양꼬치 12,000원 × n) + (음료 2,000원 × (k - 서비스 음료))
        return 12000 * n + 2000 * (k - freeDrinks);
    }
}
