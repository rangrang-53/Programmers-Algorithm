class Solution {
    public String solution(String rsp) {
        // StringBuilder: 문자열을 효율적으로 조합하기 위한 도구
        StringBuilder sb = new StringBuilder();

        // 입력된 문자열 rsp를 한 글자씩 확인
        for (int i = 0; i < rsp.length(); i++) {
            // i번째 문자를 꺼냄 ('2', '0', '5' 중 하나)
            char ch = rsp.charAt(i);

            // 가위(2) → 바위(0)
            if (ch == '2') sb.append('0');
            // 바위(0) → 보(5)
            else if (ch == '0') sb.append('5');
            // 보(5) → 가위(2)
            else sb.append('2');
        }

        // StringBuilder에 누적된 문자열을 일반 String으로 변환 후 반환
        return sb.toString();
    }
}
