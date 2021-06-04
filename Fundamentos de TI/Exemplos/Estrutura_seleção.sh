# Autor(a):
Eduarda Garcia Franderlinde

# Descrição:
O script lê o ano de nascimento o e ano atual para dizer se é possível votar ou não.

#!/bin/bash
echo "Qual o ano atual?"
read x
echo "Qual é o seu ano de nascimento?"
read y

ano_18=$((x - 18))
ano_16=$((x -16))

if [ $y -le $ano_18 ]
then
  echo "Você deve votar!"
elif [ $y - le $ano_16 ]
then 
  echo "Você pode votar."
else 
  echo "Você não pode votar."
fi

