# Autor(a):
Eduarda Garcia Franderlinde

# Descrição: 
O script lê o valor inserido e determina se ele é positvo ou negativo.

#!/bin/bash
echo "Digite um número"
read x

if [ $x -lt 0 ]
then
  echo "O número digita é positivo."
else 
  echo "O número digitado é negativo."
fi
