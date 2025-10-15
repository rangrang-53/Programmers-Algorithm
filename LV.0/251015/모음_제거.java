class Solution {
    public String solution(String my_string) {
        String result = "";
        if (my_string.contains("a") || my_string.contains("e")
                || my_string.contains("i") || my_string.contains("o") || my_string.contains("u")) {
            result = my_string.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
        } else {
            result = my_string;
        }
        return result;
    }
}