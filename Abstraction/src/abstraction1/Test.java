package abstraction1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public int knapSack(int W, int wt[], int val[], int n) {

		int dp[][] = new int[n+1][W+1];
		
		for (int i = 0; i <= n; i++) {	
			for (int j = 0; j <= W; j++) {	
				
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				
				else if(wt[i-1]<=j) {
					dp[i][j] = Math.max(val[i-1]+ dp[i-1][j-wt[i-1]], dp[i-1][j]); 
				}
				
				else
					dp[i][j] = dp[i-1][j];	
			}
		}
		
		return dp[n][W];
	}

	public static void main(String[] args) {

		Test t = new Test();

		int N = 3;
		int W = 4;

		int values[] = { 1, 2, 3 };
		int weight[] = { 4, 5, 1 };
		int findTheWinner = t.knapSack(W, weight, values, N);
		System.out.println(findTheWinner);
//		for (String element : letterCasePermutation) {
//			System.out.println(element);
//		}

	}

}
