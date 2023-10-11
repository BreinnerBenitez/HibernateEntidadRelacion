create database relacioneshibernate;
use relacioneshibernate;
create table  detalles_cliente(
id int (11) not null auto_increment primary key,
web varchar(128) null,
telefono varchar (128 ) null,
comentarios varchar (128 ) null
)engine=innoDB;
show tables;


create table  cliente(
id int (11) not null auto_increment primary key,
nombre varchar(128) null,
apellido varchar (128 ) null,
direccion varchar (128 ) null

)engine=innoDB;
alter table cliente add column id_Detalle int not null;
alter table  cliente  add foreign key (id_detalle) references  detalles_cliente(id);
