package empresa;
import fabricas.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import rh.Administrador;
import rh.Empregado;
import rh.Fornecedor;
import rh.Operario;
import rh.Vendedor;

public class app {

	public static void main(String[] args) {
		
		List<Empregado> empregados = new ArrayList<>();
		List<Fornecedor> fornecedores = new ArrayList<>();
		List<Administrador> administradores = new ArrayList<>();
		List<Operario> operarios = new ArrayList<>();
		List<Vendedor> vendedores = new ArrayList<>();
		int qTrabalhador = Integer.parseInt(JOptionPane.showInputDialog("Quantos trabalhadores você quer cadastrar?"));
		for(int i = 0; i<qTrabalhador;i++) {
			int tipoTrabalhador = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de trabalhador você quer cadastrar? 1-Empregado ou 2-Fornecedor"));
			int tipoEmpregado;
			
			
			if(tipoTrabalhador == 1) {
				tipoEmpregado = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de Empregado você quer cadastrar? 1-Empregado padrão, 2-Administrador, 3-Operario ou 4-Vendedor"));
				
				if(tipoEmpregado == 1) {
						String nome = JOptionPane.showInputDialog("Qual o seu nome?");
					
						String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
						
						String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
						
						int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
						
						double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
						
						double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
						
						Empregado emp = FactoryEmpregado.getEmpregado(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
						empregados.add(emp);
						
					
				}else {
					if(tipoEmpregado == 2) {
						//Administrador:
							
							String nome = JOptionPane.showInputDialog("Qual o seu nome?");
							
							String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
							
							String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
							
							int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
							
							double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
							
							double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
							
							double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi a sua ajuda de custo?"));
		
							Administrador adm = FactoryAdministrador.getAdminstrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
							administradores.add(adm);
							
					}else {
						if(tipoEmpregado == 3) {
							//Operario:
								
								String nome = JOptionPane.showInputDialog("Qual o seu nome?");
								
								String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
								
								String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
								
								int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
															
								double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
															
								double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
								
								double valorProducao = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
								
								double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
								
								Operario op = FactoryOperario.getOperario(nome,endereco,telefone,codigoSetor,salarioBase,imposto,valorProducao,comissao);
								operarios.add(op);
							
						}else {
							if(tipoEmpregado == 4) {
								//Vendedor:
									
									String nome = JOptionPane.showInputDialog("Qual o seu nome?");
									
									String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
																	
									String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
															
									int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu numero do seu setor da empresa?"));
																	
									double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario base?"));
																	
									double imposto = Double.parseDouble(JOptionPane.showInputDialog("Quantos porcento de imposto?"));
																	
									double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce vendeu?"));
																	
									double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem você vai ganhar?"));
									
									Vendedor ved = FactoryVendedor.getVendedor(nome,endereco,telefone,codigoSetor,salarioBase,imposto,valorVendas,comissao);
									vendedores.add(ved);
										
											
							}else {
								
								JOptionPane.showMessageDialog(null, "Empregado invalido");
							}
						}
					}
				}
			}else {
				if(tipoTrabalhador == 2) {
					//Fornecedor:
					
						String nome = JOptionPane.showInputDialog("Qual o seu nome?");
						
						String endereco = JOptionPane.showInputDialog("Qual o seu endereco?");
						
						String telefone = JOptionPane.showInputDialog("Qual o seu telefone?");
						
						double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu credito atual?"));
						
						double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Quanto voce tem de divida?"));
						
						Fornecedor forne = FactoryFornecedor.getFornecedor(nome,endereco,telefone,valorCredito,valorDivida);
						fornecedores.add(forne);
				
				}else {
					JOptionPane.showMessageDialog(null, "Trabalhador invalido");
				}
			}
			
		
		}
		JOptionPane.showMessageDialog(null, empregados.toString());
		JOptionPane.showMessageDialog(null, administradores.toString());
		JOptionPane.showMessageDialog(null, operarios.toString());
		JOptionPane.showMessageDialog(null, vendedores.toString());
		JOptionPane.showMessageDialog(null, fornecedores.toString());
		
			
			
		
	}

}
