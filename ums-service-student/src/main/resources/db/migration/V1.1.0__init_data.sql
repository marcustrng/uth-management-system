INSERT INTO public.classes ( class_code, class_name, class_year, class_status)
VALUES ('CN22LT', 'Information Technology', 2022, 'Active');

INSERT INTO public.students (class_id, student_code, first_name, last_name, date_of_birth, gender, phone_number, email, career_status_name, career_status_date)
VALUES (1, 'STU001', 'John', 'Doe', '2000-05-15', 'Male', '+1234567890', 'john.doe@example.com', 'Enrolled', '2022-08-01');

INSERT INTO public.students (class_id, student_code, first_name, last_name, date_of_birth, gender, phone_number, email, career_status_name, career_status_date)
VALUES (1, 'STU002', 'Jane', 'Smith', '2001-02-28', 'Female', '+9876543210', 'jane.smith@example.com', 'Enrolled', '2022-08-01');

INSERT INTO public.students (class_id, student_code, first_name, last_name, date_of_birth, gender, phone_number, email, career_status_name, career_status_date)
VALUES (1, 'STU003', 'Michael', 'Johnson', '1999-11-10', 'Male', '+2345678901', 'michael.johnson@example.com', 'Enrolled', '2023-08-01');

INSERT INTO public.students (class_id, student_code, first_name, last_name, date_of_birth, gender, phone_number, email, career_status_name, career_status_date)
VALUES (1, 'STU004', 'Emily', 'Davis', '2000-07-22', 'Female', '+6789012345', 'emily.davis@example.com', 'Enrolled', '2023-08-01');
