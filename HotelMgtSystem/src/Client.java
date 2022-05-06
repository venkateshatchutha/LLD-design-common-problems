public class Client {
    public static void main(String[] args) {
        Guest g= new Guest();
        baseRoomPrice b=new baseRoomPrice();
        bill b1=new ServicePrice(new foodCharge(new baseRoomPrice()));
        System.out.println(b1.getDescription());
        System.out.println(b1.getPrice());
    }
}
