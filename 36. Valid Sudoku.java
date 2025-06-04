class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> column = new HashMap<>();
        Map<Integer,Set<Character>> rows = new HashMap<>();

        Map<String, Set<Character>> squares = new HashMap<>();


        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                    if(board[i][j] == '.'){
                        continue;
                    }

                    String KeySquare = (i/3)+","+(j/3);

                    if(rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) ||
                    column.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) ||
                    squares.computeIfAbsent(KeySquare, k -> new HashSet<>()).contains(board[i][j])){
                        return false;
                    }
                    rows.get(i).add(board[i][j]);
                    column.get(j).add(board[i][j]);
                    squares.get(KeySquare).add(board[i][j]);
            }
        }

        return true;
    }
}
