package minPathSum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1},
                        {1, 5, 1},
                        {4, 1, 1}};
        printGrid(grid);
        int[] shorterRow = getShorterRow(grid);
        int[] shorterColumn = getShorterColumn(grid);
        getWaySum(shorterRow, shorterColumn);
    }

    private static int getWaySum(int[] shorterRow, int[] shorterColumn) {
        int[] trimmedShorterRow = Arrays.copyOf(shorterRow, shorterRow.length - 1);
        int sum = IntStream.of(trimmedShorterRow).sum() + IntStream.of(shorterColumn).sum();
        System.out.println("Minimal Path = " + sum);
        return sum;
    }

    private static int[] getShorterColumn(int[][] grid) {
        int[] shorterColumn = new int[grid.length];
        int[] currentColumn = new int[grid.length];
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                currentSum += grid[j][i];
                currentColumn[j] = grid[j][i];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
                shorterColumn = Arrays.copyOf(currentColumn, currentColumn.length);
            }
            currentSum = 0;
        }
        System.out.println("shorterColumn is " + Arrays.toString(shorterColumn));
        return shorterColumn;
    }

    private static int[] getShorterRow(int[][] grid) {
        int[] shorterRow = new int[grid[0].length];
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                currentSum += grid[i][j];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
                shorterRow = grid[i];
            }
            currentSum = 0;
        }
        System.out.println("shorterRow is " + Arrays.toString(shorterRow));
        return shorterRow;
    }


    private static void printGrid(int[][] grid) {
        int rowsCount = grid.length;
        int columnCount = grid[0].length;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

