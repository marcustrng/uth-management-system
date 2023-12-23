CREATE TABLE room (
    room_id SERIAL PRIMARY KEY,
    room_code VARCHAR(255),
    room_name VARCHAR(255),
    room_capacity INTEGER,
    location VARCHAR(255)
);

CREATE TABLE course_occurrence (
    course_occurrence_id SERIAL PRIMARY KEY,
    course_id INTEGER,
    occurrence_year INTEGER,
    course_occurrence_code VARCHAR(255),
    professor_id INTEGER,
    start_date DATE,
    end_date DATE,
    capacity INTEGER
);

CREATE TABLE assistant_professor (
    course_occurrence_id INTEGER,
    professor_id INTEGER,
    professor_role_id INTEGER,
    PRIMARY KEY (course_occurrence_id, professor_id),
    FOREIGN KEY (course_occurrence_id) REFERENCES course_occurrence (course_occurrence_id)
);

CREATE TABLE schedule (
    schedule_id SERIAL PRIMARY KEY,
    course_occurrence_id INTEGER REFERENCES course_occurrence (course_occurrence_id),
    day_of_week VARCHAR(2),
    start_time TIME,
    end_time TIME,
    room_id INTEGER REFERENCES room (room_id)
);
