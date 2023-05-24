package pessoasClientes;

public class PessoaJuridica extends Clientes {
    private String cnpj;
    
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
 
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + cnpj);
    }
}