/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
    Hari/Tgl	: Kamis, 18 Juni 2020
    Waktu		: 22.12 WITA
*/
create database proyekPBO;
use proyekPBO;

create table pegawai (nip varchar(5) primary key, 
nama_pegawai varchar(50), 
gaji_pokok int,
golongan enum('1','2','3','4','5'),
jam_kerja int,
lembur int);

