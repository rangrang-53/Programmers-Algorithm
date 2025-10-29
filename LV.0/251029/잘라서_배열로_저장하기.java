class Solution {
    public String[] solution(String my_str, int n) {
        // 조각 개수(올림)
        int chunks = (int)Math.ceil((double)my_str.length() / n);
        String[] result = new String[chunks];
        int idx = 0;
        // for문을 돌면서 문자열을 n개씩 잘라서 배열에 저장
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            result[idx++] = my_str.substring(i, end);
        }
        return result;
    }
}