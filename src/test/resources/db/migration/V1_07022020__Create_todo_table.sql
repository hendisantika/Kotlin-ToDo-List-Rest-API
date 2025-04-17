CREATE TABLE todo
(
    id          serial PRIMARY KEY NOT NULL,
    title       VARCHAR(255),
    description text,
    finished    boolean            NOT NULL
);
