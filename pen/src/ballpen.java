public class ballpen extends pen implements refillable{
    WritingStratogy writingStratogy;
    public ballpen(){
        this.writingStratogy=writingFactory.getwritingStratogy("ballpen");
    }
    @Override
    public void write() {
        writingStratogy.write();
    }

    @Override
    public void refill() {

    }
}
