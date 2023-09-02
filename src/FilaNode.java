class NodeFila<T> {
    T dado;
    NodeFila<T> anterior;
    NodeFila<T> proximo;

    public NodeFila(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

public class FilaNode<T> {
    private NodeFila<T> topo;
    private NodeFila<T> base;
    private int tamanho;

    public FilaNode() {
        topo = null;
        base = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void enfileirar(T dado) {
        NodeFila<T> newNode = new NodeFila<>(dado);
        if(estaVazia()) {
            topo = newNode;
            base = newNode;
        } else if(tamanho == 1) {
            topo.proximo = newNode;
            newNode.anterior = base;
            base = newNode;
        } else {
            newNode.anterior = base;
            base = newNode;
        }
        tamanho++;
    }

    public T desenfileirar() {
        T dado;
        if(estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        } else if(tamanho == 1) {
            dado = topo.dado;
            topo = null;
            base = null;
        } else {
            dado = topo.dado;
            topo = topo.proximo;
        }
        tamanho--;
        return  dado;
    }
}
