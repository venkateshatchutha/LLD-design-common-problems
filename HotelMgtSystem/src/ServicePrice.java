public class ServicePrice extends bill{
    bill bill;
    int cost=20;
    public ServicePrice(bill bill){
        this.bill=  bill;
    }
    @Override
    public int getPrice() {
        return this.bill.getPrice()+cost;
    }

    @Override
    public String getDescription() {
        this.bill.description=this.bill.getDescription()+" room service charge";
        return this.bill.description;
    }
}
