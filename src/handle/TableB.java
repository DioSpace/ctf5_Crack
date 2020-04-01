package handle;

import java.util.ArrayList;

public class TableB {

    //序列表
    public static ArrayList<Integer> table = new ArrayList<>();

    //字母表
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //自增索引
    static int i = 0;

    //原始序列表
    int[] originTable = {8, 25, 17, 23, 7, 22, 1, 16, 6, 9, 21, 0, 15, 5, 10, 18, 2, 24, 4, 11, 3, 14, 19, 12, 20, 13};

    //构造函数 num = 2
    public TableB(int num) {
        //把原始表 2以后的数放在前面
        for (int j = num; j < originTable.length; j++) {
            int tmp = originTable[j];
            table.add(Integer.valueOf(tmp));
        }
        for (int j = 0; j < num; j++) {
            int tmp = originTable[j];
            table.add(Integer.valueOf(tmp));
        }
    }

    //打乱字母表 和 序列表
    public static void upset() {
        //序列表第一个换到最后一个
        int tmp = table.get(0);
        table.remove(0);
        table.add(Integer.valueOf(tmp));

        //字母表第一个换到最后一个
        alphabet += "" + alphabet.charAt(0);
        alphabet = alphabet.substring(1, 27);

        //自增1
        i += 1;
    }

    //查找
    public int lookup(String str) {
        int result = 0;
        if (alphabet.contains(str.toLowerCase())) {//是否在字母表中
            int index = alphabet.indexOf(str);//在字母表中的索引
            for (int j = 0; j < table.size() - 1; j++) {
                if (table.get(j).intValue() == index) {
                    result = j;//序列表中 和 字母表中索引的值 所在的索引
                }
            }
        } else {//如果不在字母表中
            result = str.contains(" ") ? -10 : -1;
        }
        upset();//打乱一次
        return result;
    }

}
