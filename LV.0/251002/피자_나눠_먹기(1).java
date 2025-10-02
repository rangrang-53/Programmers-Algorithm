class Solution {
    public int solution(int n) {
        // 나눗셈 결과를 올림 처리
        double answer = Math.ceil(n/7.0);

        // Math.ceil은 double을 반환하므로 int로 캐스팅해서 리턴
        return (int) answer;
    }
}