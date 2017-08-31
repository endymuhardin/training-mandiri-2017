create table s_user (
	id varchar(36),
	username varchar(255) not null,
	aktif boolean not null default true,
	primary key (id),
	unique (username)
);

create table s_user_password (
	id varchar(36),
	id_user varchar(36) not null,
	password varchar(255) not null,
	primary key (id),
	foreign key (id_user) references s_user (id)
);

create table s_permission (
	id varchar(36),
	nama varchar(255) not null,
	primary key (id),
	unique (nama)
);

create table s_group (
	id varchar(36),
	nama varchar(255) not null,
	primary key (id),
	unique (nama)
);

create table s_user_group(
	id varchar(36),
	id_user varchar(36),
	id_group varchar(36),
	primary key (id),
	unique(id_group, id_user),
	foreign key (id_group) references s_group (id),
	foreign key (id_user) references s_user (id)
);


create table s_group_permission (
	id varchar(36),
	id_group varchar(36),
	id_permission varchar(36),
	primary key (id),
	unique(id_group, id_permission),
	foreign key (id_group) references s_group (id),
	foreign key (id_permission) references s_permission (id)
);

