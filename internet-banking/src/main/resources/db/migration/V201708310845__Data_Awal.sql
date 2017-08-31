insert into nasabah (nomor,nama,email)
values ('123','Endy','endy@muhardin.com');

-- setoran awal
insert into rekening (nomor, nomor_nasabah, saldo)
values ('111','123', 100000.00);

insert into mutasi (nomor, nomor_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('001','111', now(), 'Setoran Awal', 100000.00,0);

-- tarik tunai
insert into mutasi (nomor, nomor_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('002','111', now(), 'ATM SIAP0123', 0, 50000.00);

update rekening set saldo = saldo-'50000.00'::money
where nomor = '111';