package clientes.repositorios;

import clientes.entidades.Cliente;
import compartilhado.interfaceRepositorio;

public interface ClienteRepositorio extends interfaceRepositorio <Cliente>{

    Cliente findById(int id);

    void findByCpf (Cliente entidade);

}

