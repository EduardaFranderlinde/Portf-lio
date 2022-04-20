--Visualização de funcionarios--
select n_carteira_trabalho as PIS, nome, (carga_horaria + 2) from funcionarios

--Visualização de relação--
select * from venda inner join produtos on venda.cod_prod = produtos.cod_prod

-- Visualização de seleção de entidades--
select * from clientes where nome= 'William' or nome= 'Duda'

--Visualização de seleção de entidades--
select data as data_venda, cod_funcionario, cod_prod, cod_cliente from venda

--Visualização de funcionarios--
select n_carteira_trabalho as PIS, nome, cpf from funcionarios
