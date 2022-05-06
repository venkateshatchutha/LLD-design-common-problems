public class inkpen extends pen{
    WritingStratogy writingStratogy;
    public inkpen(){
        this.writingStratogy=writingFactory.getwritingStratogy("inkpen");
    }
    @Override
    public void write() {
        writingStratogy.write();
    }
}
