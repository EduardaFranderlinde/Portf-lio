# Autor(a):
Eduarda Garcia Franderlinde

# Descrição:
Algoritmo que imprimi os números de 1 a 10 em ordem decrescente.

#!/bin/bash
i=10
while [ $i -gt 0 ]
do
 echo "- $i"
 i=$((i-1))
done
