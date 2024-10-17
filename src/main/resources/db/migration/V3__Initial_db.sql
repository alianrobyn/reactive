create table trains
(
    id bigint generated always as identity primary key not null,
    Station1 varchar(100),
    Station2 varchar(100),
    time        time                   NOT NULL,
    date        date                   NOT NULL
);

create table tickets (
     id bigint generated always as identity primary key not null,
     user_id  bigint NOT NULL,
     train_id   bigint NOT NULL,
     user_name varchar(100),
     user_surname varchar(100),
     Station1 varchar(100),
     Station2 varchar(100),
     time        time                   NOT NULL,
     date        date                   NOT NULL
);

ALTER TABLE trains ADD PRIMARY KEY (id);

ALTER TABLE tickets
    ADD CONSTRAINT fk_train_id
        FOREIGN KEY (train_id) REFERENCES trains(id);

ALTER TABLE tickets
    ADD CONSTRAINT fk_user_id
        FOREIGN KEY (user_id) REFERENCES users(id);
