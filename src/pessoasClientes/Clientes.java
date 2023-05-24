package pessoasClientes;

public class Clientes {
	private String nome;
    private String endereco;
    
    public Clientes(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}

