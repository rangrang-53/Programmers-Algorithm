class Solution {
    public int solution(int a, int b) {
        int g = gcd(a, b);
        b /= g;

        while (b % 2 == 0){
            b /= 2;
        }

        while (b % 5 == 0){
            b /= 5;
        }
        return b == 1 ? 1: 2;
    }

    // 최대 공약수 구하는 함수
    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}