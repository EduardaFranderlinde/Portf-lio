CREATE TABLE Bilheteria(
N_pulseira int primary key,
Esta_zoo boolean,
Cod_visi varchar(30),
foreign key(Cod_visi) references Visitantes
);

--INSERT pelo import--
