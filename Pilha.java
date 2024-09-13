// Classe para representar a pilha usando lista encadeada
class Pilha {
    private Node topo;

    public Pilha() {
        topo = null;
    }

    public void adicionar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    public void imprimirPilha() {
        Node atual = topo;
        while (atual != null) {
            atual.elemento.imprimirElementoHistorico();
            atual = atual.proximo;
        }
    }
}