class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> seenChars = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char check = board[row][i];
                if(check == '.') continue;
                if(seenChars.contains(check)) return false;
                seenChars.add(check);
            }
        }

        for(int column = 0; column < 9; column++){
            Set<Character> seenChars = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char check = board[i][column];
                if(check == '.') continue;
                if(seenChars.contains(check)) return false;
                seenChars.add(check);
            }
        }

        for(int square = 0; square < 9; square++){
            Set<Character> seenChars = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (square / 3) * 3 + i;
                    int column = (square % 3) * 3 + j;
                    char check = board[row][column];
                    if(check == '.') continue;
                    if(seenChars.contains(check)) return false;
                    seenChars.add(check);
                }
            }
        }

        return true;
    }
}
