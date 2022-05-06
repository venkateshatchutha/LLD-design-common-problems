public class sketchpen extends pen{
    WritingStratogy writingStratogy;
    public sketchpen(){
        this.writingStratogy=writingFactory.getwritingStratogy("sketchpen");
    }
    @Override
    public void write() {
        writingStratogy.write();
    }
}
