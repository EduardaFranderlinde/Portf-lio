# Autor(a):
Eduarda Garcia Franderlinde

# Descrição:
Algoritmo para ler o preço de 15 produtos e mostrar o maior preço lido, além de calcular a média de preços dos produtos e imprimir o resultado.

#!/bin/bash
soma=0
maior=0
for i in $(seq 1 15)
do
 echo "O preço do $i produto:"
 read x
 if [ $x -gt $maior ]
 then
  maior=$x
 fi
 soma=$((soma+1))
done
media=$(bc <<< "scale=2;$soma/15")
echo " A média dos preços é $media."
echo "O maior valor é $maior."
