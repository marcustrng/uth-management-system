package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RoomDto(
    Long roomId, String roomCode, String roomName, Integer roomCapacity, String location)
    implements Serializable {}
