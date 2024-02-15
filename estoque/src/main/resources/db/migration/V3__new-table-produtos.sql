create table produtos(

id bigint not null auto_increment,
nome varchar(100) not null,
preco numeric (50) not null,
codigo bigint not null,

primary key (id)
);