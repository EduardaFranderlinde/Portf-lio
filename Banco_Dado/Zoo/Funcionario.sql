CREATE TABLE Funcionarios(
PIS int primary key,
Nome varchar(50),
Caraga_horaria varchar,
Salario decimal(7,2),
Data_nasc date,
Email varchar(50),
Cargo varchar(20),
CPF varchar
);
INSERT INTO Funcionarios
(PIS, nome, caraga_horaria, salario, data_nasc, email, cargo, cpf)
values
(121313, 'Alice', '48h semanais', 2000.98, '2002-02-28', 'Alicepires@gmail.com', 'Cuidadora',
'120.156.984-89'),
(132645, 'Ludo', '48h semanais', 2000.98, '1999-05-18', 'LudoLima@gmail.com', 'Cuidador',
'456.788.921-45');
