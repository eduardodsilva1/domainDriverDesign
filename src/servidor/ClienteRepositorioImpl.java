package servidor;

import clientes.entidades.Cliente;
import clientes.repositorios.ClienteRepositorio;

public class ClienteRepositorioImpl implements ClienteRepositorio {

    @Override
    public void create(Cliente entidade) {
        System.out.println("Cliente criado com sucesso!");
    }
    @Override
    public void update(Cliente entidade) {
        System.out.println("Cliente atualizado com sucesso!");
    }
    @Override
    public void delete(Cliente entidade) {
        System.out.println("Cliente deletado com sucesso!");
    }

    @Override
    public Cliente findById(int id) {
        Cliente clienteX = null;

        if (id == 1) {
            clienteX = new Cliente(1, "Eduardo", 124);
        } else if (id == 2) {
            clienteX = new Cliente(2, "Kevin", 231);
        } else if (id == 3) {
            clienteX = new Cliente(3, "Moises", 111);
        } else if (id == 4) {
            clienteX = new Cliente(4, "Maicom", 222);
        } else if (id == 5) {
            clienteX = new Cliente(5, "Lara", 555);
        } else if (id == 6) {
            clienteX = new Cliente(6, "Lucas", 666);
        } else if (id == 7) {
            clienteX = new Cliente(7, "Sophia", 777);
        } else if (id == 8) {
            clienteX = new Cliente(8, "Pedro", 888);
        } else if (id == 9) {
            clienteX = new Cliente(9, "Camila", 999);
        } else if (id == 10) {
            clienteX = new Cliente(10, "Rodrigo", 123);
        } else if (id == 11) {
            clienteX = new Cliente(11, "Gabriel", 456);
        } else if (id == 12) {
            clienteX = new Cliente(12, "Mariana", 789);
        } else if (id == 13) {
            clienteX = new Cliente(13, "Renato", 333);
        } else if (id == 14) {
            clienteX = new Cliente(14, "Fernanda", 444);
        }
        return clienteX;
    }
    @Override
        public void findByCpf (Cliente entidade){
        }
    }
