package pessoasClientes;

public class PessoaFisica extends Clientes {
    private String cpf;
    
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }
   
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + cpf);
    }
}