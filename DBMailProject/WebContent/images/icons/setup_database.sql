CREATE TABLE Message(
	message_id SERIAL PRIMARY KEY,
	subject TEXT,
	data TEXT,
	parent_message_id INTEGER
);

CREATE TABLE User_list(
	user_id SERIAL PRIMARY KEY,
	email VARCHAR(100),
	name VARCHAR(100),
	password VARCHAR(100),
	phone VARCHAR(15),
	address TEXT
);

CREATE TABLE Sent(
	transaction_id SERIAL PRIMARY KEY,
	sender_id INTEGER references User_list(user_id),
	thread_id NUMERIC(15,0),
	message_id INTEGER references Message(message_id),
	time TIMESTAMP
);

CREATE TABLE Received(
	thread_id NUMERIC(15,0),
	receiver_id INTEGER references User_list(user_id),
	count NUMERIC(5, 0),
	seen BOOLEAN
);

CREATE TABLE ViewType(
	transaction_id INTEGER references Sent(transaction_id),
	receiver_id INTEGER references User_list(user_id),
	visibilty BOOLEAN,
	PRIMARY KEY(receiver_id, transaction_id)
);

CREATE TABLE Aggregates(
	max_thread NUMERIC(15,0)
);
