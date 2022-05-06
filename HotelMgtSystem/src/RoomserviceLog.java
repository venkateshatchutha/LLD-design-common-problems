import java.util.Date;
import java.util.List;

public class RoomserviceLog {
    String StartTime;
    String EndTime;
    RoomServiceperson roomServiceperson;
    Room room;
    Date date;
    //below method  should be written inside roomserviceperson entity.
    public List<RoomserviceLog> getmyServiceLogs(Date date, User user){
        return null;
    }

    // missed to create this method
    public boolean addRoom(Room room){
        return true;
    }
}
