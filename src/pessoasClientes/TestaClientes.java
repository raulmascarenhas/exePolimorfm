package pessoasClientes;

public class TestaClientes extends Clientes {
    public TestaClientes(String nome, String endereco) {
		super(nome, endereco);
	
	}

	public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria Souza", "Avenida B, 456", "987.654.321-00");
        
        pessoaFisica1.visualizar();
        System.out.println("-----------");
        pessoaFisica2.visualizar();
        
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa XYZ", "Rua C, 789", "12.345.678/0001-00");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa ABC", "Avenida D, 987", "98.765.432/0001-00");
        
        pessoaJuridica1.visualizar();
        System.out.println("-----------");
        pessoaJuridica2.visualizar();
    }
}
