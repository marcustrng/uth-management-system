CREATE TABLE career_levels
(
    career_level_id   SERIAL PRIMARY KEY,
    career_level_name VARCHAR(50) NOT NULL
);

CREATE TABLE departments
(
    department_id   SERIAL PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL
);

CREATE TABLE careers
(
    career_id                 SERIAL PRIMARY KEY,
    career_name               VARCHAR(100) NOT NULL,
    department_id             INT REFERENCES departments (department_id),
    duration_years            INT,
    required_optional_courses INT,
    career_level_id           INT REFERENCES career_levels (career_level_id)
);

-- Create the Professor table
CREATE TABLE professors
(
    professor_id SERIAL PRIMARY KEY,
    first_name   VARCHAR(50) NOT NULL,
    last_name    VARCHAR(50) NOT NULL,
    email        VARCHAR(100),
    phone_number VARCHAR(20)
);

CREATE TABLE courses
(
    course_id    SERIAL PRIMARY KEY,
    course_name  VARCHAR(100) NOT NULL,
    course_code  VARCHAR(20)  NOT NULL,
    career_id    INT REFERENCES careers (career_id),
    year         INT,
    semester     INT,
    optional     BOOLEAN,
    professor_id INT REFERENCES professors (professor_id)
);

-- Create the CourseDependency table
-- CREATE TABLE course_dependency
-- (
--     course_id          INT REFERENCES courses (course_id),
--     required_course_id INT REFERENCES courses (course_id),
--     PRIMARY KEY (course_id, required_course_id)
-- );



-- Create the ProfessorCourse table
-- CREATE TABLE professor_course
-- (
--     professor_id INT REFERENCES professors (professor_id),
--     course_id    INT REFERENCES courses (course_id),
--     PRIMARY KEY (professor_id, course_id)
-- );
