-- 1 feita no diagrama --
-- 2 --
CREATE TABLE Medicamentos(
	id int PRIMARY KEY,
  	nome VARCHAR(100),
  	qtd_estoque int,
  	tarja_preta BOOLEAN
);

INSERT INTO Medicamentos
(id, nome, qtd_estoque, tarja_preta)
VALUES
(1, 'Heparina', 140, FALSE),
(2, 'Varfarina', 125, FALSE),
(3, 'Aspirina', 200, FALSE),
(4, 'Oxicodona', 100, TRUE),
(5, 'Diazepam', 100, TRUE);

create table Farmacia(
	id int PRIMARY KEY,
  	nome varchar(100),
  	endereco varchar(100),
  	contato varchar(50)
);

INSERT into Farmacia
(id, nome, endereco, contato)
VALUES
(1, 'Drogaria Popular', 'Rua dos Tucanos, n 33, Jabuti dourado', '3358-6595'),
(2, 'Farmárica da Nina','Rua Lila, n 23, Riberão', '3354-9898'),
(3, 'Farmácia e Drogaria', 'Rua João Vita, n 1022', '3697-6675'),
(4, 'Droga Raia', 'Rua Araponga, n 45,Ponta Aguda', '3795-9647'),
(5, 'Farmica Popular', 'Rua Princesa Isabel, n 255, Forquilhinha', '3131-9585');

create table Estocar(
  	id_medi int,
 	 FOREIGN KEY(id_medi) REFERENCES Medicamentos,
  	id_farmacia int,
  	FOREIGN KEY(id_farmacia) REFERENCES Farmacia
);

INSERT INTO Estocar
(id_medi, id_farmacia)
VALUES
(1, 2),
(2, 2),
(3, 4),
(4, 1),
(5,1),
(1,3); 

CREATE TABLE Funcionarios(
	cpf BIGINT PRIMARY key,
  	nome varchar(50),
  	cargo VARCHAR(50),
  	salario DECIMAL(6,2),
  	id_farmacia int,
  	FOREIGN KEY(id_farmacia) REFERENCES farmacia(id)
);

insert into Funcionarios
(cpf, nome, cargo, salario, id_farmacia)
VALUES
(12375295689, 'Carlos Augusto','Gerente', 1500.59, 1), 
(15964583476, 'Augusta Silveira','Caixa', 1200.00, 1),
(45675342643, 'Alita Pires','Caixa', 1280.25, 2),
(12375245463, 'Aline','Farmacêutica', 1800.99, 4);

-- 3 --

SELECT * from farmacia 
INNER join Estocar on estocar.id_farmacia = farmacia.id
INNER JOIN funcionarios on funcionarios.id_farmacia = farmacia.id

-- 4 --

CREATE FUNCTION aumento(salario decimal(6,2)) RETURNS DECIMAL(6,2) AS $$
	DECLARE
		aumento DECIMAL(6,2);
    BEGIN
    	aumento = salario * 0.10;
        aumento = aumento + salario;
    RETURN aumento;
   end;
$$ LANGUAGE PLPGSQL;

-- 5 --

UPDATE funcionarios set salario = aumento(salario)
SELECT * from funcionarios 
