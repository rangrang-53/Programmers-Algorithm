import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // 홀수만 저장할 동적 리스트 생성
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++) {

            // 홀수일 경우에만 리스트에 추가
            if(i % 2 != 0) {
                list.add(i);
            }
        }

        // ArrayList → int[] 배열로 변환
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}