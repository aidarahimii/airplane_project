create table passenger_tbl
(
    id           number,
    name         nvarchar2(20),
    family       nvarchar2(20),
    address      nvarchr2(60),
    national_cod nvarchar2(10),
    phone_number nvarchar2(12)
);
create sequence passenger_seq start with 1 increment by 1;

create table flight_tbl
(
    id          number,
    origin      nvarchar2(30),
    start_time  timestamp,
    destination nvarchar2(30),
    end_time    timestamp,
    airline_id  number,
    capacity    number(3)
);
create sequence flight_seq start with 1 increment by 1;

create table airline_tbl
(
    id      number,
    name    nvarchar2(20),
    phone   nvarchar2(20),
    address nvarchar2(20)
)
create sequence airline_seq start with 1 increment by 1;


create table ticket_tbl
(
    id           number,
    serial       nvarchar2(20),
    passenger_id number,
    flight_id    number,
    price        number,
    position     nvarchar(5)
);
create sequence ticket_seq start with 1 increment by 1;
