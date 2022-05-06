public class writingFactory {
    public static WritingStratogy getwritingStratogy( String pen){
        if(pen=="ballpen" || pen=="sketchpen"){
            return new ballAndSketchWriting();
        }
        else if(pen=="inkpen"){
            return new inkpenwritingstratogy();
        }
        else {
            return null;
        }
    }
}
