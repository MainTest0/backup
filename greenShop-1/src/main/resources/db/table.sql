CREATE TABLE user_tb(
	id INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL
);

