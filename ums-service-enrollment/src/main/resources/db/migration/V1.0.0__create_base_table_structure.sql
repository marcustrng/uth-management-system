CREATE TABLE student (
  student_id SERIAL PRIMARY KEY,
  last_name VARCHAR(50),
  first_name VARCHAR(50),
  date_of_birth DATE,
  email VARCHAR(100),
  phone_number VARCHAR(20)
);

CREATE TABLE career_status (
  career_status_id SERIAL PRIMARY KEY,
  career_status_name VARCHAR(50)
);

CREATE TABLE career_enrollment (
  career_enrollment_id SERIAL PRIMARY KEY,
  student_id INT REFERENCES student(student_id),
  career_id INT ,
  enrollment_date DATE,
  career_status_id INT REFERENCES career_status(career_status_id),
  career_status_date DATE
);

CREATE TABLE course_enrollment (
  course_enrollment_id SERIAL PRIMARY KEY,
  student_id INT REFERENCES student(student_id),
  course_occurrence_id INT,
  final_score DECIMAL(5, 2)
);

CREATE TABLE evaluation_type (
  evaluation_type_id SERIAL PRIMARY KEY,
  evaluation_type_name VARCHAR(50),
  is_group_activity BOOLEAN
);

CREATE TABLE course_enrollment_evaluation (
  course_enrollment_evaluation_id SERIAL PRIMARY KEY,
  course_enrollment_id INT REFERENCES course_enrollment(course_enrollment_id),
  evaluation_type_id INT REFERENCES evaluation_type(evaluation_type_id),
  evaluation_date DATE,
  score DECIMAL(5, 2)
);
