create table estoque(

id bigint not null auto_increment,
nome varchar(100) not null,
preco numeric (50) not null,
quantidade numeric(11) not null,
ativo tinyint not null,
vencimento varchar (20) not null,

primary key (id)
);