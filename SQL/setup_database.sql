CREATE TABLE Message(
	message_id SERIAL PRIMARY KEY,
	subject TEXT,
	data TEXT,
	parent_message_id NUMERIC(15,0)
);

CREATE TABLE User(
	user_id SERIAL PRIMARY KEY,
	email VARCHAR(100),
	name VARCHAR(100),
	password VARCHAR(100),
	phone VARCHAR(15),
	address TEXT
);

CREATE TABLE Sent(
	transaction_id SERIAL PRIMARY KEY,
	sender_id NUMERIC(15,0),
	thread_id NUMERIC(15,0),
	message_id NUMERIC(15,0),
	time TIMESTAMP
);

CREATE TABLE Received(
	thread_id NUMERIC(15,0),
	receiver_id NUMERIC(15,0),
	seen BOOLEAN
);

CREATE TABLE ViewType(
	transaction_id NUMERIC(15,0),
	receiver_id NUMERIC(15,0),
	visibilty BOOLEAN
);

CREATE TABLE Aggregates(
	max_thread NUMERIC(15,0)
);