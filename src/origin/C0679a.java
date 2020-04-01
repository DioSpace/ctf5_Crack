package origin;

import java.util.ArrayList;

public class C0679a {

    /* renamed from: a */
    public static ArrayList<Integer> f2483a = new ArrayList<>();
    //21,4,24,25,20,5,15,9,17,6,13,3,18,12,10,19,0,22,2,11,23,1,8,7,14,16

    /* renamed from: b */
    static String f2484b = "abcdefghijklmnopqrstuvwxyz";

    /* renamed from: d */
    static Integer f2485d = Integer.valueOf(0);

    /* renamed from: c */
    Integer[] f2486c = {Integer.valueOf(7), Integer.valueOf(14), Integer.valueOf(16), Integer.valueOf(21), Integer.valueOf(4), Integer.valueOf(24), Integer.valueOf(25), Integer.valueOf(20), Integer.valueOf(5), Integer.valueOf(15), Integer.valueOf(9), Integer.valueOf(17), Integer.valueOf(6), Integer.valueOf(13), Integer.valueOf(3), Integer.valueOf(18), Integer.valueOf(12), Integer.valueOf(10), Integer.valueOf(19), Integer.valueOf(0), Integer.valueOf(22), Integer.valueOf(2), Integer.valueOf(11), Integer.valueOf(23), Integer.valueOf(1), Integer.valueOf(8)};
    //7,14,16,21,4,24,25,20,5,15,9,17,6,13,3,18,12,10,19,0,22,2,11,23,1,8

    //3
    public C0679a(Integer num) {
        for (int intValue = num.intValue(); intValue < this.f2486c.length; intValue++) {
            f2483a.add(this.f2486c[intValue]);
        }
        //21,4,24,25,20,5,15,9,17,6,13,3,18,12,10,19,0,22,2,11,23,1,8
        for (int i = 0; i < num.intValue(); i++) {
            f2483a.add(this.f2486c[i]);
        }
        //21,4,24,25,20,5,15,9,17,6,13,3,18,12,10,19,0,22,2,11,23,1,8,7,14,16
    }

    /* renamed from: a */
    public static void m3254a() {
//        Integer num = f2485d;
        f2485d = Integer.valueOf(f2485d.intValue() + 1);
        if (f2485d.intValue() == 25) {
            int intValue = ((Integer) f2483a.get(0)).intValue();
            f2483a.remove(0);
            f2483a.add(Integer.valueOf(intValue));
            f2485d = Integer.valueOf(0);
        }
    }

    /* renamed from: a */
    public char mo3291a(Integer num) {
        Integer valueOf = Integer.valueOf(0);
        if (num.intValue() == -10) {
            m3254a();
            return " ".charAt(0);
        }
        for (int i = 0; i < f2483a.size() - 1; i++) {
            if (f2483a.get(i) == num) {
                valueOf = Integer.valueOf(i);
            }
        }
        m3254a();
        return f2484b.charAt(valueOf.intValue());
    }

}
