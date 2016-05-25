DELETE FROM one.users;
INSERT INTO one.users (id, name, email) VALUES (1, 'kim', 'kim@gmail.com');
INSERT INTO one.users (id, name, email) VALUES (2, 'joon', 'joon@yahoo.com');
INSERT INTO one.users (id, name, email) VALUES (3, 'kim2', 'kim2@gmail.com');

DELETE FROM one.home;
INSERT INTO one.home (id, home_name, home_address) VALUES (10, 'home1', 'seoul');
INSERT INTO one.home (id, home_name, home_address) VALUES (11, 'home2', 'tokyo');
INSERT INTO one.home (id, home_name, home_address) VALUES (12, 'home3', 'room');