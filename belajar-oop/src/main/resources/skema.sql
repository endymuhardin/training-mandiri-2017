create table nasabah(
    nomor VARCHAR(20),
    nama VARCHAR(255) not null,
    email VARCHAR(255) not null,
    primary key (nomor)
);

insert into nasabah (nomor,nama,email)
values ('123','Endy','endy@muhardin.com');