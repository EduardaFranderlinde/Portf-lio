#autor(a):
Eduarda Garcia Franderlinde

#Descrição:
Algoritmo que imprime os números de 1 a 10 em ordem crscente.

#!/bin/bash
i=1
while [ $i -lt 11 ]
do
 echo "- $i"
 i=$((i+1))
done
