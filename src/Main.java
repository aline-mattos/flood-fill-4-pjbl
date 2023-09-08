public class Main {
    public static int[][] getMatriz() {
        int[][] matriz = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        return matriz;
    }
    
    public static void floodFillFila(Posicao posicao, int[][] matriz){
        FilaNode<Posicao> fila = new FilaNode<>();
        fila.enfileirar(posicao);
//        Fila.adicionar(posicao);

        while (!fila.estaVazia()) {
            Posicao atual = fila.desenfileirar();
            try {
                if(matriz[atual.getX()][atual.getY()] == 0) {
                    matriz[atual.getX()][atual.getY()] = 2;
                    fila.enfileirar(new Posicao(atual.getX()+1, atual.getY()));
                    fila.enfileirar(new Posicao(atual.getX()-1, atual.getY()));
                    fila.enfileirar(new Posicao(atual.getX(), atual.getY()+1));
                    fila.enfileirar(new Posicao(atual.getX(), atual.getY()-1));

                    imprimir(matriz);
                }
            } catch (Exception e) {}
        }
        
    }

    public static void floodFillPilha(Posicao posicao, int[][] matriz){
        PilhaNode<Posicao> pilha = new PilhaNode<>();

        pilha.empilhar(posicao);

//        Pilha.adicionar(posicao);

        while (!pilha.estaVazia()) {
            Posicao atual = pilha.desempilhar();
            try {
                if(matriz[atual.getX()][atual.getY()] == 0) {
                    matriz[atual.getX()][atual.getY()] = 2;
                    pilha.empilhar(new Posicao(atual.getX()+1, atual.getY()));
                    pilha.empilhar(new Posicao(atual.getX()-1, atual.getY()));
                    pilha.empilhar(new Posicao(atual.getX(), atual.getY()+1));
                    pilha.empilhar(new Posicao(atual.getX(), atual.getY()-1));

                    imprimir(matriz);
                }
            } catch (Exception e) {}
        }
    }

   public static void imprimir(int[][] matriz) {
       System.out.println();

       for (int linha = 0; linha < matriz.length; linha++) {
           StringBuilder itensLinha = new StringBuilder("");
           for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
               if (matriz[linha][coluna] == 0)
                   itensLinha.append("⬜");
               else if (matriz[linha][coluna] == 1)
                   itensLinha.append("\u2B1B");
               else
                   itensLinha.append(("🟥"));
           }
           System.out.println(itensLinha);
       }
   }

    //  public static void imprimir(int[][] matriz) {
    //      System.out.println();

    //      for (int linha = 0; linha < matriz.length; linha++) {
    //          StringBuilder itensLinha = new StringBuilder("[ ");
    //          for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
    //              itensLinha.append(matriz[linha][coluna]);
    //              itensLinha.append(" ");
    //          }
    //          itensLinha.append("]");
    //          System.out.println(itensLinha);
    //      }
    //  }

    public static void main(String[] args) {
        
//        System.out.println("Flood-Fill com pilha");
//        int[][] matrizPilha = getMatriz();
//        floodFillPilha(new Posicao(8, 8), matrizPilha);
//
//        System.out.println("\n---------------------------------------------------------\n");

        System.out.println("Flood-Fill com fila");
        int[][] matrizFila = getMatriz();
        floodFillFila(new Posicao(9, 4), matrizFila);
    }

}

