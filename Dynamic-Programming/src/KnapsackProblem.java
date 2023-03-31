class KnapsackProblem
{
    public static int knapSackSol(int[] profits, int[] weights, int capacity){
        int[][] lookupTable = new int[profits.length+1][capacity+1];

        for(int i=0; i<=weights.length; i++){
            for(int j=0; j<=capacity; j++) {
                if (i == 0 || j == 0) {
                    //We check i==0 because we fill the first row & column full of zeros to avoid overflow when
                    //executing the formula.
                    //That is the reason why we doing profits[i-1] to access correct element in profits array.
                    lookupTable[i][j] = 0;
                } else if (weights[i - 1] > j) {
                    lookupTable[i][j] = lookupTable[i - 1][j];
                } else {
                    lookupTable[i][j] = Math.max(profits[i - 1] + lookupTable[i - 1][j - weights[i - 1]], lookupTable[i - 1][j]);
                }
            }
        }
        return lookupTable[profits.length][capacity];
    }

    public static void main(String[] args)
    {
        int[] profits = new int[]{1, 4, 5, 7}; // The values of the jewelry
        int[] weights = new int[]{1, 3, 4, 5}; // The weight of each
        System.out.println("Total knapsack profit ---> " + knapSackSol(profits, weights, 7));
    }
}