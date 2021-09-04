package main.topFifty.printPattern;

public class PrintPattern {
    public static void main(String[] args) {
        int level = 5;
        printTriangle(level);
    }

    private static void printTriangle(int level) {
        for (int i = 1; i < level + 1; i++) {
            for (int k = 0; k < level - i; k++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
