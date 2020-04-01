package origin;

import java.util.ArrayList;

public class C0680b {
    /* renamed from: a */
    public static ArrayList<Integer> f2487a = new ArrayList<>();
    //17,23,7,22,1,16,6,9,21,0,15,5,10,18,2,24,4,11,3,14,19,12,20,13,8,25

    /* renamed from: b */
    static String f2488b = "abcdefghijklmnopqrstuvwxyz";

    /* renamed from: d */
    static Integer f2489d = Integer.valueOf(0);

    /* renamed from: c */
    //8,25,17,23,7,22,1,16,6,9,21,0,15,5,10,18,2,24,4,11,3,14,19,12,20,13
    Integer[] f2490c = {Integer.valueOf(8), Integer.valueOf(25), Integer.valueOf(17), Integer.valueOf(23), Integer.valueOf(7), Integer.valueOf(22), Integer.valueOf(1), Integer.valueOf(16), Integer.valueOf(6), Integer.valueOf(9), Integer.valueOf(21), Integer.valueOf(0), Integer.valueOf(15), Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(18), Integer.valueOf(2), Integer.valueOf(24), Integer.valueOf(4), Integer.valueOf(11), Integer.valueOf(3), Integer.valueOf(14), Integer.valueOf(19), Integer.valueOf(12), Integer.valueOf(20), Integer.valueOf(13)};

    //2
    public C0680b(Integer num) {
        for (int intValue = num.intValue(); intValue < this.f2490c.length; intValue++) {
            f2487a.add(this.f2490c[intValue]);
        }
        //17,23,7,22,1,16,6,9,21,0,15,5,10,18,2,24,4,11,3,14,19,12,20,13
        for (int i = 0; i < num.intValue(); i++) {
            f2487a.add(this.f2490c[i]);
        }
        //17,23,7,22,1,16,6,9,21,0,15,5,10,18,2,24,4,11,3,14,19,12,20,13,8,25
    }

    /* renamed from: a */
    public static void m3256a() {
        int intValue = ((Integer) f2487a.get(0)).intValue();
        f2487a.remove(0);
        f2487a.add(Integer.valueOf(intValue));
        f2488b += "" + f2488b.charAt(0);
        f2488b = f2488b.substring(1, 27);
//        Integer num = f2489d;
        f2489d = Integer.valueOf(f2489d.intValue() + 1);
    }

    /* here  ======================== 1 */
    /* renamed from: a */
    public Integer mo3292a(String str) {
        Integer valueOf = Integer.valueOf(0);
        if (f2488b.contains(str.toLowerCase())) {
            Integer valueOf2 = Integer.valueOf(f2488b.indexOf(str));//在字母表中的index
            for (int i = 0; i < f2487a.size() - 1; i++) {
                if (f2487a.get(i) == valueOf2) {
                    valueOf = Integer.valueOf(i);
                }
            }
        } else {
            valueOf = str.contains(" ") ? Integer.valueOf(-10) : Integer.valueOf(-1);
        }
        m3256a();
        return valueOf;
    }

    /* renamed from: b */
    public Integer mo3293b() {
        return f2489d;
    }

}