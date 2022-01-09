DROP TABLE IF EXISTS userData;
CREATE TABLE userData
(
    id INT PRIMARY KEY,
    email VARCHAR(30),
    name VARCHAR(30)
);

DROP TABLE IF EXISTS product;
CREATE TABLE product
(
    pid INT PRIMARY KEY,
    name VARCHAR(10)
);