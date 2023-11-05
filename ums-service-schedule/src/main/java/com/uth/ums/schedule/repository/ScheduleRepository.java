package com.uth.ums.schedule.repository;

import com.uth.ums.schedule.model.entity.Room;
import com.uth.ums.schedule.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
