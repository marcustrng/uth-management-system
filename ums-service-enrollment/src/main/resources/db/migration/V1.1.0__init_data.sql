INSERT INTO student (last_name, first_name, date_of_birth, email, phone_number)
VALUES ('Doe', 'John', '1990-05-15', 'johndoe@example.com', '123-456-7890'),
       ('Smith', 'Jane', '1995-09-21', 'janesmith@example.com', '987-654-3210'),
       ('Johnson', 'Michael', '1992-11-30', 'michaeljohnson@example.com', '555-123-4567'),
       ('Johnson', 'Robert', '1993-07-12', 'robertjohnson@example.com', '111-222-3333'),
       ('Brown', 'Emily', '1998-04-28', 'emilybrown@example.com', '444-555-6666'),
       ('Davis', 'Sarah', '1991-12-03', 'sarahdavis@example.com', '777-888-9999'),
       ('Anderson', 'Jennifer', '1994-09-08', 'jenniferanderson@example.com', '111-111-1111'),
       ('Wilson', 'David', '1997-02-14', 'davidwilson@example.com', '222-222-2222'),
       ('Taylor', 'Jessica', '1996-06-25', 'jessicataylor@example.com', '333-333-3333');

INSERT INTO career_status (career_status_name)
VALUES ('Enrolled'),
       ('Finalized'),
       ('Drop Out');


INSERT INTO career_enrollment (student_id, career_id, enrollment_date, career_status_id, career_status_date)
VALUES
  (2, 1, '2022-03-10', 1, '2022-03-15'),
  (3, 2, '2022-04-20', 3, '2022-05-01');

INSERT INTO course_enrollment (student_id, course_occurrence_id, final_score)
VALUES
  (2, 1, 85.0),
  (3, 2, 78.5),
  (4, 3, 91.2);
