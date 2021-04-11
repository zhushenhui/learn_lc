import java.util.ArrayList;
import java.util.List;
//22. 括号生成
public class Solution_22 {
    // 暴力法
    public List<String> generateParenthesis_1(int n) {
        List<String> res = new ArrayList<>();
        generateAll(new char[2 * n], 0, res);
        return res;
    }
    public void generateAll(char[] current, int pos, List<String> result) {
        // 当长度相同结束递归
        if (pos == current.length) {
            // 有效的就放进去
            if (valid(current)) {
                result.add(new String(current));
            } // 无效就结束了，else空没写
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current,pos + 1, result);
        }
    }
    public boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
        }
        return balance == 0;
    }

    //
    public List<String> generateParenthesis_2(int n) {
        List<String> res = new ArrayList<>();
        generate(res,new StringBuilder(), 0, 0, n);
        return res;
    }

    public void generate(List<String> res, StringBuilder cur, int left, int right, int max) {
        if (cur.length() == max * 2) {
            res.add(cur.toString());
        }
        if (left < max) {
            cur.append('(');
            generate(res, cur, left + 1, right, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (right < left) {
            cur.append(')');
            generate(res, cur, left, right + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
