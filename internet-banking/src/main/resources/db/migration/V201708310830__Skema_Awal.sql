create table nasabah (
    id VARCHAR(36),
    nomor VARCHAR(20),
    nama VARCHAR(255) not null,
    email VARCHAR(255) not null,
    primary key (id),
    unique (nomor)
);


create table rekening (
    id varchar(36),
    nomor varchar(20),
    id_nasabah varchar(20),
    saldo numeric(19,2) not null,
    primary key (id),
    foreign key (id_nasabah) references nasabah (id),
    unique(nomor)
);

create table mutasi (
	id varchar(20),
	id_rekening varchar(20),
	waktu_transaksi timestamp not null,
	keterangan varchar(255) not null,
	debet numeric(19,2) not null,
	kredit numeric(19,2) not null,
	primary key (id),
	foreign key (id_rekening) references rekening (id)
);