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


INSERT INTO course_occurrence (course_id, occurrence_year, course_occurrence_code, professor_id,
                               start_date, end_date, capacity)
VALUES (1, 2023, 'CO-2023-001', 101, '2023-01-10', '2023-05-20', 50),
       (2, 2023, 'CO-2023-002', 102, '2023-02-15', '2023-06-30', 40),
       (3, 2023, 'CO-2023-003', 103, '2023-03-20', '2023-07-31', 30),
       (4, 2023, 'CO-2023-004', 104, '2023-04-05', '2023-08-15', 25),
       (5, 2023, 'CO-2023-005', 105, '2023-05-10', '2023-09-20', 35),
       (6, 2023, 'CO-2023-006', 106, '2023-06-15', '2023-10-31', 45),
       (7, 2023, 'CO-2023-007', 107, '2023-07-20', '2023-11-30', 55),
       (8, 2023, 'CO-2023-008', 108, '2023-08-05', '2023-12-15', 20),
       (9, 2023, 'CO-2023-009', 109, '2023-09-10', '2023-12-20', 60),
       (10, 2023, 'CO-2023-010', 110, '2023-10-15', '2024-01-31', 40),
       (11, 2023, 'CO-2023-011', 111, '2023-11-20', '2024-02-28', 30),
       (12, 2023, 'CO-2023-012', 112, '2023-12-05', '2024-03-15', 25)
;

INSERT INTO schedule (course_occurrence_id, day_of_week, start_time, end_time, room_id)
VALUES (1, 'Mo', '09:00:00', '11:00:00', 1),
       (2, 'Tu', '13:30:00', '15:30:00', 2),
       (3, 'We', '10:00:00', '12:00:00', 3),
       (4, 'Th', '14:00:00', '16:00:00', 4),
       (5, 'Fr', '09:30:00', '11:30:00', 5),
       (6, 'Mo', '14:00:00', '16:00:00', 6),
       (7, 'Tu', '11:30:00', '13:30:00', 7),
       (8, 'We', '15:00:00', '17:00:00', 8);

INSERT INTO assistant_professor (course_occurrence_id, professor_id, professor_role_id)
VALUES
    (1, 101, 1),
    (2, 102, 2),
    (3, 103, 1),
    (4, 104, 2);
