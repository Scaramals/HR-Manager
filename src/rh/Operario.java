package rh;

public class Operario extends Empregado{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(){
		
	}
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super.setNome(nome);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		super.setCodigoSetor(codigoSetor);
		super.setSalarioBase(salarioBase);
		super.setImposto(imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double getValorProducao(){
		return this.valorProducao;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario(){
		return super.calcularSalario() + getValorProducao() * getComissao()/100;
	}
	
	@Override
	public String toString() {
		return "Operario: "+ super.toString() + ", Valor da producao: " + getValorProducao() + "$" +  ", Valor da Comissao: " + getComissao() + "%";
	}
}
