public class Main {
    public static int[][] matriz = {
            {0,0,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,1,0,0,0},
            {0,0,0,0,0,1,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0}
    };
    public static void main(String[] args) {

        imprimir();
    }

    public static void imprimir() {
        System.out.println();

        for (int linha = 0; linha < matriz.length; linha++){
            StringBuilder itensLinha = new StringBuilder("[ ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                itensLinha.append(matriz[linha][coluna]);
                itensLinha.append(" ");
            }
            itensLinha.append("]");
            System.out.println(itensLinha);
        }
    }

}

