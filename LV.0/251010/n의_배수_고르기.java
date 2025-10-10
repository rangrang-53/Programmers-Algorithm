class Solution {
    public int[] solution(String[] strlist) {
        // 결과를 담을 배열 (입력 배열과 같은 길이)
        int[] result = new int[strlist.length];

        // 문자열 배열의 각 요소를 순회하면서
        for (int i = 0; i < strlist.length; i++) {
            // 각 문자열의 길이를 구해 result 배열에 저장
            result[i] = strlist[i].length();
        }

        // 모든 문자열의 길이를 담은 배열 반환
        return result;
    }
}