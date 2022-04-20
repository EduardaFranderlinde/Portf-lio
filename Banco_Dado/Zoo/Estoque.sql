CREATE TABLE Estoque(
Cod int primary key,
Produto varchar(50),
Qtd int,
Preco decimal(7,2),
Marca varchar(30),
Validade varchar(50),
Data_compra date,
Cod_fornecedor int,
foreign key(Cod_fornecedor) references Fornecedores
);
INSERT INTO estoque
(cod, produto, qtd, preco, marca, validade, data_compra, cod_fornecedor)
values
(1, 'Ração para Leão', 102, 1000.21, 'Gold', '2021-12-12', '2021-02-11', 45256356/000123),
(2, 'Ração para elefante', 100, 2000.99, 'Alimentos verde', '2021-12-21', '2021-01-19',
12365489/000145);
