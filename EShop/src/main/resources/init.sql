DROP DATABASE IF EXISTS eshop;
CREATE DATABASE eshop;

use eshop;

DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
  id int NOT NULL UNIQUE AUTO_INCREMENT,
  name VARCHAR(20),
  login VARCHAR(20) NOT NULL,
  pass VARCHAR(20) NOT NULL,
  email VARCHAR(50) NOT NULL,
  phone VARCHAR (10)
);