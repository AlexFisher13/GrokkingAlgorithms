package main.topFifty.greatYear;

public class GreatYear {
    public static void main(String[] args) {
        int year = 2004;
        System.out.println(isGreatYear(year));
    }

    private static boolean isGreatYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else
            return year % 400 == 0;
    }

}
