create table category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(200),
	image_url VARCHAR(200),
	is_active BOOLEAN,
	constraint pk_categorry_id primary key (id)
);

insert into category (name, description, image_url, is_active) VALUES ('Laptop', 'List of Laps', 'CAT_1.png', true);
insert into category (name, description, image_url, is_active) VALUES ('Television', 'List of TVs', 'CAT_2.png', true);
insert into category (name, description, image_url, is_active) VALUES ('Mobile', 'List of Mobiles', 'CAT_3.png', true);

create table user_id(
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(50),
	contact_number VARCHAR(20),
	constraint pk_user_id PRIMARY KEY (id),
);

insert into user_id (first_name, last_name, role, enabled, password, email, contact_number) VALUES ('Sanjiv', 'Madhavan', 'ADMIN', true, 'admin', 'sanjiv@gmail.com', '1234567890');
insert into user_id (first_name, last_name, role, enabled, password, email, contact_number) VALUES ('Sanjay', 'Madhavan', 'SUPPLIER', true, 'supplier', 'sanjay@gmail.com', '0987654321');
insert into user_id (first_name, last_name, role, enabled, password, email, contact_number) VALUES ('John', 'Adams', 'SUPPLIER', true, 'supplier', 'john@gmail.com', '1234509876');
insert into user_id (first_name, last_name, role, enabled, password, email, contact_number) VALUES ('Shiv', 'Nadar', 'SUPPLIER', true, 'supplier', 'Shiv@gmail.com', '6789054321');

create table product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10, 2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	constraint pk_product_id PRIMARY KEY (id),
	constraint fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	constraint fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_id (id),
);

insert into product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id) 
VALUES ('MBLAPPLE5S', 'Iphone 5s', 'apple', 'This is the greatest Iphone of all time', 28000, 5, true, 3, 2);

insert into product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id) 
VALUES ('MBLAPPLE6S', 'Iphone 6s', 'apple', 'This is the greatest Iphone of all time', 58000, 4, true, 3, 2);

insert into product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id) 
VALUES ('MBLSAMSUNGJ7', 'Samsung J7', 'samsung', 'This is the greatest samsung phone of all time', 18000, 10, true, 3, 3);

insert into product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id) 
VALUES ('LAPHPNBOMEN', 'HP Omen', 'HP', 'This is the greatest HP Laptop of all time', 168000, 5, true, 1, 4);

insert into product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id) 
VALUES ('TVPANASONICUHD', 'Panasonic UHD TV 65"', 'Panasonic', 'This is the greatest TV of all time', 78000, 12, true, 2, 4);

