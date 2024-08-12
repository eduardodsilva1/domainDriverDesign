package clientes.controladores;

import clientes.entidades.Cliente;
import clientes.service.ClienteService;

public class ClienteControlador {

    private ClienteService clienteService;

    public ClienteControlador(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void validarCliente(int id, String nome, int cpf) {
        if (id == 0 || nome == null || cpf == 0) {
            throw new IllegalArgumentException("Nome e CPF do cliente não podem ser nulos ou vazios.");
        }
    }

    public Cliente procurarPorId(int id) throws Exception {
        if (id == 0) {
            throw new Exception("asgljsajkgnasgbasglksangasnlk");
        }
        return clienteService.procurarPorId(id);
    }
}
