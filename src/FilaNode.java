class NodeFila<T> {
    T dado;
    NodeFila<T> proximo;

    public NodeFila(T dado) {
        this.dado = dado;
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
        } else {
            base.proximo = newNode;
            base = newNode;
        }
        tamanho++;
    }

    public T desenfileirar() {
        T dado;
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        
        dado = topo.dado;
        topo = topo.proximo;

        if(topo == null) base = null;

        tamanho--;
        return  dado;
    }
}
