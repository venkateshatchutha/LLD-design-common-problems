public class computerplayer extends player{
    playingstratogy playingstratogy;
    public computerplayer(level level, Symbol symbol){
        playingstratogy=playingstratogyfactory.getPlayingStratogy(level);
    this.symbol=symbol;
    }

    @Override
    public cell playnextstep() {
        return playingstratogy.playnextstep();
    }
}
