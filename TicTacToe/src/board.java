import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class board {
    //List<List<Integer>> cells;
    int[][] cells;
    int n;
    public board(int n){
        //this.cells= new ArrayList<List<Integer>>();
        this.cells=new int[n][n];
        this.n=n;
    }

    public boolean iscelloccupied(int x, int y){
        if (cells[x][y] !=0){
            return true;
        }
        return false;
    }

    public void setposition(cell cell, player player){
        if(cells[cell.x][cell.y] !=0){
            throw new RuntimeException("position is already occupied");
        }
        cells[cell.x][cell.y]=player.symbol.id;
    }

    public int getPlayerAtPosition(cell cell){
        return cells[cell.x][cell.y];
    }

    public void reset(){
        for (int[] row : this.cells) {
            Arrays.fill( row, 0);
        }
    }

}
