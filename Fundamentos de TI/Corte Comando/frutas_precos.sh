# Autor(a):
Eduarda Franderlinde

# Descrição:
Lista duas colunas do arquivo de texto (As frutas e os preços).

#!/bin/bash
echo "Lista das frutas"
cut -d" " -f2,3 Lista_Frutas
