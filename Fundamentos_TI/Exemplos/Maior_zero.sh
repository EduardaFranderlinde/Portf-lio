#Autor(a):
Eduarda Garcia Franderlinde 

#Descrição: 
O algoritmo lê um valor para N e imprime todos os valores inteiros entre 1 e N.

#!/bin/bash
echo "Digite um número"
read N
 
if [ $N -ge 1 ]
then
i=1
while [ $i -lt $N ]
do
 echo "> $i"
 i=$(($i+1))
done
 else
  echo "Tente novamente e insira um número maior que zero."
fi

#Mudança no script (exercício 6):
O algoritmo lê um valor para N e imprime todos os valores inteiros entre 1 e N, entrentanto o algoritmo só aceita valores maiores que zero para N.

#!/bin/bash
echo "Digite um número"
read N
 
if [ $N -ge 1 ]
then
  i=1
  while [ $i -lt $N ]
  do
    echo "> $i"
    i=$(($i+1))
  done
elif [ $N -lt 0 ]
then
  echo "Digite um número maior que zero."
  read N
  i=1
  while [ $i -lt $N ]
  do
    echo "> $i"
    i=$(($i+1))
  done
else
  echo "Insira um parâmetro válido."
fi

