# Autor(a):
Eduarda Franderlinde

# Descrição:
Descubra sua sorte atráves dos números.

#!/bin/bash
echo "Digite um n..mero at.. 5 e descubra se ele .. o azarado:"
read x
 
if [ $x = 1 ]
then
  echo "O azar foi certeiro para voc.."
else
  echo "Parece que sua sorte j.. come..ou a funcionar"
fi
