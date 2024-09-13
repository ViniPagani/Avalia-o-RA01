// Classe para representar uma solicitação ou cliente
class Elemento {
    String id;
    String descricao;
    String dataHora;

    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    public void imprimirElementoHistorico() {
        System.out.println("ID: " + id + ", Descricao: " + descricao + ", Data/Hora: " + dataHora);
    }
    public void imprimirElementoCliente() {
        System.out.println("ID: " + id + ", Nome: " + descricao + ", Motivo: " + dataHora);
    }

}