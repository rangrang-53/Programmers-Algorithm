class Solution {
    public int solution(String my_string) {
        // my_string 안의 자연수들의 합을 return
        int result = 0;
        // 연속된 숫자를 문자열 형태로 임시 저장
        String temp = "";

        // my_string의 원소를 하나씩 쪼개기
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            // 쪼갠 원소가 숫자 형태의 문자열일 때
            if (ch >= '0' && ch <= '9') {
                temp += ch;
            }
            
            // 쪼갠 원소가 숫자 형태의 문자열이 아닐 때
            else {
                if (!temp.equals("")) {
                    result += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (!temp.equals("")) {
            result += Integer.parseInt(temp);
        }
        return result;
    }
}