package rh;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;
	
	public Administrador(){
		
	}
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super.setNome(nome);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		super.setCodigoSetor(codigoSetor);
		super.setSalarioBase(salarioBase);
		super.setImposto(imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + getAjudaDeCusto();
	}
	@Override
	public String toString() {
		return "Administrador: " + super.toString() + ", Ajuda de Custo: " + getAjudaDeCusto() + "$";
	}
	
}
