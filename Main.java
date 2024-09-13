import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Criar pilha de histórico de solicitações
        Pilha historicoSolicitacoes = new Pilha();

        // Criar fila de atendimento
        Fila filaAtendimento = new Fila();

        // Array de clientes na fila de atendimento
        Elemento[] filaAtendimentoArray = new Elemento[] {
                new Elemento("CLI001", "Maria Silva", "Duvida sobre produto"),
                new Elemento("CLI002", "Joao Souza", "Reclamacao de servico"),
                new Elemento("CLI003", "Ana Costa", "Solicitacao de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informacoes de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteracao de pedido"),
                new Elemento("CLI007", "Patricia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovacao de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalacao"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orcamento")
        };

        // Array de histórico de solicitações
        Elemento[] historicoArray = new Elemento[] {
                new Elemento("REQ001", "Instalacao de software", "2024-08-20 10:30"),
                new Elemento("REQ002", "Manutencao preventiva", "2024-08-20 11:00"),
                new Elemento("REQ003", "Atualizacao de sistema", "2024-08-20 11:30"),
                new Elemento("REQ004", "Suporte tecnico", "2024-08-20 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Elemento("REQ008", "Configuracao de rede", "2024-08-20 14:00"),
                new Elemento("REQ009", "Restauracao de dados", "2024-08-20 14:30"),
                new Elemento("REQ010", "Consulta tecnica", "2024-08-20 15:00")
        };

        // Adicionar elementos da fila de atendimento ao objeto Fila
        for (Elemento cliente : filaAtendimentoArray) {
            filaAtendimento.adicionarFila(cliente);
        }

        // Adicionar elementos do histórico ao objeto Pilha
        for (Elemento solicitacao : historicoArray) {
            historicoSolicitacoes.adicionar(solicitacao);
        }

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("");
            System.out.print("Menu:\n" +
                    "Digite 1 - Inserir um cliente na fila de atendimento\n" +
                    "Digite 2 - Inserir um Historico de Solicitacao na pilha\n" +
                    "Digite 3 - Chamar o proximo cliente da fila de atendimento\n" +
                    "Digite 4 - Imprimir a fila de atendimento\n" +
                    "Digite 5 - Imprimir o historico de solicitacoes\n" +
                    "Digite 6 - Sair\n" +
                    "Digite uma opcao: ");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Digite o ID: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o motivo: ");
                    String motivo = scanner.nextLine();

                    Elemento novoElemento = new Elemento(id, nome, motivo);
                    filaAtendimento.adicionarFila(novoElemento);

                    break;

                case 2:
                    System.out.print("Digite o id: ");
                    scanner.nextLine();
                    String idHist = scanner.nextLine();

                    System.out.print("Digite o descricao: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Digite o dataHora: ");
                    String dataHora = scanner.nextLine();

                    Elemento novoHist = new Elemento(idHist, descricao, dataHora);
                    historicoSolicitacoes.adicionar(novoHist);
                    break;

                case 3:
                    System.out.println("\nAtendendo o proximo cliente:");
                    Elemento clienteAtendido = filaAtendimento.excluirFila();
                    clienteAtendido.imprimirElementoCliente();

                    break;
                case 4:
                    System.out.println("Fila de Atendimento:\n");
                    filaAtendimento.imprimirFila();
                    break;
                case 5:
                    System.out.println("Historico de Solicitacoes:\n");
                    historicoSolicitacoes.imprimirPilha();
                    break;
                case 6:
                    System.out.println("Obrigado!");
                    System.exit(0);
                default:
                    System.out.println("invalido");
                    System.exit(0);
            }
        }
    }
}
