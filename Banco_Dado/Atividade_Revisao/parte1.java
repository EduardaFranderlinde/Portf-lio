-- 1 --
create table Departamento(
	id int primary key,
	nome varchar(50),
	sigla varchar(50)
);

-- 2 --
create table Funcionario(
	id int primary key,
	nome varchar(50),
	matricula bigint,
	id_departamento int,
	foreign key(id_departamento) references Departamento
);

-- 3 --
alter table Departamento
add column descricao varchar(50)

-- 4 --
alter table Funcionario
rename column nome to sigla

-- 5 --
insert into Departamento
(id, nome, sigla, descricao)
values
(1, 'Departamento Pessoal','DP', 'Atividades administrativas do RH'),
(2, 'Tecnologia da Informação', 'TI', 'Gerenciar as informações da empresa e prestar suporte aos funcionários'),
(3, 'Recursos Humanos', 'RH', 'Recrutar, selecionar e alinhar talentos com a cultura da empresa'),
(4, 'Departamento Financeiro', 'DF', 'Resposável por gerenciar os recursos da empresa'),
(5, 'Departamento Jurídico', 'DJ', 'Resposável por analisar os contratos firmados');

-- 6 --
insert into Funcionario
(id, sigla, matricula, id_departamento)
values
(1,'JCA', 124625,2),
(2, 'AGS',546289,1),
(3,'DSP', 488198,1),
(4, 'CGA',458232,5),
(5, 'TBS',896274,3),
(6, 'ELT',979634,4),
(7, 'GSP',751846,4),
(8, 'MM', 5432992,5),
(9, 'ALL',7363136,3),
(10,'EGF',7483464,2);

-- 7 --
Select * from Funcionario inner join Departamento on Departamento.id = Funcionario.id_departamento

-- 8--
delete from Funcionario where id=1

-- 9 --
select * from funcionario where sigla ilike ('a%')

-- Mundaça na tabela --
alter table Departamento
alter column descricao type varchar(100)
