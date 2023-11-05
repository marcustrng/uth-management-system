package com.uth.ums.schedule.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.schedule.model.entity.Room}
 */
@Value
public class RoomDto implements Serializable {
    Long roomId;
    String roomCode;
    String roomName;
    int roomCapacity;
    String location;
}
