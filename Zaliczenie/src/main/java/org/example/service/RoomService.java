package org.example.service;

import org.example.model.Room;

import java.util.HashMap;

public class RoomService {

    private HashMap<Integer, Room> rooms = new HashMap<>();

    /**
     * Function adds room to hashmap
     * @param room room.toadd
     */
    public void addRoom(Room room){
        rooms.put(room.getRoomNumber(), room);
    }

    /**
     * Function removes room from hashmap
     * @param roomNumber room.remove
     */
    public void removeRoom(int roomNumber){
        rooms.remove(roomNumber);
    }

    /**
     * Function shows rooms added to hashmap
     */
    public void showRooms(){
        rooms.values().forEach(e->System.out.println(e));
    }
    public int getRoomAmount() {
        return rooms.size();
    }
}
