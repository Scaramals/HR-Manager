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
		
		int tipoTrabalhador = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de trabalhador você quer cadastrar? 1-Empregado ou 2-Fornecedor"));
		int tipoEmpregado;
		
		if(tipoTrabalhador == 1) {
			tipoEmpregado = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de Empregado você quer cadastrar? 1-Empregado padrão, 2-Administrador, 3-Operario ou 4-Vendedor"));
			if(tipoEmpregado == 1) {
				//Empregado:
				Empregado[] emp = new Empregado[2];
				
				
				for(int i = 0; i<emp.length; i++) {
					
					emp[i] = new Empregado();
					
					String nome = JOptionPane.showInputDialog("Qual o seu nome?");
					emp[i].setNome(nome);
					
					String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
					emp[i].setEndereco(endereco);
					
					String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
					emp[i].setTelefone(telefone);
					
					int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
					emp[i].setCodigoSetor(codigoSetor);
					
					double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
					emp[i].setSalarioBase(salarioBase);
					
					double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
					emp[i].setImposto(imposto);
					
				}
				for(int i = 0; i<emp.length; i++) {
					JOptionPane.showMessageDialog(null, emp[i].toString());
				}
				
			}else {
				if(tipoEmpregado == 2) {
					//Administrador:
					Administrador[] adm = new Administrador[2];
					
					for(int i = 0; i < adm.length; i++){
						
						adm[i] = new Administrador();
						
						String nome = JOptionPane.showInputDialog("Qual o seu nome?");
						adm[i].setNome(nome);
						
						String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
						adm[i].setEndereco(endereco);
						
						String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
						adm[i].setTelefone(telefone);
						
						int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
						adm[i].setCodigoSetor(codigoSetor);
						
						double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
						adm[i].setSalarioBase(salarioBase);
						
						double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
						adm[i].setImposto(imposto);
						
						double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi a sua ajuda de custo?"));
						adm[i].setAjudaDeCusto(ajudaDeCusto);
					}
					
					for(int i = 0; i<adm.length; i++) {
						JOptionPane.showMessageDialog(null, adm[i].toString());
					}
				}else {
					if(tipoEmpregado == 3) {
						//Operario:
						Operario[] op = new Operario[2];
						for(int i = 0; i< op.length; i++) {
							op[i] = new Operario();
							
							String nome = JOptionPane.showInputDialog("Qual o seu nome?");
							op[i].setNome(nome);
							
							String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
							op[i].setEndereco(endereco);
							
							String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
							op[i].setTelefone(telefone);
							
							int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
							op[i].setCodigoSetor(codigoSetor);
							
							double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
							op[i].setSalarioBase(salarioBase);
							
							double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
							op[i].setImposto(imposto);
							
							double valorProducao = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
							op[i].setValorProducao(valorProducao);
							
							double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
							op[i].setComissao(comissao);
						}	
						
						for(int i = 0; i<op.length; i++) {
							JOptionPane.showMessageDialog(null, op[i].toString());
						}
					}else {
						if(tipoEmpregado == 4) {
							//Vendedor:
							Vendedor[] ved = new Vendedor[2];
							for(int i = 0; i< ved.length;i++) {
								
								ved[i] = new Vendedor();
								
								String nome = JOptionPane.showInputDialog("Qual o seu nome?");
								ved[i].setNome(nome);
								
								String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
								ved[i].setEndereco(endereco);
								
								String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
								ved[i].setTelefone(telefone);
								
								int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
								ved[i].setCodigoSetor(codigoSetor);
								
								double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
								ved[i].setSalarioBase(salarioBase);
								
								double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
								ved[i].setImposto(imposto);
								
								double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
								ved[i].setValorVendas(valorVendas);
								
								double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
								ved[i].setComissao(comissao);
							}	
							
							for(int i = 0; i<ved.length; i++) {
								JOptionPane.showMessageDialog(null, ved[i].toString());
							}		
						}else {
							JOptionPane.showMessageDialog(null, "Empregado invalido");
						}
					}
				}
			}
		}else {
			if(tipoTrabalhador == 2) {
				//Fornecedor:
				
				Fornecedor[] forne = new Fornecedor[2];
				
				for(int i = 0; i<forne.length; i++) {
					
					forne[i] = new Fornecedor();
					
					String nome = JOptionPane.showInputDialog("Qual o seu nome?");
					forne[i].setNome(nome);
					
					String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
					forne[i].setEndereco(endereco);
					
					String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
					forne[i].setTelefone(telefone);
					
					double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu credito atual?"));
					forne[i].setValorCredito(valorCredito);
					
					double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce tem de divida?"));
					forne[i].setValorDivida(valorDivida);
				}
				for(int i = 0; i<forne.length; i++) {
					JOptionPane.showMessageDialog(null, forne[i].toString());
				}
			}else {
				JOptionPane.showMessageDialog(null, "Trabalhador invalido");
			}
		}
			
			
			
			
			
			
				
			
		
			
		
		
		
	}

}
