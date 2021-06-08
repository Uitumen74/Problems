package LeetCode;

public class FindWinneronaTicTacToeGame {
	public static void main(String args[]) {
		int[][] arr = { { 0, 0 }, { 2, 0 }, { 1, 1 }, { 2, 1 }, { 2, 2 } };
		String res = tictactoe(arr);
		System.out.print(res);
	}

	public static String tictactoe(int[][] moves) {
		if (moves.length >= 9)
			return "Draw";
		for (int i = 0; i < moves.length; i += 2) {
			for (int j = 0; j < moves[i].length; j++) {
				
			}
		}
		return "Pending";
	}
}
