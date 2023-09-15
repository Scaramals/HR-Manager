package rh;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		
	}
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super.setNome(nome);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		super.setCodigoSetor(codigoSetor);
		super.setSalarioBase(salarioBase);
		super.setImposto(imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() +  getValorVendas() * getComissao()/100;
	}
	
	@Override
	public String toString() {
		return "Vendedor: " +  super.toString() + ", Valor das Vendas: " + getValorVendas() + "$" + ", Porcentagem da comissao: " + getComissao() + "%";
	}

}
