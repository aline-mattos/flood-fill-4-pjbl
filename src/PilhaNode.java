class NodePilha<T> {
    T dado;
    NodePilha<T> proximo;

    public NodePilha(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

class PilhaNode<T> {
    private NodePilha<T> topo;
    private int tamanho;

    public PilhaNode() {
        topo = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void empilhar(T dado) {
        NodePilha<T> newNode = new NodePilha<>(dado);
        newNode.proximo = topo;
        topo = newNode;
        tamanho++;
    }

    public T desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        T dado = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return dado;
    }

    public T espiar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.dado;
    }
}
