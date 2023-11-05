create table public.faculties
(
    faculty_id   serial
        constraint faculties_pk
        primary key,
    faculty_name varchar(100)
);

create table public.career_level
(
    career_level_id   serial
        constraint career_level_pk
        primary key,
    career_level_name varchar(100) not null
);

create table public.careers
(
    career_id       serial
        constraint careers_pk
        primary key,
    career_level_id integer not null
        constraint careers_career_level_career_level_id_fk
        references public.career_level,
    career_name     varchar(100),
    faculty_id      integer not null
        constraint careers_faculties_faculty_id_fk
        references public.faculties
);

create table public.semesters
(
    semester_id serial
        constraint semesters_pk
        primary key,
    career_id   integer not null
        constraint semesters_careers_career_id_fk
        references public.careers,
    semester_no smallint
);

create table public.courses
(
    course_id   serial
        constraint courses_pk
        primary key,
    faculty_id   integer not null
        constraint courses_faculty_faculty_id_fk
            references public.faculties,
    course_name varchar(100),
    course_code varchar(20),
    credits    smallint
);

create table semester_course
(
    semester_course_id serial
        constraint semester_course_pk
            primary key,
    semester_id        integer
        constraint semester_course_semesters_semester_id_fk
            references semesters,
    course_id          integer
        constraint semester_course_courses_course_id_fk
            references courses
);


create table public.professors
(
    professor_id  serial
        constraint professors_pk
        primary key,
    first_name    varchar(100),
    last_name     varchar(100),
    date_of_birth date,
    gender        varchar(10),
    phone_number  varchar(15),
    email         varchar(50)
);

create table public.professor_course
(
    professor_course_id serial
        constraint professor_course_pk
        primary key,
    professor_id        integer not null
        constraint professor_course_professors_professor_id_fk
        references public.professors,
    course_id           integer not null
        constraint professor_course_courses_course_id_fk
        references public.courses
);

