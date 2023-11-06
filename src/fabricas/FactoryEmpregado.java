package fabricas;
import rh.Empregado;

public class FactoryEmpregado {
	public static Empregado getEmpregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto ) {
		return new Empregado(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
	}

}
