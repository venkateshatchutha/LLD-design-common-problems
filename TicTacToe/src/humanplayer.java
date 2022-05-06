import java.util.Scanner;

public class humanplayer extends player{
    public humanplayer(Symbol symbol){
        this.symbol=symbol;
    }
    @Override
    public cell playnextstep() {
        System.out.println("enter next cell position");
        //validate if it's valid cell or not
        Scanner sc = new Scanner(System.in);
        String pos=sc.nextLine();

        return null;
    }
}
