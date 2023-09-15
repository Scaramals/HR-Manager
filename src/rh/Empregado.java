package rh;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto ) {
		
		super.setNome(nome);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public int getCodigoSetor() {
		return this.codigoSetor;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public double getImposto() {
		return this.imposto;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		return getSalarioBase() - getSalarioBase() * getImposto()/100;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Codigo do Setor: " + getCodigoSetor() + ", Salario Base: " + getSalarioBase() + "$" + ", Imposto: "
								+ getImposto() + "%" + ", Salario mensal: " + calcularSalario() + "$";
	}

}
