INSERT INTO course_occurrence (course_id, occurrence_year, course_occurrence_code, start_date, end_date, capacity)
--     IT year 1 semester 1
VALUES (1, 2023, 'CO-2023-001', '2023-07-03', '2023-12-25', 50),
       (2, 2023, 'CO-2023-002', '2023-07-04', '2023-12-26', 40),
       (3, 2023, 'CO-2023-003', '2023-07-05', '2023-12-27', 30),
       (4, 2023, 'CO-2023-004', '2023-07-06', '2023-12-28', 25),
       (5, 2023, 'CO-2023-005', '2023-07-07', '2023-12-29', 35),
--     IT year 1 semester 2
       (6, 2024, 'CO-2024-006', '2024-01-01', '2024-07-24', 45),
       (7, 2024, 'CO-2024-007', '2024-01-02', '2024-07-25', 55),
       (8, 2024, 'CO-2024-008', '2024-01-03', '2024-07-26', 20),
       (9, 2024, 'CO-2024-009', '2024-01-04', '2024-07-27', 60),
       (10, 2024, 'CO-2024-010', '2024-01-05', '2024-07-28', 40)
;

INSERT INTO room (room_code, room_name, room_capacity, location)
VALUES ('A101', 'Conference Room A', 50, 'Building A, Floor 1'),
       ('B203', 'Classroom B', 30, 'Building B, Floor 2'),
       ('C305', 'Laboratory C', 20, 'Building C, Floor 3'),
       ('D401', 'Meeting Room D', 15, 'Building D, Floor 4'),
       ('E502', 'Studio E', 10, 'Building E, Floor 5'),
       ('F601', 'Boardroom F', 20, 'Building F, Floor 6'),
       ('G703', 'Auditorium G', 100, 'Building G, Floor 7'),
       ('H804', 'Study Room H', 8, 'Building H, Floor 8'),
       ('I901', 'Lecture Hall I', 150, 'Building I, Floor 9'),
       ('J1001', 'Conference Room J', 20, 'Building J, Floor 10'),
       ('K1102', 'Classroom K', 40, 'Building K, Floor 11'),
       ('L1203', 'Lab Room L', 25, 'Building L, Floor 12'),
       ('M1304', 'Meeting Room M', 12, 'Building M, Floor 13'),
       ('N1405', 'Studio N', 8, 'Building N, Floor 14'),
       ('O1506', 'Boardroom O', 18, 'Building O, Floor 15'),
       ('P1607', 'Auditorium P', 200, 'Building P, Floor 16')
;

INSERT INTO schedule (course_occurrence_id, day_of_week, start_time, end_time, room_id)
VALUES (1, 'Mo', '09:00:00', '11:00:00', 1),
       (2, 'Tu', '13:30:00', '15:30:00', 2),
       (3, 'We', '10:00:00', '12:00:00', 3),
       (4, 'Th', '14:00:00', '16:00:00', 4),
       (5, 'Fr', '09:30:00', '11:30:00', 5),
       (6, 'Mo', '14:00:00', '16:00:00', 6),
       (7, 'Tu', '11:30:00', '13:30:00', 7),
       (8, 'We', '11:30:00', '13:30:00', 7),
       (9, 'Th', '11:30:00', '13:30:00', 7),
       (10, 'Fr', '15:00:00', '17:00:00', 8);
