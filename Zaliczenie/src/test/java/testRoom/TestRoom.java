package testRoom;

import static org.junit.Assert.assertEquals;
import org.example.model.Room;
import org.example.service.RoomService;
import org.junit.Test;

public class TestRoom {
    private final RoomService roomService = new RoomService();
    @Test
    public void testRoom1() {
        roomService.addRoom(new Room(1, 5));
        assertEquals(roomService.getRoomAmount(), 1);


    }
    @Test
    public void testRoom2(){
        roomService.removeRoom(1);
        assertEquals(roomService.getRoomAmount(), 0);
    }
}
