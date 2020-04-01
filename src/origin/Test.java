package origin;

public class Test {
    private static char m3251a(String str, C0680b bVar, C0679a aVar) {
        return aVar.mo3291a(bVar.mo3292a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Boolean m3253b(String str) {
        if (!str.startsWith("flag{")) {
            return Boolean.valueOf(false);
        }
        if (!str.endsWith("}")) {
            return Boolean.valueOf(false);
        }
        String substring = str.substring(5, str.length() - 1);
        C0680b bVar = new C0680b(Integer.valueOf(2));
        C0679a aVar = new C0679a(Integer.valueOf(3));
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            sb.append(m3251a(substring.charAt(i2) + "", bVar, aVar));
        }
        System.out.println("sb: " + sb.toString());
        return Boolean.valueOf(sb.toString().equals("wigwrkaugala"));
    }


    public static void main(String[] args) {
        boolean isOr = m3253b("flag{acfeb}");
        System.out.println("bool : " + isOr);
    }
}
