package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> res = kidsWithCandies(candies, extraCandies);
		System.out.println(res);
	}
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int max = max(candies, candies.length-1);
	        List<Boolean> res = new ArrayList<>();
	        for(int i = 0; i < candies.length; i++) {
	        	if((candies[i] + extraCandies) >= max)
	        	{
	        		res.add(true);
	        	}
	        	else res.add(false);
	        }
	        return res;
	    }
	 
	 public static int max(int[] candies, int n)
	 {
		 if(n == 0) return candies[n];
		 return Math.max(candies[n], max(candies, n - 1));
	 }

}
