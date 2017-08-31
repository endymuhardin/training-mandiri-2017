create table nasabah(
    nomor VARCHAR(20),
    nama VARCHAR(255) not null,
    email VARCHAR(255) not null,
    primary key (nomor)
);


create table rekening (
    nomor varchar(20),
    nomor_nasabah varchar(20),
    saldo money not null,
    primary key (nomor),
    foreign key (nomor_nasabah) references nasabah (nomor)
);

create table mutasi (
	nomor varchar(20),
	nomor_rekening varchar(20),
	waktu_transaksi timestamp not null,
	keterangan varchar(255) not null,
	debet money not null,
	kredit money not null,
	primary key (nomor),
	foreign key (nomor_rekening) references rekening (nomor)
);