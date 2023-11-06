package fabricas;
import rh.Administrador;

public class FactoryAdministrador {
	public static Administrador getAdminstrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		return new Administrador();
	}

}
