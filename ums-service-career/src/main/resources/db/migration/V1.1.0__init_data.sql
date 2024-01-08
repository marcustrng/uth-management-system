-- ums-service-career
INSERT INTO career_levels (career_level_name)
VALUES ('Bachelor''s degree'),
       ('College diploma'),
       ('Master''s degree');

INSERT INTO departments (department_name)
VALUES ('Information Technology'),
       ('Economics');

INSERT INTO careers (career_name, department_id, duration_years, required_optional_courses,
                     career_level_id)
VALUES ('Information Technology', 1, 4, 30, 1),
       ('Economics', 2, 2, 20, 3);

INSERT INTO professors (first_name, last_name, email, phone_number)
VALUES ('John', 'Smith', 'john.smith@example.com', '123-456-7890'),
       ('Emily', 'Johnson', 'emily.johnson@example.com', '987-654-3210'),
       ('Michael', 'Williams', 'michael.williams@example.com', '555-555-5555'),
       ('Jessica', 'Brown', 'jessica.brown@example.com', '111-222-3333'),
       ('David', 'Jones', 'david.jones@example.com', '444-444-4444'),
       ('Jennifer', 'Miller', 'jennifer.miller@example.com', '999-888-7777'),
       ('Daniel', 'Lee', 'daniel.lee@example.com', '111-222-3333'),
       ('Michelle', 'Wong', 'michelle.wong@example.com', '444-555-6666'),
       ('Christopher', 'Nguyen', 'christopher.nguyen@example.com', '777-888-9999'),
       ('Stephanie', 'Garcia', 'stephanie.garcia@example.com', '123-456-7890'),
       ('Ryan', 'Martinez', 'ryan.martinez@example.com', '987-654-3210'),
       ('Alexandra', 'Davis', 'alexandra.davis@example.com', '555-111-2222'),
       ('Matthew', 'Wilson', 'matthew.wilson@example.com', '777-888-9999'),
       ('Sophia', 'Brown', 'sophia.brown@example.com', '333-444-5555'),
       ('Benjamin', 'Lopez', 'benjamin.lopez@example.com', '888-999-0000'),
       ('Olivia', 'Garcia', 'olivia.garcia@example.com', '111-222-3333');


INSERT INTO courses (course_name, course_code, career_id, year, semester, optional, professor_id)
--     IT year 1 semester 1
VALUES ('Mathematics 1', 'MAT-1', 1, 1, 1, false, 1),
       ('Mathematics 2', 'MAT-2', 1, 1, 1, false, 2),
       ('Physics 1', 'PHY-1', 1, 1, 1, false, 3),
       ('Physics 2', 'PHY-2', 1, 1, 1, false, 4),
       ('Introduction to Psychology', 'PSY-1', 1, 1, 1, true, 5),
--     IT year 1 semester 2
       ('Advanced Psychology', 'PSY-2', 1, 1, 2, false, 6),
       ('Computer Programming', 'CSC-1', 1, 1, 2, false, 7),
       ('Database Management', 'CSC-2', 1, 1, 2, false, 8),
       ('Organic Chemistry', 'CHM-1', 1, 1, 2, true, 9),
       ('Inorganic Chemistry', 'CHM-2', 1, 1, 2, true, 10),
       --     IT year 2 semester 1
       ('Literature 1', 'LIT-1', 1, 2, 1, false, 11),
       ('Literature 2', 'LIT-2', 1, 2, 1, false, 12),
       ('Mechanics', 'MEC-1', 1, 2, 1, false, 13),
       ('Thermodynamics', 'MEC-2', 1, 2, 1, true, 14),
       --     IT year 2 semester 2
       ('Database Design', 'CSC-3', 1, 2, 2, false, 15),
       ('Web Development', 'CSC-4', 1, 2, 2, false, 16),
       ('Analytical Chemistry', 'CHM-3', 1, 2, 2, false, 1),
       ('Physical Chemistry', 'CHM-4', 1, 2, 2, false, 2),
       --     IT year 3 semester 1
       ('Introduction to Biology', 'BIO-101', 1, 3, 1, false, 3),
       ('Cell Biology', 'BIO-201', 1, 3, 1, false, 4),
       ('Genetics', 'BIO-301', 1, 3, 1, true, 5),
       --     IT year 3 semester 2
       ('Molecular Biology', 'BIO-401', 1, 3, 2, false, 6),
       ('English Literature', 'LIT-101', 1, 3, 2, false, 7),
       ('World Literature', 'LIT-201', 1, 3, 2, false, 8),
       ('American Literature', 'LIT-301', 1, 3, 2, true, 9),
       --     IT year 4 semester 1
       ('Shakespearean Literature', 'LIT-401', 1, 4, 1, false, 10),
       ('Introduction to Computer Science', 'CSC-101', 1, 4, 1, false, 11),
       ('Data Structures and Algorithms', 'CSC-201', 1, 4, 1, false, 12),
       --     IT year 4 semester 2
       ('Operating Systems', 'CSC-301', 1, 4, 2, false, 13),
       ('Artificial Intelligence', 'CSC-401', 1, 4, 2, false, 14),
       ('Organic Chemistry 1', 'CHM-101', 1, 4, 2, false, 15),

       --     Economics year 1 semester 1
       ('Inorganic Chemistry 1', 'CHM-201', 2, 1, 1, false, 16),
       ('Analytical Chemistry', 'CHM-301', 2, 1, 1, false, 1),
       ('Physical Chemistry', 'CHM-401', 2, 1, 1, false, 2),
       --     Economics year 1 semester 2
       ('Introduction to Economics', 'ECO-101', 2, 1, 2, false, 3),
       ('Microeconomics', 'ECO-201', 2, 1, 2, false, 4),
       ('Macroeconomics', 'ECO-301', 2, 1, 2, false, 5),
       ('International Economics', 'ECO-401', 2, 1, 2, false, 6),
       --     Economics year 2 semester 1
       ('Creative Writing', 'LIT-101', 2, 2, 1, false, 7),
       ('Poetry Writing', 'LIT-201', 2, 2, 1, false, 8),
       --     Economics year 2 semester 2
       ('Fiction Writing', 'LIT-301', 2, 2, 2, false, 9),
       ('Playwriting', 'LIT-401', 2, 2, 2, false, 10),
       ('Introduction to Computer Programming', 'CSC-101', 2, 2, 2, false, 11),
       ('Data Structures', 'CSC-201', 2, 2, 2, false, 12),
       ('Software Engineering', 'CSC-301', 2, 2, 2, false, 13),
       ('Machine Learning', 'CSC-401', 2, 2, 2, false, 14),
       ('Organic Chemistry 1', 'CHM-101', 2, 2, 2, false, 15),
       ('Inorganic Chemistry 1', 'CHM-201', 2, 2, 2, false, 16),
       ('Biochemistry', 'CHM-301', 2, 2, 2, false, 1),
       ('Physical Chemistry', 'CHM-401', 2, 2, 2, false, 2);

-- INSERT INTO course_dependency (course_id, required_course_id)
-- VALUES (35, 32),
--        (5, 1);


-- INSERT INTO professor_course (professor_id, course_id)
-- SELECT (FLOOR(RANDOM() * 16) + 1) AS professor_id,
--        course_id
-- FROM generate_series(1, 50) AS course_id;

