insert into nasabah (id, nomor,nama,email)
values ('aaa', '123','Endy','endy@muhardin.com');

-- setoran awal
insert into rekening (id, nomor, id_nasabah, saldo)
values ('bbb','111','aaa', 100000.00);

insert into mutasi (id, id_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('ccc','bbb', now(), 'Setoran Awal', 100000.00,0);

-- tarik tunai
insert into mutasi (id, id_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('ddd','bbb', now(), 'ATM SIAP0123', 0, 50000.00);

update rekening set saldo = saldo-50000.00
where id = 'bbb';