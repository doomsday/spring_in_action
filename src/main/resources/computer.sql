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

INSERT INTO laptop VALUES (1,'1298',350,32,4,700.00,11),(2,'1321',500,64,8,970.00,12),(3,'1750',750,128,12,1200.00,14),(4,'1298',600,64,10,1050.00,15),(5,'1752',750,128,10,1150.00,14),(6,'1298',450,64,10,950.00,12);
