class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통분모 구하기
        int commonDenom = denom1 * denom2;

        // 통분한 분자 계산
        int numerSum = (numer1 * denom2) + (numer2 * denom1);

        // 분자와 분모의 최대공약수 구하기
        int gcd = getGcd(commonDenom, numerSum);

        // 최대공약수로 나눠서 기약분수 형태로 변환
        int resultDenom = commonDenom / gcd;
        int resultNumer = numerSum / gcd;

        return new int[] {resultNumer, resultDenom};
    }

    // 최대공약수 계산 함수
    private int getGcd(int a, int b) {
        // 절댓값 처리
        a = Math.abs(a);
        b = Math.abs(b);

        // b가 0이 될때까지 반복
        while (b != 0){
            // 나머지를 구함
            int temp = a % b;
            a = b;
            b = temp;
        }

        // b가 0이 되면 a가 최대공약수
        return a;

    }
}