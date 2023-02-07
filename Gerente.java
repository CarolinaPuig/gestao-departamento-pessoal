//Carolina Goudromihos Puig- 95078

package fiap;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	private float bonus;

	public Gerente() {
		}

	public Gerente(String nome, LocalDate dataNascimento, float valorHoraTrabalho, float bonus) {
		super.setDataNascimento(dataNascimento);
		super.setNome(nome);
		super.setValorHoraTrabalho(valorHoraTrabalho);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float calculaSalario() {
		float salario = (((super.getValorHoraTrabalho()*40)*4)*(1+bonus/100));
		return salario;
	}
	
}
