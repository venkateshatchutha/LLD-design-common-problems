import javax.sound.midi.Track;

public class game {
    player player1;
    player player2;
    board board;
    public game(player player1, player player2, int boardsize){
        this.player1=player1;
        this.player2=player2;
        this.board=new board(boardsize);
    }

    public void run(){
        player currentplayer=player1;
        while(true){
            cell currentstep=currentplayer.playnextstep();
            if(iswin(currentplayer,currentstep)){
                System.out.println("the winner is: "+ currentplayer.name);
                break;
            }
            if(currentplayer.equals(player1)){
                currentplayer=player2;
            }else{
                currentplayer=player1;
            }
        }
    }

    public boolean iswin(player player, cell currentstep){
        int rowplayerid=board.cells[currentstep.x][0];
        boolean iswin=true;
        for(int c: board.cells[currentstep.x]){
            if(c!=rowplayerid){
                iswin=false;
                break;
            }
        }
        int columnplayerid=board.cells[currentstep.x][0];
        for ( int i=0; i<board.cells.length; i++){
            if(columnplayerid!= board.cells[i][currentstep.y]){
                iswin=false;
                break;
            }
        }
        return iswin;
    }

}
