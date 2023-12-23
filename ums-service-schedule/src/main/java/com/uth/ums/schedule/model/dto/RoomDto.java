package com.uth.ums.schedule.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

/** DTO for {@link com.uth.ums.schedule.model.entity.Room} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RoomDto(
    Long roomId, String roomCode, String roomName, Integer roomCapacity, String location)
    implements Serializable {}
