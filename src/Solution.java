class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean flag = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                    }
                }
                if (flag == true)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = strStr("hello", "ll");
        System.out.println(a);
    }
}