import java.util.ArrayList;
import java.util.List;

//39. 组合总和
public class Solution_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> integerList = new ArrayList<>();
        return null;
    }

    // 回溯标准写法
    public static void bfs(List<List<Integer>> listAll,List<Integer> listInt,int target, int[] candidates, int num) {
        if (target == 0) {
            listAll.add(listInt);
            return ;
        }
        if (target < candidates[num]) return;
        for (int i = num; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>(listInt);
            list.add(candidates[i]);
            bfs(listAll, list, target - candidates[i], candidates, i);
        }
    }
}
