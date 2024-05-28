DROP TABLE IF EXISTS dbuser;

CREATE TABLE dbuser (
    id LONG AUTO_INCREMENT  PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    role VARCHAR(250) NOT NULL
);
INSERT INTO dbuser (username, password, role) VALUES ('dbuser', '$2a$12$ZbW9VcF2O13ODgUbPy0sEuAqRNjUwyKZDs3CLKdhbHKoTt4yLC6ha', 'USER'),
('dbadmin', '$2y$10$kp1V7UYDEWn17WSK16UcmOnFd1mPFVF6UkLrOOCGtf24HOYt8p1iC', 'ADMIN');


-- user: dbuser
-- password: user

-- user: dbadmin
-- password: admin