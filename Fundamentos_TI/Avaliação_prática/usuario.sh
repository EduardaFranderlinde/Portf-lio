# Autor(a):
Eduarda Franderlinde

# Descrição:
Lista usuários

#!/bin/bash
usuario=$(cat /etc/passwd | cut -d":" -f1)
echo "$usuario"
