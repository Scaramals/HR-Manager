package empresa;
import javax.swing.JOptionPane;
import rh.Empregado;
import rh.Pessoa;
import rh.Administrador;
import rh.Operario;
import rh.Vendedor;
import rh.Fornecedor;

public class app {

	public static void main(String[] args) {
		
//Empregado:
		
		Empregado emp1 = new Empregado();
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		emp1.setNome(nome);
		
		String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
		emp1.setEndereco(endereco);
		
		String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
		emp1.setTelefone(telefone);
		
		int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
		emp1.setCodigoSetor(codigoSetor);
		
		double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
		emp1.setSalarioBase(salarioBase);
		
		double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
		emp1.setImposto(imposto);
	
		JOptionPane.showMessageDialog(null, emp1.toString());
		
//Fornecedor:
		
		Fornecedor for1 = new Fornecedor();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		for1.setNome(nome);
		
		endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
		for1.setEndereco(endereco);
		
		telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
		for1.setTelefone(telefone);
		
		double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu credito atual?"));
		for1.setValorCredito(valorCredito);
		
		double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce tem de divida?"));
		for1.setValorDivida(valorDivida);
	
		JOptionPane.showMessageDialog(null, for1.toString());
		
//Administrador:
		
		Administrador adm1 = new Administrador();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		adm1.setNome(nome);
		
		endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
		adm1.setEndereco(endereco);
		
		telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
		adm1.setTelefone(telefone);
		
		codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
		adm1.setCodigoSetor(codigoSetor);
		
		salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
		adm1.setSalarioBase(salarioBase);
		
		imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
		adm1.setImposto(imposto);
		
		double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi a sua ajuda de custo?"));
		adm1.setAjudaDeCusto(ajudaDeCusto);
		
		JOptionPane.showMessageDialog(null, adm1.toString());
		
//Operario:
		
		Operario op1 = new Operario();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		op1.setNome(nome);
		
		endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
		op1.setEndereco(endereco);
		
		telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
		op1.setTelefone(telefone);
		
		codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
		op1.setCodigoSetor(codigoSetor);
		
		salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
		op1.setSalarioBase(salarioBase);
		
		imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
		op1.setImposto(imposto);
		
		double valorProducao = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
		op1.setValorProducao(valorProducao);
		
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
		op1.setComissao(comissao);
		
		JOptionPane.showMessageDialog(null, op1.toString());
		
	
//Vendedor:
		
		Vendedor ved1 = new Vendedor();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		ved1.setNome(nome);
		
		endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
		ved1.setEndereco(endereco);
		
		telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
		ved1.setTelefone(telefone);
		
		codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
		ved1.setCodigoSetor(codigoSetor);
		
		salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
		ved1.setSalarioBase(salarioBase);
		
		imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
		ved1.setImposto(imposto);
		
		double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
		ved1.setValorVendas(valorVendas);
		
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
		ved1.setComissao(comissao);
		
		JOptionPane.showMessageDialog(null, ved1.toString());
		
		

		
	}

}
