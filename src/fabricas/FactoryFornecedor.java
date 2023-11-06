package fabricas;
import rh.Fornecedor;

public class FactoryFornecedor {
	public static Fornecedor getFornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		return new Fornecedor(nome,endereco,telefone,valorCredito,valorDivida);
	}

}
