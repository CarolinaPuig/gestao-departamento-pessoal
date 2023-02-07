//Carolina Goudromihos Puig-95078

package fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		String aux, escolha="sim", nome, dataNascimento, dataFormatada;
		int opcao;
		float valorHoraTrabalho, gorjeta, bonus, salario;
		LocalDate minhaData;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux=JOptionPane.showInputDialog("Qual salário deseja calcular?\n(1)Funcionário\n(2)Garçom\n(3)Gerente");
				opcao=Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					Funcionario f;
					aux= JOptionPane.showInputDialog("Informe o nome do funcionário");
					nome=aux;
					aux= JOptionPane.showInputDialog("Informe a data de nascimento do funcionário");
					dataNascimento = aux.substring(6,10);
					dataNascimento += "-" + aux.substring(3,5);
					dataNascimento += "-" + aux.substring(0,2);
					minhaData = LocalDate.parse(dataNascimento);
					aux=JOptionPane.showInputDialog("Informe o valor da hora de trabalho");
					valorHoraTrabalho=Float.parseFloat(aux);
					f= new Funcionario (nome,minhaData, valorHoraTrabalho);
					DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					dataFormatada = f.getDataNascimento().format(dft);
					
					salario=f.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: "+nome);
					JOptionPane.showMessageDialog(null, "Idade: "+ f.calculaIdade());
					JOptionPane.showMessageDialog(null, "Data de nascimento: "+ dataFormatada);
					JOptionPane.showMessageDialog(null, "Salário: "+salario);					
					break;

				case 2:
					Garcom g;
					aux= JOptionPane.showInputDialog("Informe o nome do garçom");
					nome=aux;
					aux= JOptionPane.showInputDialog("Informe a data de nascimento do garçom");
					dataNascimento = aux.substring(6,10);
					dataNascimento += "-" + aux.substring(3,5);
					dataNascimento += "-" + aux.substring(0,2);
					minhaData = LocalDate.parse(dataNascimento);
					aux=JOptionPane.showInputDialog("Informe o valor da hora de trabalho");
					valorHoraTrabalho=Float.parseFloat(aux);
					aux= JOptionPane.showInputDialog("Informe valor da gorjeta");
					gorjeta=Float.parseFloat(aux);
					g= new Garcom (nome,minhaData, valorHoraTrabalho,gorjeta);
					DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					dataFormatada = g.getDataNascimento().format(dft1);
					
					salario=g.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: "+nome);
					JOptionPane.showMessageDialog(null, "Data de nascimento: "+ dataFormatada);
					JOptionPane.showMessageDialog(null, "Idade: "+ g.calculaIdade());
					JOptionPane.showMessageDialog(null, "Salário: "+salario);					
					break;
				case 3:
					Gerente ge;
					aux= JOptionPane.showInputDialog("Informe o nome do gerente");
					nome=aux;
					aux= JOptionPane.showInputDialog("Informe a data de nascimento do gerente");
					dataNascimento = aux.substring(6,10);
					dataNascimento += "-" + aux.substring(3,5);
					dataNascimento += "-" + aux.substring(0,2);
					minhaData = LocalDate.parse(dataNascimento);
					aux=JOptionPane.showInputDialog("Informe o valor da hora de trabalho");
					valorHoraTrabalho=Float.parseFloat(aux);
					aux= JOptionPane.showInputDialog("Informe valor do bônus");
					bonus=Float.parseFloat(aux);
					ge= new Gerente (nome,minhaData, valorHoraTrabalho,bonus);
					DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					dataFormatada = ge.getDataNascimento().format(dft2);
					
					salario=ge.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: "+nome);
					JOptionPane.showMessageDialog(null, "Data de nascimento: "+ dataFormatada);
					JOptionPane.showMessageDialog(null, "Idade: "+ ge.calculaIdade());
					JOptionPane.showMessageDialog(null, "Salário: "+salario);					
					break;
				default:
					throw new Exception("Opção inválida!");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar?");	
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de programa! Até breve.");
	}

}
