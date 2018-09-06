create table drink
(
	id bigint not null
		primary key,
	name varchar(255) null
)
;

create table hibernate_sequence
(
	next_val bigint null
)
;

create table inventory_item
(
	quantity int not null,
	drink_id bigint not null
		primary key,
	constraint FKji5x4fofe7n3gs7nl2tagdblc
		foreign key (drink_id) references drink (id)
)
;

create table order_table
(
	id bigint not null
		primary key,
	quantity int not null,
	ship_date datetime null,
	drink_drink_id bigint null,
	constraint FK9721ada1a3tm4i0gkhmmpwuwo
		foreign key (drink_drink_id) references inventory_item (drink_id)
)
;

create table tag
(
	id bigint not null
		primary key,
	name varchar(255) null
)
;

create table drink_tags
(
	drink_id bigint not null,
	tags_id bigint not null,
	constraint UK_7h6pwopo1ioutj8jgj554tsh7
		unique (tags_id),
	constraint FKc079srfy1qc55pw8ny51afuch
		foreign key (tags_id) references tag (id),
	constraint FKrhcqtqbdve9sfqs98jal9ivgf
		foreign key (drink_id) references drink (id)
)
;

create table user
(
	id bigint not null
		primary key,
	email varchar(255) null,
	first_name varchar(255) null,
	last_name varchar(255) null,
	password varchar(255) null,
	room_number int not null,
	username varchar(255) null
)
;

create table user_orders
(
	user_id bigint not null,
	orders_id bigint not null,
	constraint UK_oqipapb9ox7fhui5n2ttp9ab4
		unique (orders_id),
	constraint FKbqpk23ut9h4pfqnclasqb5muc
		foreign key (orders_id) references order_table (id),
	constraint FKkuspr37yv513ga1okogyxrb7m
		foreign key (user_id) references user (id)
)
;

