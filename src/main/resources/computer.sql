CREATE TABLE laptop (
  code int NOT NULL,
  model varchar(50) NOT NULL,
  speed smallint NOT NULL,
  ram smallint NOT NULL,
  hd double NOT NULL,
  price decimal DEFAULT NULL,
  screen tinyint NOT NULL,
  PRIMARY KEY (code)
);
