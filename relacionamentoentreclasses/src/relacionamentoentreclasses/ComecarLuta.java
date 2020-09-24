/**
 * 
 */
package relacionamentoentreclasses;

import java.util.Vector;

public class ComecarLuta {

	public static void main(String[] args) {
// Criando um vetor com variáveis compostas para instanciamento da classe

		// Objeto em um vetor para criar varios lutadores
		Lutador lutador[] = new Lutador[6];
		lutador[0] = new Lutador("BRA happy", "Brasil", 31, 1.75f, 60.2f, 11, 3, 5);
		lutador[1] = new Lutador("FRA cu", "França", 31, 1.75f, 58.3f, 4, 5, 3);
//		l[2]= new Lutador ("EUA tonto", "Estados Unidos", 31, 1.75f, 68.3f, 4, 9, 3);
//		l[3]= new Lutador ("URRS ice", "Russia", 31, 1.75f, 70.3f, 0, 0, 0);
//		l[4]= new Lutador ("COL coc", "Comlombia", 31, 1.75f, 78.3f, 1, 1, 1);
//		l[5]= new Lutador ("JAP tornado", "Japão", 31, 1.75f, 98.3f, 2, 2, 2);

		/*
		 * TESTE DE FUNÇÃO DE LUTADOR E INTERFACE lutador[0].apresentar();
		 * lutador[0].ganharLuta(); lutador[0].perderLuta(); lutador[0].status();
		 */

		// Objeto em um vetor para criar as lutas baseados no relacionamento das classes
		Luta lutaUFC01 = new Luta();
		lutaUFC01.marcarLuta(lutador[0], lutador[1]);
		lutaUFC01.lutar();

		lutador[0].status();
		lutador[1].status();
		
	}

}
