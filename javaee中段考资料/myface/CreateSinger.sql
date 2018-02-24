CREATE TABLE singer (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) DEFAULT NULL,
  rank int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY name_UNIQUE (name)
)