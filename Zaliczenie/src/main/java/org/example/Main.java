package org.example;

import org.example.model.Room;
import org.example.service.RoomService;

public class Main {
    public static void main(String[] args) {
        RoomService service = new RoomService();
        service.addRoom(new Room(1,5));
        service.addRoom(new Room(2,6));
        service.addRoom(new Room(3,7));
        service.addRoom(new Room(4,8));
        service.addRoom(new Room(5,9));

        service.showRooms();
        System.out.println("-------------------------------------------");
        service.removeRoom(1);
        service.showRooms();

    }

}