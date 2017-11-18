# --- !Ups

create table users (
  id                  bigint not null auto_increment,
  name                varchar(255),
  emailAddress        varchar(255),
  primary key (id)
);

create table states (
  id                  bigint not null auto_increment,
  enemy_id            bigint,
  name                varchar(255),
  enemy_name          varchar(255),
  health              bigint,
  primary key (id)
);


# --- !Downs

drop table if exists users;

drop table if exists states;
