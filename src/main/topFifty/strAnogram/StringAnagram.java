package main.topFifty.strAnogram;

public class StringAnagram {
    public static void main(String[] args) {
        String a = "армия";
        String b = "Мария";
        System.out.println(isAnagram(a, b));
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            char[] charsA = a.toLowerCase().toCharArray();
            char[] charsB = b.toLowerCase().toCharArray();
            return charsContainsChars(charsA, charsB)
                    && charsContainsChars(charsB, charsA);
        }
        return false;
    }

    private static boolean charsContainsChars(char[] charsA, char[] charsB) {
        boolean flag = false;
        for (char ca : charsA) {
            for (char cb : charsB) {
                if (ca == cb) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                flag = false;
            else
                return false;
        }
        return true;
    }
}
