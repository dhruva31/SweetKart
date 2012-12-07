CREATE DATABASE sweets_info;

USE sweets_info;

CREATE TABLE sweets(sweet_id int PRIMARY KEY,
					sweet_name varchar(100) NOT NULL,
					sweet_description varchar(2000),
					price_per_kg int NOT NULL);
					
CREATE TABLE vendors(vendor_id int PRIMARY KEY, 
					 vendor_name varchar(100) NOT NULL, 
					 vendor_description varchar(2000));
			
CREATE TABLE vendor_sweet(sweet_id int,
						  vendor_id int,
						  price_per_kg int NOT NULL,
						  CONSTRAINT sweet_fk FOREIGN KEY(sweet_id) REFERENCES sweets(sweet_id) ON UPDATE CASCADE ON DELETE CASCADE,
						  CONSTRAINT vendor_fk FOREIGN KEY (vendor_id) REFERENCES vendors(vendor_id) ON UPDATE CASCADE ON DELETE CASCADE,
						  INDEX(sweet_id) , INDEX(vendor_id)							  
						  );
						  
INSERT INTO sweets values (1 , 'Rasgulla' , 'This is a famous bengali dish', 200);
INSERT INTO sweets values (2 , 'Jalebi' , 'This is a famous bengali dish', 400);
INSERT INTO sweets values (3 , 'Milk Cake' , 'This is a famous Alwar dish', 600);
INSERT INTO sweets values (4 , 'Gulab Jamun' , 'This is a famous bengali dish', 200);

INSERT INTO vendors values(1, 'Kanji' , 'Station road');
INSERT INTO vendors values(2, 'Sodhani' , 'Famous for Milk cake');
INSERT INTO vendors values(3, 'Rawat' , 'Famous for Kachori');

INSERT INTO vendor_sweet values (1 , 1, 210);
INSERT INTO vendor_sweet values (2 , 1, 400);
INSERT INTO vendor_sweet values (3 , 1, 600);
INSERT INTO vendor_sweet values (4 , 1, 210);
INSERT INTO vendor_sweet values (1 , 2, 220);
INSERT INTO vendor_sweet values (2 , 2, 4100);
INSERT INTO vendor_sweet values (3 , 2, 210);
INSERT INTO vendor_sweet values (1 , 3, 600);
INSERT INTO vendor_sweet values (2 , 3, 400);



























