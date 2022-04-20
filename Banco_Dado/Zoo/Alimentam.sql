CREATE TABLE Alimentam(
Cod_estoque int,
FOREIGN KEY(Cod_estoque) references Estoque,
Cod_animal int,
FOREIGN KEY(Cod_animal) references Animal
);
INSERT INTO alimentam
(cod_estoque, cod_animal)
VALUES
(1, 1),
(2,2)
