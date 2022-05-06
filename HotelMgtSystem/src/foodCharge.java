public class foodCharge extends bill{
    int cost=50;
    bill bill;
    public foodCharge(bill bill){
        this.bill=  bill;
    }
    @Override
    public String getDescription() {
        return this.bill.getDescription()+ " food change";
    }

    @Override
    public int getPrice() {

        return this.bill.getPrice()+cost;
    }

// another way of doing
    public int getPrice2() {
        this.bill.cost=this.bill.getPrice()+cost;
        return this.bill.getPrice();
    }
}
