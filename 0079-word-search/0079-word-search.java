class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(rec(word,board,i,j,0))
                        return true;
                }
            }
        }
        return false;
        
    }
    boolean rec(String word,char[][] board,int i,int j,int k)
    {
        if(k==word.length())
            return true;
        if(i==-1 || i==board.length || j==board[0].length || j==-1 ||board[i][j]!=word.charAt(k))
            return false;
        char temp=board[i][j];
        board[i][j]='&';
           boolean found= rec(word,board,i+1,j,k+1)||rec(word,board,i,j+1,k+1)||rec(word,board,i-1,j,k+1)||rec(word,board,i,j-1,k+1);   
        board[i][j]=temp;
        return found;
    }
}