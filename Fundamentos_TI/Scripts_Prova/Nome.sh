# Autor(a): 
Eduarda Franderlinde

# Descrição:
Script que lista o nome de usuários no sistema.

#!/bin/bash
usuario=$(cat /etc/passwd)
echo "$usuario"
