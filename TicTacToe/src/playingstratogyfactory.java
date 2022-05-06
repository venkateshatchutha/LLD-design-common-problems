public class playingstratogyfactory {
    public static playingstratogy getPlayingStratogy(level level){
        if(level.equals(level.hard)){
            return new botHradlevel();
        }else if(level.equals(level.medium)){
            return new botMedium();
        }
        else {
            return null;
        }
    }
}
