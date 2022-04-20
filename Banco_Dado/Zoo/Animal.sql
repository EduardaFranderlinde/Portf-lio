CREATE TABLE Animal(
Cod_animal int primary key,
Nome varchar(50),
Peso decimal(5,2),
Setor varchar(50),
Obs varchar,
Especie varchar(50),
Ultima_visita_vet date,
Ano_nasc date
);
INSERT INTO Animal
(Cod_animal, Nome, Peso, Setor, Obs, Especie, ultima_visita_vet, ano_nasc)
values
(1, 'Vaseline Luminos', 120.90 , 'Mamíferos', 'Mostrou comportamento agressivo nos últimos
dias.', 'Leão', '2021-02-23', '2003-12-28'),
(2, 'Lina', 2.5, 'Mamíferos', 'Teve um filhote recentemente', 'Elefante', '2021-01-15',
'2009-11-11');
