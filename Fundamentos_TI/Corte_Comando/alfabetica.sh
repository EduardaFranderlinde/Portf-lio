# Autor(a):
Eduarda Franderlinde

# Descrição:
Lista as duas colunas (frutas e preços) em ordem alfabética.

#!/bin/bash
echo "Lista das frutas"
cut -d" " -f2,3 Lista_Frutas | sort
