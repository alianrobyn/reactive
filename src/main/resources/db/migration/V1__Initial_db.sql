create table users
(
    id bigint generated always as identity primary key not null,
    name varchar(100),
    surname varchar(100),
    phone varchar(100)
);

create table trains
(
    id bigint generated always as identity primary key not null,
    Station1 varchar(100),
    Station2 varchar(100),
    time varchar(100),
    date varchar(100),
    price varchar(100)
);

create table tickets (
     id bigint generated always as identity primary key not null,
     user_id  bigint NOT NULL,
     train_id   bigint NOT NULL,
     user_name varchar(100),
     user_surname varchar(100),
     Station1 varchar(100),
     Station2 varchar(100),
     time varchar(100),
     date varchar(100),
     price varchar(100)
);

ALTER TABLE tickets
    ADD CONSTRAINT fk_train_id
        FOREIGN KEY (train_id) REFERENCES trains(id);

ALTER TABLE tickets
    ADD CONSTRAINT fk_user_id
        FOREIGN KEY (user_id) REFERENCES users(id);
