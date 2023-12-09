create database cluberecriativo;
use cluberecriativo;

create table associado (
	idassociado int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(100) not null,
    email varchar(100) not null,
    login varchar(100) not null,
    senha varchar(100) not null,
    dependentes int not null,
	dadospagamento varchar(100) not null
);

create table funcionario (
	idfuncionario int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(100) not null,
    email varchar(100) not null,
    login varchar(100) not null,
    senha varchar(100) not null,
    cargo varchar(100) not null,
    salario varchar(100) not null
);

create table gerente (
	idgerente int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(100) not null,
    email varchar(100) not null,
    login varchar(100) not null,
    senha varchar(100) not null,
    cargo varchar(100) not null,
    salario varchar(100) not null
);

create table atividade (
	idatividade int auto_increment primary key,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    faixaetaria varchar(100) not null,
    niveishabilidade varchar(100) not null,
    turma varchar(100) not null,
    horario varchar(100) not null,
    instrutor varchar(100) not null
);	

insert into associado (nome, endereco, telefone, email, login, senha, dependentes, dadospagamento)
values 	("Associado 1",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a1", "a1", 1, "a" ),
		("Associado 2",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a2", "a2", 1, "a" ),
        ("Associado 3",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a3", "a3", 1, "a" ),
        ("Associado 4",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a4", "a4", 1, "a" ),
        ("Associado 5",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a5", "a5", 1, "a" );
        
insert into funcionario (nome, endereco, telefone, email, login, senha, cargo, salario)
values 	("Funcionario 1", "Rua B, 2", "(45) 99999-2222", "funcionario1@clube.com", "f1", "f1", "Cadastro", " R$ 1.200,00"),
		("Funcionario 2", "Rua B, 2", "(45) 99999-2222", "funcionario2@clube.com", "f2", "f2", "Lanchonete", " R$ 1.200,00");
        
insert into gerente (nome, endereco, telefone, email, login, senha, cargo, salario)
values 	("Gerente 1", "Rua C, 3", "(45) 99999-3333", "gerente1@clube.com", "g1", "g1", "R$ 2.400,00");

insert into atividade (nome, descricao, faixaetaria, nivelhabilidade, turma, horario, instrutor)
values ("Natacao", "Natacao para todos", "3 a 65 anos", "Todos", "Turma 1", "07 as 08, | 14 as 15 | 18 as 19", "Professora Flavia");