create table person (
id_person int primary key,
first_name varchar,
gender varchar,
birthday date
);

drop table person;

create table hobby (
id_hobby int primary key,
hobby_name varchar,
hobby_type varchar constraint f_type_name references hobby_type (type_name)
);

drop table hobby;

create table hobby_type(
type_name varchar primary key
);

drop table hobby_type;

create table hobby_person(
id_person int constraint f_id_person references person(id_person),
id_hobby int constraint f_id_hobby references hobby(id_hobby)
);

drop table hobby_person;

insert into person (id_person, first_name, gender, birthday) values
(1, 'Lena', 'female', '1990-12-02'),
(2, 'Fedor', 'male', '1999-11-21'),
(3, 'Katya', 'female', '2000-03-11'),
(4, 'Slava', 'male', '1996-05-04'),
(5, 'Kristina', 'female', '1993-02-03'),
(6, 'Olya', 'female', '2008-10-09'),
(7, 'Igor', 'male', '1996-11-04'),
(8, 'Egor', 'male', '1994-09-18'),
(9, 'Savva', 'male', '2003-12-08'),
(10, 'Vanya', 'male', '1999-01-14');

insert into hobby_type (type_name ) values
('active'),
('passive');

insert into hobby (id_hobby, hobby_name, hobby_type) values
(1, 'football', 'active'),
(2, 'reading', 'passive'),
(3, 'embroidery','passive'),
(4, 'hockey', 'active'),
(5, 'tennis', 'active'),
(6, 'singing', 'passive'),
(7, 'collecting', 'passive'),
(8, 'running', 'active');

insert into hobby_person (id_person, id_hobby) values
(1, 2),
(2, 3),
(3, 5),
(4, 7),
(5, 4),
(5, 6),
(7, 1),
(9, 2),
(10, 3),
(1, 8);

select * from person where birthday < '1995-01-01';

select gender, count (*) from person group by gender;

select * from hobby_person
join person on hobby_person.id_person = person.id_person
join hobby on hobby_person.id_hobby = hobby.id_hobby;

select first_name, count (*) from hobby_person
join person on hobby_person.id_person = person.id_person
join hobby on hobby_person.id_hobby = hobby.id_hobby
group by first_name having count(*) > 1;

select hobby_type.type_name, count (*) from hobby
join hobby_type on hobby.hobby_type = hobby_type.type_name
group by hobby_type.type_name;

select hobby_name, hobby_type from hobby
join hobby_type on hobby.hobby_type = hobby_type.type_name
group by hobby_name, hobby_type;
