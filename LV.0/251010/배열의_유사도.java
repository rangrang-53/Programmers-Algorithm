class Solution {
    public int solution(String[] s1, String[] s2) {
        int result = 0;
        
        // s1 for 문으로 순환
        for (int i = 0; i < s1.length; i++) {
            // s2 for 문으로 순환
            for (int j = 0; j < s2.length; j++) {
                // s1의 원소값 = s2의 원소값 비교
                if (s1[i].equals(s2[j])) {
                    result++;
                }
            }
        }
        return result;
    }
}