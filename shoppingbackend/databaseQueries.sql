create table category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(200),
	image_url VARCHAR(200),
	is_active BOOLEAN,
	constraint pk_categorry_id primary key (id)
);