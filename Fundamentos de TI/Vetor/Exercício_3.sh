# Autor(a):
Eduarda Franderlinde

# Descrição:
Estrutura de loop que armazena os nomes digitados em um vetor.


#! / bin / bash
cod_parada = " sair "
nome = " "
echo  " O código de parada é: sair "
enquanto [[ $ nome  ! =  $ cod_parada ]]
Faz 
      echo  " Escreva um nome: "
      ler nome
      if [[ $ nome  ! =  $ cod_parada ]]
      então 
            vetor [ $ i ] = $ nome
            i = $ (( i + 1 ))
            echo  " O nome escolhido foi $ nome
__________________________________ "
       fi 
feito 
eco 
echo  " Valores do vetor: $ { # vetor [@]}
