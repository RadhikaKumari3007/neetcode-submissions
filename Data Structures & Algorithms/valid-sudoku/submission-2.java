class Solution {
    public boolean isValidSudoku(char[][] board) {

      for(int r=0;r<9;r++)
      {
        HashSet<Character> set = new HashSet<>();
        for(int c=0;c<9;c++)
        {
          if(board[r][c]=='.')continue;
          if(set.contains(board[r][c])
          )return false;
          set.add(board[r][c]);

        }
      }
      for(int c=0;c<9;c++)
      {
        HashSet<Character> set =new HashSet<>();
        for(int r=0;r<9;r++)
        {
          if(board[r][c]=='.')continue;
          if(set.contains(board[r][c]))return false;
          set.add(board[r][c]);

        }
      }
      for(int sr=0;sr<9;sr+=3)
      {
        int er=sr+2;
        for(int sc=0;sc<9;sc+=3)
        {
          int ec=sc+2;
          if(!validsudoku(board,sr,er,sc,ec))
          return false;
        }
      } return true;
    }

  public boolean validsudoku(char board[][],int sr,int er,int sc,int ec)
  { HashSet<Character> set=new HashSet<>();
    for(int r=sr;r<=er;r++)
    {
      for(int c=sc;c<=ec;c++)
      {
        if(board[r][c]=='.')continue;
        if(set.contains(board[r][c]))
          return false;
          set.add(board[r][c]);
      }
    } return true;
  }






















        
        /*HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
          for(int j=0;j<9;j++)
          {
            if(board[i][j] == '.')
            continue;
            String row="r"+i+board[i][j];
            String col="c"+j+board[i][j];
            String box="b"+(i/3)+(j/3)+board[i][j];
            if(set.contains(row)||set.contains(col)||set.contains(box))
            return false;

            set.add(row);
            set.add(col);
            set.add(box);

          }
          return true;*/

        
    }

