# Autor(a):
Eduarda Franderlinde

# Descrição:
Descubra sua sorte atráves dos números.

#!/bin/bash
echo "Digite um número até 5 e descubra se ele é o azarado:"
read x
 
if [ $x = 1 ]
then
  echo "O azar foi certeiro para você"
else
  echo "Parece que sua sorte já começou a funcionar"
fi
