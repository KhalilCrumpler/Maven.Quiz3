package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] newString = new String[3];
        newString[0] = this.board[0][value];
        newString[1] = this.board[1][value];
        newString[2] = this.board[2][value];
        return newString;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {


        return (this.board[rowIndex][0] == this.board[rowIndex][1]) && (this.board[rowIndex][1] == this.board[rowIndex][2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        return (this.board[0][columnIndex] == this.board[1][columnIndex]) && (this.board[columnIndex][1] == this.board[2][columnIndex]);
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
