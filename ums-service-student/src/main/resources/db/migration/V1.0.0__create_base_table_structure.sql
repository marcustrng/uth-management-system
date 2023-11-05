create table public.classes
(
    class_id     serial
        constraint classes_pk
        primary key,
    career_id    integer,
    class_code   varchar(20)
        constraint classes_pk2
        unique,
    class_name   varchar(100),
    class_year   smallint,
    class_status varchar(10)
);

create table public.students
(
    student_id         serial
        constraint students_pk
        primary key,
    class_id           integer
        constraint students_classes_class_id_fk
        references public.classes,
    student_code       varchar(20)
        constraint students_pk2
        unique,
    first_name         varchar(100),
    last_name          varchar(100),
    date_of_birth      date,
    gender             varchar(10),
    phone_number       varchar(20),
    email              varchar(50),
    career_status_name varchar(50),
    career_status_date date
);

create table public.course_enrollment
(
    course_enrollment_id serial,
    student_id           integer
        constraint course_enrollment_students_student_id_fk
        references public.students,
    course_occurrence_id integer not null
        constraint course_enrollment_pk
        primary key,
    attendance_score     double precision,
    progress_score       double precision,
    midterm_exam_score   double precision,
    final_exam_score     double precision,
    final_score          double precision
);
