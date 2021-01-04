package tictactoe;

import java.util.Arrays;

public class tictactoee {
	
	public static void main(String[] args) {
		
		char[][] board = {{'X','0','.'}, {'0','X','X'}, {'0','0','0'}};
		System.out.println(Arrays.deepToString(board));
		System.out.println(checkBoard(board));
	}
	
	public static char checkBoard( char[][] board ) {
		if (board == null)
			return '.';
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == 'X') {
				if (board[i][1] == board[i][0] && board[i][2] == board[i][0])
					return 'X';
			} else if (board[i][1] == '0') {
				if (board[i][1] == board[i][0] && board[i][2] == board[i][0])
					return '0';
			}
			for (int j = 0; j < board.length; j++) {
				if (board[0][j] == 'X') {
					if (board[1][j] == board[0][j] && board[2][j] == board[0][j])
						return 'X';
				} else if (board[0][j] == '0') {
					if (board[0][j] == board[1][j] && board[0][j] == board[2][j])
						return '0';
				}
			}
		}
		
		
		
		
		
		
//		for (int i = 0; i < board.length-1; i++) {
//			for (int k = 0; k < board.length-1; k++) {
//				if (board[i][k] == 'X')
//					matchX++;
//				if(board[i][k] == '0')
//					match0++;
//			}
//			if (matchX == 3)
//				return 'X';
//			if (match0 == 3)
//				return '0';
//			matchX = 0;
//			match0 = 0;
//		}
		
//		for (int i = 1; i < board.length-1; i++) {
//			for (int k = 1; k < board.length-1; k++) {
//				if (board[i][k] == 'X') {
//					if (board[i][k+1] == board[i][k] && board[i][k-1] == board[i][k])
//						return 'X';
//				} else if (board[i][k] == '0') {
//					if (board[i][k+1] == board[i][k] && board[i][k-1] == board[i][k])
//						return '0';
//				}
//				if (board[i][k] == 'X') {
//					if (board[i+1][k] == board[i][k] && board[i-1][k] == board[i][k])
//						return 'X';
//				} else if (board[i][k] == '0') {
//					if (board[i+1][k] == board[i][k] && board[i-1][k] == board[i][k])
//						return '0';
//				}
//			}
//			
			
			
			
			

		return '.';
	}

}


