package handle;

public class Target {

    private static char getChar(String str, TableB bVar, TableA aVar) {
        return aVar.lookup(bVar.lookup(str));
    }

    public static boolean judge(String str) {
        if (!str.startsWith("flag{")) {
            return false;
        }
        if (!str.endsWith("}")) {
            return false;
        }
        String substring = str.substring(5, str.length() - 1);
        TableB bVar = new TableB(2);
        TableA aVar = new TableA(3);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < substring.length(); j++) {
            sb.append(getChar(substring.charAt(j) + "", bVar, aVar));
        }
        System.out.println("sb : " + sb.toString());
        return sb.toString().equals("wigwrkaugala");
    }

    public static void main(String[] args) {
        boolean isOr = judge("flag{acfeb}");
        System.out.println("bool : " + isOr);
    }
}
