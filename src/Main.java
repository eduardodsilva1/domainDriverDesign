import clientes.controladores.ClienteControlador;
import clientes.repositorios.ClienteRepositorio;
import clientes.service.ClienteService;
import servidor.ClienteRepositorioImpl;
import javax.swing.JOptionPane;
import clientes.entidades.Cliente;

public class Main {
    public static void main(String[] args) throws Exception {

        ClienteRepositorio clienteRepositorio = new ClienteRepositorioImpl();
        ClienteService clienteService = new ClienteService(clienteRepositorio);
        ClienteControlador clienteControlador = new ClienteControlador(clienteService);

        Integer[] opcoes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        Integer idEscolhido = (Integer) JOptionPane.showInputDialog(
                null,
                "Escolha um ID para procurar o cliente:",
                "Procurar Cliente pelo ID",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        Cliente clientebuscado = clienteControlador.procurarPorId(idEscolhido);
        if (clientebuscado != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente encontrado: \n" +
                            "ID: " + clientebuscado.getId() + "\n" +
                            "Nome: " + clientebuscado.getNome() + "\n" +
                            "CPF: " + clientebuscado.getCpf(),
                    "Cliente Encontrado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
