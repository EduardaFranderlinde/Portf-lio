CREATE TABLE Visitantes(
CPF varchar(30) primary key,
Nome varchar(50),
Idade int,
Checkin boolean
);
insert into visitantes
(cpf, nome, idade, checkin)
values
('124.458.785-89', 'Luana Torres', 19, true),
('325.568.659-99', 'Lucas Gentille', 22, false);
