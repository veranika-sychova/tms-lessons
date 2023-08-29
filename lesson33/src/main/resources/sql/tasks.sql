create table tasks
(
id int primary key,
name varchar,
description varchar,
status varchar,
user_id int,
foreign key (user_id) references users (id)
);