CREATE TABLE IF NOT EXISTS clients
(
    id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    email VARCHAR(254) NOT NULL ,
    phone VARCHAR(20)  NOT NULL
    );
CREATE TABLE IF NOT EXISTS coffee
(
    coffeeid BIGSERIAL PRIMARY KEY,
    coffeename VARCHAR(200) NOT NULL,
    price INTEGER NOT NULL,
    text VARCHAR(254) NOT NULL
    );
CREATE TABLE users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       password VARCHAR(100) NOT NULL,
                       enabled BOOLEAN NOT NULL DEFAULT true
);
CREATE TABLE roles (
                       role_id SERIAL PRIMARY KEY,
                       role_name VARCHAR(50) NOT NULL UNIQUE
);
CREATE TABLE user_roles (
                            user_id INT REFERENCES users(user_id) ON DELETE CASCADE,
                            role_id INT REFERENCES roles(role_id) ON DELETE CASCADE,
                            PRIMARY KEY (user_id, role_id)
);
