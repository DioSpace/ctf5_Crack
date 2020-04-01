package reverse;

import java.util.ArrayList;

public class TableA {
    //序列表
    public ArrayList<Integer> table = new ArrayList<>();

    //字母表
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //自增索引
    int i = 0;

    //原始序列表
    int[] originTable = {7, 14, 16, 21, 4, 24, 25, 20, 5, 15, 9, 17, 6, 13, 3, 18, 12, 10, 19, 0, 22, 2, 11, 23, 1, 8};

    //构造函数 num = 3
    public TableA(int num) {
        //把原始表 3以后的数放在前面
        for (int i = num; i < originTable.length; i++) {
            int tmp = originTable[i];
            table.add(Integer.valueOf(tmp));
        }
        for (int i = 0; i < num; i++) {
            int tmp = originTable[i];
            table.add(Integer.valueOf(tmp));
        }
    }

    //打乱
    public void upset() {
        i += 1;
        if (i == 25) {
            Integer tmp = table.get(0);
            table.remove(0);
            table.add(tmp);
            i = 0;
        }
    }

    //查找
    public char lookup(int num) {
        int result = 0;
        if (num == -10) {
            upset();//打乱一次
            return " ".charAt(0);
        }
        for (int j = 0; j < table.size() - 1; j++) {
            if (table.get(j) == num) {
                result = j;
            }
        }
        upset();//打乱一次
        return alphabet.charAt(result);
    }
}
