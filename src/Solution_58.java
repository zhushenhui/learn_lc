//58. 最后一个单词的长度
// 注意题目中一次性有多个空格,末尾有空格
public class Solution_58 {
    public static int lengthOfLastWord_1(String s) {
        s = s.trim();
        return s.equals(" ") ? 0 : s.length() - s.lastIndexOf(" ") - 1;
    }

    public int lengthOfLastWord_2(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;

    }
    public static void main(String[] args) {
        int num = lengthOfLastWord_1("  ");
        System.out.println(num);
    }
}
