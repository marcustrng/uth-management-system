package com.uth.ums.schedule.repository;

import com.uth.ums.schedule.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
