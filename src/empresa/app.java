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
				
					String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
					
					String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
					
					int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
					
					double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
					
					double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
					
					emp[i] = new Empregado(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
					
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
						
						String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
						
						String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
						
						int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
						
						double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
						
						double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
						
						double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi a sua ajuda de custo?"));
	
						adm[i] = new Administrador(nome,endereco,telefone,codigoSetor,salarioBase,imposto,ajudaDeCusto);
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
							
							
							String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
							
							String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
							
							
							int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
														
							double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
														
							double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
							
							double valorProducao = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
							
							double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
							
							op[i] = new Operario(nome,endereco,telefone,codigoSetor,salarioBase,imposto,valorProducao,comissao);
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
								
								
								String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
																
								String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
														
								int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
																
								double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
																
								double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
																
								double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
																
								double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
								
								ved[i] = new Vendedor(nome,endereco,telefone,codigoSetor,salarioBase,imposto,valorVendas,comissao);
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
					
					String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
					
					String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
					
					double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu credito atual?"));
					
					double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce tem de divida?"));
					
					forne[i] = new Fornecedor(nome,endereco,telefone,valorCredito,valorDivida);
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
