package com.uth.ums.schedule.service;


import com.uth.ums.schedule.model.entity.Schedule;
import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();

    Schedule getScheduleById(Long scheduleId);

    Schedule createSchedule(Schedule schedule);

    Schedule updateSchedule(Schedule schedule);

    void deleteSchedule(Long scheduleId);
}
