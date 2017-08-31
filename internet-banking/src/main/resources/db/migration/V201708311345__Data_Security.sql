insert into s_user (id, username) values ('1','endy');
insert into s_user_password (id, id_user, password) values ('1', '1', '$2a$10$H8gLK.FTHOdqF2YyDtimeODO8cM3HrlrFkvXyTv9I6cczL0E1C7iq');
insert into s_user (id, username) values ('2','dadang');
-- password = abcd
insert into s_user_password (id, id_user, password) values ('2', '2', '$2a$10$H8gLK.FTHOdqF2YyDtimeODO8cM3HrlrFkvXyTv9I6cczL0E1C7iq');
insert into s_group (id, nama) values ('m', 'Maker');
insert into s_group (id, nama) values ('r', 'Releaser');
insert into s_user_group(id, id_group, id_user) values ('x', 'm', '1');
insert into s_user_group(id, id_group, id_user) values ('y', 'r', '2');
insert into s_permission (id, nama) values ('s', 'CEK_SALDO');
insert into s_permission (id, nama) values ('e', 'ENTRI_TRANSAKSI');
insert into s_permission (id, nama) values ('a', 'APPROVE_TRANSAKSI');
insert into s_group_permission(id, id_group, id_permission) values ('1','m', 's');
insert into s_group_permission(id, id_group, id_permission) values ('2','m', 'e');
insert into s_group_permission(id, id_group, id_permission) values ('3','r', 'a');
insert into s_group_permission(id, id_group, id_permission) values ('4','r', 's');