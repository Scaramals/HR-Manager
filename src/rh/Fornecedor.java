package rh;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super.setNome(nome);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return this.valorCredito;
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return getValorCredito() - getValorDivida();
	}
	
	@Override
	public String toString() {
		return "Fornecedor: "+ super.toString() + ", Valor de Credito: " + getValorCredito() + "$" +", Valor da Divida: " + getValorDivida() + "$" + ", Saldo atual: " + obterSaldo() + "$";
	}
}
