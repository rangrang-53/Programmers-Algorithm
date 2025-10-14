class Solution {
    public int solution(String str1, String str2) {
        int result = 0;

        // str1 안에 str2이 포함되어 있으면 1 반환환
        if(str1.contains(str2)) {
            result = 1;
        }
        
        // str1 안에 str2이 포함되어 있지 않으면 2 반환
        else {
            result = 2;
        }
        return result;
    }
}