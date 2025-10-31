class Solution {
    public String solution(String polynomial) {
        // 공백 기준으로 나누기
        String[] parts = polynomial.split(" ");
        int xSum = 0;
        int result = 0;

        for (String part : parts) {
            if (part.contains("x")) {
                String num = part.replace("x", "");
                if (num.equals("")){
                    num = "1";
                }
                xSum += Integer.parseInt(num);
            } else if (!part.equals("+")) {
                result += Integer.parseInt(part);
            }
        }

        // 결과 조립
        if (xSum != 0 && result != 0) {
            return (xSum == 1 ? "x" : xSum + "x") + " + " + result;
        } else if (xSum != 0) {
            return  xSum == 1 ? "x" : xSum + "x";
        } else {
            return String.valueOf(result);
        }
    }
}