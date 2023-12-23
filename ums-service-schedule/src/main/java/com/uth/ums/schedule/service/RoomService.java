package com.uth.ums.schedule.service;


import com.uth.ums.schedule.model.entity.Room;
import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    
    Room getRoomById(Long roomId);
    
    Room createRoom(Room room);
    
    Room updateRoom(Room room);
    
    void deleteRoom(Long roomId);
}
