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
        Fila.adicionar(posicao);

        while (!Fila.vazia()) {
            Posicao atual = Fila.remover();
            try {
                if(matriz[atual.getX()][atual.getY()] == 0) {
                    matriz[atual.getX()][atual.getY()] = 2;
                    Fila.adicionar(new Posicao(atual.getX()+1, atual.getY()));
                    Fila.adicionar(new Posicao(atual.getX()-1, atual.getY()));
                    Fila.adicionar(new Posicao(atual.getX(), atual.getY()+1));
                    Fila.adicionar(new Posicao(atual.getX(), atual.getY()-1));

                    imprimir(matriz);
                }
            } catch (Exception e) {}
        }
        
    }

    public static void floodFillPilha(Posicao posicao, int[][] matriz){

        Pilha.adicionar(posicao);

        while (!Pilha.vazia()) {
            Posicao atual = Pilha.remover();
            try {
                if(matriz[atual.getX()][atual.getY()] == 0) {
                    matriz[atual.getX()][atual.getY()] = 2;
                    Pilha.adicionar(new Posicao(atual.getX()+1, atual.getY()));
                    Pilha.adicionar(new Posicao(atual.getX()-1, atual.getY()));
                    Pilha.adicionar(new Posicao(atual.getX(), atual.getY()+1));
                    Pilha.adicionar(new Posicao(atual.getX(), atual.getY()-1));

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

                // itensLinha.append(" ");
            }
            // itensLinha.append("]");
            System.out.println(itensLinha);
        }
    }

    // public static void imprimir(int[][] matriz) {
    //     System.out.println();

    //     for (int linha = 0; linha < matriz.length; linha++) {
    //         StringBuilder itensLinha = new StringBuilder("[ ");
    //         for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
    //             itensLinha.append(matriz[linha][coluna]);
    //             itensLinha.append(" ");
    //         }
    //         itensLinha.append("]");
    //         System.out.println(itensLinha);
    //     }
    // }

    public static void main(String[] args) {
        
        System.out.println("Flood-Fill com pilha");
        int[][] matrizPilha = getMatriz();
        floodFillPilha(new Posicao(8, 8), matrizPilha);

        System.out.println("\n---------------------------------------------------------\n");

        System.out.println("Flood-Fill com fila");
        int[][] matrizFila = getMatriz();
        floodFillFila(new Posicao(9, 4), matrizFila);
    }

}

