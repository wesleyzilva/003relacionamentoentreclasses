package relacionamentoentreclasses;

import java.util.Locale.Category;
import java.util.Random;

/* RELACIONAMENTO ENTRE CLASSES
 * > Agregação é uma relação da classe A do tipo "tem um" atributo abstrato da outra classe B observando a MULTIPLICIDADE/CARDINALIDADE da classe
 * ver: https://www.youtube.com/playlist?list=PLHz_AreHm4dkBs-795Dsgvau_ekxg8g1r
 * 
 * > Associação
 */
public class Luta implements AcaoLuta {

//Tipo abstrato de atributo desafiado/desafiante associado a outra classe criando uma instância de outra classe ou objeto.
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

///////////////////////////////////////////////////////////////////////////////////
	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	private int getRounds() {
		return rounds;
	}

	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean isAprovada() {
		return aprovada;
	}
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

///////////////////////////////////////////////////////////////////////////////////
	/*
	 * Com a agregação, podemos usar um método ou objeto abstrato de outra classe.
	 */

	@Override
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			aprovada = true;
			desafiado = l1;
			desafiante = l2;
		} else {
			aprovada = false;
			desafiado = null;
			desafiante = null;
		}
	}

	@Override
	public void lutar() {
		if (aprovada == true) {
			System.out.println("Luta aprovada");
			this.desafiado.apresentar(); // Desafiado é um objeto do tipo Lutador
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0,1,2,3

			switch (vencedor) {
			case 0: // Luta EMPATADA
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				System.out.println("!!! Empate !!!");
				break;

			case 1: // Desafiado GANHA
				desafiado.ganharLuta();
				desafiante.perderLuta();
				System.out.println("!!! Ganhou desafiado !!!");
				break;

			case 2:// Desafiante GANHA
				desafiante.ganharLuta();
				desafiado.perderLuta();
				System.out.println("!!! Ganhou desafiante !!!");
				break;
			}
		} else {
			System.out.println("Luta NÃO aprovada");

		}
	}

}
