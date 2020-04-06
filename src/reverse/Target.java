package reverse;

public class Target {

    private static String ciphertext = "";

    private static char getChar(String str, TableB bVar, TableA aVar) {
        return aVar.lookup(bVar.lookup(str));
    }

    public static boolean judge(String str) {
//        if (!str.startsWith("flag{")) {
//            return false;
//        }
//        if (!str.endsWith("}")) {
//            return false;
//        }
//        String substring = str.substring(5, str.length() - 1);
        String substring = str;
        TableB bVar = new TableB(2);
        TableA aVar = new TableA(3);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < substring.length(); j++) {
            sb.append(getChar(substring.charAt(j) + "", bVar, aVar));
        }
//        System.out.println("sb : " + sb.toString());
        return sb.toString().equals(ciphertext);
    }

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    static String target = "wigwrkaugala";//wigwrkaugala

    public void tryFunc() {
        String tryStr = "";
        for (int i = 0; i < target.length(); i++) {
            ciphertext = target.substring(0, i + 1);
            for (int k = 0; k < alphabet.length(); k++) {
                char c = alphabet.charAt(k);
                String tmp = String.valueOf(c);
//                    System.out.println("tmp " + tmp);
                if (judge((tryStr + tmp))) {
                    tryStr += tmp;
                    System.out.println("tryStr : " + tryStr);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
//        boolean isOr = judge("aaa");
//        System.out.println("bool : " + isOr);

        Target target = new Target();
        target.tryFunc();
    }

}
