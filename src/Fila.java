import java.util.ArrayList;

public class Fila {
    private static ArrayList<Posicao> posicoes = new ArrayList<>();

    public static void adicionar(Posicao posicao){
        posicoes.add(posicao);
    }
    public static Posicao remover(){
        return posicoes.remove(0);
    }

    public static boolean vazia() {
        return posicoes.isEmpty();
    }
}