create table clientes(

id bigint not null auto_increment,
nome varchar(100) not null,
nascimento varchar (50) not null,
cpf varchar(11) not null,
cep varchar(8) not null,

primary key (id)
);