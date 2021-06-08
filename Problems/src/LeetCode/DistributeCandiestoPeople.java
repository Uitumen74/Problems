package LeetCode;

public class DistributeCandiestoPeople {
	public static void main(String args[]) {
		int candies = 10;
		int n = 3;
		int[] res = distributeCandies(candies, n);
		for (int element : res) {
			System.out.println(element);
		}
	}

	public static int[] distributeCandies(int candies, int num_people) {
		int[] res = new int[num_people];
		int num = 0;
		int fun = 1;
		int j = 0;
		for (int i = 0; i < candies; i++) {
			if (num + fun < candies) {
				res[j] += fun;
			} else if (num + fun > candies) {
				res[j] += (candies - num);
				return res;
			} else if (num + fun == candies) {
				res[j] += fun;
				return res;
			}
			if (j < num_people - 1)
				j++;
			else if (j == num_people - 1) {
				j = 0;
			}

			num += fun;
			fun++;
		}
		return res;
	}
}
