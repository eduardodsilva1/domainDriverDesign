package clientes.service;

import clientes.entidades.Cliente;
import clientes.repositorios.ClienteRepositorio;

public class ClienteService {

    private ClienteRepositorio clienteRepositorio;

    public ClienteService(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public boolean validarCliente(int id) throws Exception {
        if (id == 2) {
            throw new Exception("cliente inativado na receita, favor validar com setor de cadastro!!");
        }
        return false;
    }

    public void criarNovoCliente(int id, String nome, int cpf) throws Exception {
        Cliente novoCliente = new Cliente(id, nome, cpf);
        clienteRepositorio.create(novoCliente);
    }
    public Cliente procurarPorId(int id) throws Exception {
        if (id == 2) {
            throw new Exception("cliente inativado na receita, favor validar com setor de cadastro!!");
        }
        return clienteRepositorio.findById(id);
    }
}