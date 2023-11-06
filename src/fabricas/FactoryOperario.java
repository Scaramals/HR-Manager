package fabricas;
import rh.Operario;

public class FactoryOperario {
	public static Operario getOperario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		return new Operario();
	}

}
