--liquibase formatted sql

--changeset diplom:19.12.2023

create table users
(
id bigint not null primary key,
first_name varchar (255) not null,
last_name varchar  (255) not null,
phone_number bigint not null,
email varchar(255) not null,
password varchar (255) not null,
role boolean
);

create table ad
(

);

create table comments
(

);