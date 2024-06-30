INSERT INTO clients VALUES
                        (1, 'Guzal Mazhitova', 'guzzya0904@gmail.com', '777777777)'),
                        (2, 'Dar Z', 'darz@jr.com', '87777777');
INSERT INTO roles (role_name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

INSERT INTO users (username, password, enabled) VALUES ('user1', 'user1', true); -- Password is 'password'
INSERT INTO users (username, password, enabled) VALUES ('admin1', 'admin1', true); -- Password is 'password'

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 gets ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- admin1 gets ROLE_ADMIN
