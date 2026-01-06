class Solution {

    public boolean isValidSudoku(char[][] board) {
        return helper(board);
    }

    public boolean helper(char[][] board) {

        // row checking
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[9];

            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }

                int idx = board[row][col] - '1';

                if (seen[idx] == true) {
                    return false;
                }

                seen[idx] = true;
            }
        }

        // column checking
        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[9];

            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') {
                    continue;
                }

                int idx = board[row][col] - '1';

                if (seen[idx] == true) {
                    return false;
                }

                seen[idx] = true;
            }
        }

        // 3x3 box checking
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {

                boolean[] seen = new boolean[9];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (board[startRow + i][startCol + j] == '.') {
                            continue;
                        }

                        int idx = board[startRow + i][startCol + j] - '1';

                        if (seen[idx] == true) {
                            return false;
                        }

                        seen[idx] = true;
                    }
                }
            }
        }

        return true;
    }
}
