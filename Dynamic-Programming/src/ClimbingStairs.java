import java.util.Arrays;

public class ClimbingStairs {

    // You can jump 1 or 2 or 3 steps at a time

    //BruteForce
    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);

    }

    //Top Down
    public static int countWaysTD(int n, int[] table) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if (table[n] == -1) {
            table[n] = countWaysTD(n - 1, table) + countWaysTD(n - 2, table) + countWaysTD(n - 3, table);
        }

        return table[n];
    }


    //Bottom Up
    public static int countWaysBU(int n, int[] table) {
        table[0]=1;
        table[1]=1;
        table[2]=2;

        for(int i=3; i<=n; i++){
            table[i] = table[i-1] + table[i-2] + table[i-3];
        }
        return table[n];
    }


    public static void main(String[] args) {

        int n = 6;
        System.out.println(countWays(n));

        int[] table = new int[n+1];
        Arrays.fill(table,-1);
        System.out.println(countWaysTD(n, table));

        int[] bottomUpTable = new int[n+1];
        System.out.println(countWaysBU(n, bottomUpTable));
    }
}
