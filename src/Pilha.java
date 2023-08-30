import java.util.ArrayList;
public class Pilha {
    private static ArrayList<Posicao> posicoes = new ArrayList<>();

    public static void adicionar(Posicao posicao){
        posicoes.add(posicao);
    }
    public static Posicao remover(){
        return posicoes.remove(posicoes.size() - 1);
    }

    public static boolean vazia() {
        return posicoes.isEmpty();
    }
}