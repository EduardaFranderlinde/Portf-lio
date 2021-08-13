# Autor(a);
Eduarda Franderlinde

# Descrição:
Lista permissões de outros usuários.

#!/bin/bash
echo "Digite o nome de um arquivo ou diretório para saber suas permissões."
read x
perm=$(ls -l $x)
echo "$perm"
