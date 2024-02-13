create table desafio_final.clientes(

id bigint not null auto_increment,
nome varchar(100) not null,
dataNascimento date not null,
cpf varchar(11) not null,
cep varchar(8) not null,
primary key (id)
)