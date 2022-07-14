USE sakila;
SHOW TABLES;
DROP TABLE IF EXISTS rating;
CREATE TABLE rating
(
	rating_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    num_stars VARCHAR(25) UNIQUE NOT NULL,
    stars_meaning VARCHAR(100) 
);
INSERT INTO rating (num_stars, stars_meaning)
VALUES 
			("0", "throw it away"),
            ("1", "put on in the background"),
            ("2", "when you want to get rid of the kids"),
            ("3", "if you have nothing else to watch"),
            ("4", "worthy of attention"),
            ("5", "alright, watch it");
            
SELECT * FROM rating;

	

	