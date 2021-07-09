# Autor(a):
Eduarda Frandelinde

# Descrição:
Algoritmo de vetor com o nome de 3 pessoas em cada uma delas se apresenta.(Utilizando while)

#!/bin/bash
vetor[0]="Agnes"
vetor[1]="Roberta"
vetor[2]="Isadora"
 
nome=${#vetor[@]}
i=0
while [ $i -lt $nome ]
do
        echo "Oi, eu sou ${vetor[i]}."
        i=$((i+1))
done
