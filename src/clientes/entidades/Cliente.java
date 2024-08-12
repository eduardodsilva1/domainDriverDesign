package clientes.entidades;

public class Cliente {

    private int id;
    private String nome;
    private int cpf;

    public Cliente(int id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "AS INFORMAÇOES QUE CONSTAM NO SISTEMA REFERENTE AO ID, SÃO :\n" + "NOME= " + nome + "\n" + "CPF= " + cpf + "\n";
    }
}