import java.util.Arrays;

//When you say 5th element in fibonacci, you return 5 instead of 3.
//There is a mismatch between index of the arrays and element in the fibonacci
//It can be corrected if either you pass n as n-1 or create a table with  n alone and handle the usage of n in the
// function as n-1
public class Fibonacci {

    // usingMemoization
    public static int fibonacciMemoiz(int n, int[] memoizTable){
        if(memoizTable[n] == -1){
            if(n <=1){
                memoizTable[n] = n;
            }
            else{
                memoizTable[n] = fibonacciMemoiz(n-1, memoizTable) + fibonacciMemoiz(n-2, memoizTable);
            }
        }
            return memoizTable[n];
    }

    public static int fibonacciTabulation(int n, int[] table){
        table[0] = 0;
        table[1] = 1;

        for(int i=2; i<=n; i++){
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];

    }
    public static void main (String[] args){
        int n = 5;
        //Memoization - Top down approach
        int[] memoizTable = new int[n+1]; //n+1 so that for fib(5), it will check memoizTable[5]
        Arrays.fill(memoizTable, -1);
        System.out.println(fibonacciMemoiz(n, memoizTable));

        //Tabulation - Bottom up apprach
        int[] table = new int[n+1];
        //Arrays fill not needed since we start from 0.
        System.out.println(fibonacciTabulation(n, table));

    }
}
