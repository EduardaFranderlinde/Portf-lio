# Autor(a):
Eduarda Franderlinde

#Descrição:
Simulação de um problema.

#!/bin/bash
vetor[0]="2,4,6..."
 
for i in ${vetor[0]}
do
  echo "Qual a razão da PA a seguir: $i"
done
echo "Escreva a razão utilizando algarismos."
read x
if [ $x = 2 ]
then
        echo "Você está correto!"
else
        echo "Você errou! Tente novamente."
fi

