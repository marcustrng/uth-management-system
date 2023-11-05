create table public.course_occurrence
(
    course_occurrence_id   serial
        constraint course_occurrence_pk
        primary key,
    course_id              integer,
    professor_id           integer,
    course_occurrence_code varchar(20),
    class_code             varchar(10),
    start_date             date,
    end_date               date,
    capacity               smallint
);

create table public.rooms
(
    room_id       serial
        constraint rooms_pk
        primary key,
    room_code     char(4) not null
        constraint rooms_pk2
        unique,
    room_name     varchar(100),
    room_capacity smallint,
    location      varchar(100)
);

create unique index rooms_room_code_uindex
    on public.rooms (room_code);

create table if not exists public.schedules
(
    schedule_id          serial
        constraint schedules_pk
        primary key,
    course_occurrence_id integer
        constraint schedules_course_occurrence_course_occurrence_id_fk
        references public.course_occurrence,
    room_id              integer
        constraint schedules_rooms_room_id_fk
        references public.rooms,
    day_of_week          char(2),
    start_date           date,
    end_date             date
);

