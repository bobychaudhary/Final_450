//write the code for implementation for fractional knapsak problem
//using dynamic programming
class solution{
    public static void main(String[] args){
        int[] wt = {1,2,3};
        int[] val = {6,10,12};
        int W = 5;
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}
