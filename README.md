<h1 align="center">
 🖌️ PjBL 1 - Flood Fill 🖌️ <br>Grupo - Listas Lineares 4<br><br>
</h1>

# 🚀 Introdução

<p align="justify">
  Esse projeto foi desenvolvido para a disciplina de Resolução de Problemas Estruturados em Computação, com o objetivo de compreender os conceitos de fila e pilha através do algoritmo de flood fill. Em suma, possuímos uma matriz onde estão dispostos valores 0 e 1. Durante a verificação da posição, é identificado qual o valor presente naquela posição de memória, caso seja indicado que o valor é 0, ele será substituído por 2 e caso encontre o valor 1 o algoritmo deve seguir para a próxima posição.
</p><br>

# 🎨 O Algoritmo

<p align="justify">
  Existem duas soluções dentro do projeto que conseguem executar a ideia do algoritmo de flood fill e vamos explorar cada uma delas:
</p><br>

## 📚 Pilha

<p align="justify">
  A pilha utiliza o conceito de LIFO (Last-In-First-Out), isso significa que o primeiro item adicionado na pilha é o primeiro a ser removido. Podemos observar esse comportamento no projeto da seguinte forma:
</p><br>

<p align="justify">
  Nesse exemplo, estamos iniciando na posição matriz[8][8].
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_1.png)

<p align="justify">
  Quando fazemos isso, também estamos identificando os números nas posições matriz[8][7], matriz[8][9], matriz[7][8] e matriz[9][8]:
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_2.png)

<p align="justify">
  Dessa forma, o próximo dado a ser processado de acordo com a pilha é o da posição matriz[8][7], no momento em que esse dado é processado, novas posições são adicionadas a pilha, sendo elas: matriz[8][6], matriz[8][8], matriz[7][7] e matriz[9][7]. Com isso, as posições que haviam sido previamente armazenadas na pilha passaram a ficar mais distantes da verificação atual.
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_3.png)

<p align="justify">
  Pensando em uma maneira mais ilustrativa, a pilha estaria se comportando dessa forma:
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_4.png)

<p align="justify">
  Além disso, todo esse processo ocorre dentro da função floodFillPilha:
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_5.png)

<p align="justify">
  Resumidamente, temos que a posição inicial (matriz[8][8]) é adicionada na pilha e isso garante que a pilha não está mais vazia, possibilitando que o while loop seja iniciado. Assim que isso ocorre, a posição atual (no caso a matriz[8][8]) é removida da pilha e posteriormente segue para as validações. Como na posição matriz[8][8] foi encontrado o valor 0, ele foi substituído por 2 e em seguida as posições matriz[9][8], matriz[7][8], matriz[8][9] e matriz[8][7] são adicionadas a pilha e assim por diante a cada nova verificação de posição. Caso o valor encontrado na posição seja diferente de 0, a posição é apenas removida da pilha pois não respeita o condicional e assim segue para a próxima posição armazenada na pilha. Dessa forma, o while loop continuará em execução até que todas as posições da pilha sejam removidas.
</p><br>

## ✏️ Fila

<p align="justify">
  A fila utiliza o conceito de FIFO (First-In-First-Out), isso significa que a cada novo item adicionado ele irá para o final da fila e a remoção ocorre no início da fila. Podemos observar esse comportamento no projeto da seguinte forma:
</p><br>

<p align="justify">
  Nesse exemplo, estamos iniciando na posição matriz[3][2].
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_6.png)

<p align="justify">
  Com isso, é identificado as posições matriz[4][2], matriz[2][2], matriz[3][3] e matriz[3][1]
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_7.png)

<p align="justify">
  Devido ao comportamento da fila, todas essas posições adicionadas são verificadas em sequência.
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_8.png)

<p align="justify">
  No entanto, no momento que verificamos a posição matriz[4][2], também adicionamos novas posições a fila, mas elas são adicionadas no final, como mostra o exemplo abaixo:
</p>

![image](https://github.com/aline-mattos/flood-fill-4-pjbl/blob/main/flood-fill-assets/img_9.png)


<p align="justify">
  Nesse caso, a função de flood fill segue igual à da Pilha, com a questão de que na fila todos os dados adicionados devem ser processados primeiro, mesmo que novos dados sejam inseridos posteriormente.
</p>

# 🚀 Desenvolvedores

  * Aline Belomo de Mattos
  * Amanda Bressam Martins
  * Gabriel Barros Gonçalves
