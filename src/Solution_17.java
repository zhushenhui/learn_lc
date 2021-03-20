import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//17. 电话号码的字母组合
public class Solution_17 {
    public static Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) return combinations;
        backtrack(combinations, 0, digits, new StringBuffer());
        return combinations;
    }

    public static void backtrack(List<String> combinations, int index, String digits, StringBuffer combination) {
        // 递归结束条件，如果都给的数字对应的字母都取到值
       if (index == digits.length()) {
           combinations.add(combination.toString());
       } else {
           // 拿到数字对应的字母集合
           String letters = phoneMap.get(digits.charAt(index));
            for (char letter : letters.toCharArray()) {
                combination.append(letter);
                backtrack(combinations, index + 1, digits, combination);
                // 当前已经用掉的要删去
                combination.deleteCharAt(index);
            }
       }

    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, 0, digits, new StringBuffer());
        System.out.println(combinations.toString());
    }
}
