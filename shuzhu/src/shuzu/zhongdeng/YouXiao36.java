package shuzu.zhongdeng;

public class YouXiao36 {
    public static void main(String[] args) {


    }
    public boolean isValidSudoku(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){

                }
            }
        }
        return false;
    }
    //利用哈希表，也就是说，利用二维数组来记录一个数出现的次数，如果大于1则说明不符合情况
    //利用到字符串c-'1'就是ASCII码值相减
    public boolean isValidSudoku2(char[][] board){
        //每一行的数字出现的次数
                int[][] rows=new int[9][9];
        //每一列的数字出现的次数
                int[][] columns=new int[9][9];
                //每一个3×3的方块中数字出现的次数
                int[][][] jiugongge=new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    char c=board[i][j];
                    int index=c-'1';//这样不同的数index就会不同
                    rows[i][index]++;
                    columns[j][index]++;
                    jiugongge[i/3][j/3][index]++;//有九个3×3的三宫格，保证每个三宫格内的9个数不重复
                    if(rows[i][index]>1||columns[j][index]>1||jiugongge[i/3][j/3][index]>1){
                        return false;
                    }

                }
            }
        }
        return true;




            }
}
