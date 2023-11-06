package fabricas;
import rh.Vendedor;

public class FactoryVendedor {
	public static Vendedor getVendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		return new Vendedor(nome,endereco,telefone,codigoSetor,salarioBase,imposto,valorVendas,comissao);
	}
	

}
