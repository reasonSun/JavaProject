package leetcode;

public class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("words = " + words[i]);

        }
        return "";
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        test.solution("try hello world");
    }
}
