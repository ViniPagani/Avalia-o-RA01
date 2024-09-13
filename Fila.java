// Classe para representar a fila usando lista encadeada
class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        frente = null;
        tras = null;
    }

    public void adicionarFila(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (tras == null) {
            frente = tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }

    public Elemento excluirFila() throws Exception {
        if (frente == null) {
            throw new Exception("A fila está vazia.");
        }

        Elemento elemento = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return elemento;
    }

    public void imprimirFila() {
        Node atual = frente;
        while (atual != null) {
            atual.elemento.imprimirElementoCliente ();
            atual = atual.proximo;
        }
    }
}