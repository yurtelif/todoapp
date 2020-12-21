DROP TABLE IF EXISTS todos;

CREATE TABLE todos (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              title VARCHAR(250) NOT NULL,
                              description VARCHAR(250) NOT NULL,
                              user VARCHAR(250) DEFAULT NULL
);
