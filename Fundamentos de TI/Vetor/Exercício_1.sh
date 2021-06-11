# Autor(a):
Eduarda Franderlinde

# Descrição:
Algoritmo de vetor com o nome de 3 pessoas em cada uma delas se apresenta.

#!/bin/bash
vetor[0]="Agnes"
vetor[1]="Leo"
vetor[2]="Lessandra"
 
for i in ${vetor[@]}
do
  echo "Ol.., eu sou $i"
done
