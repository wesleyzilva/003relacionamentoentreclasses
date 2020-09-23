/**
 * 
 */
package relacionamentoentreclasses;

import java.util.Vector;

/**
 * @author wesley
 *
 */
public class MetodoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Criando um vetor com variáveis compostas para instanciamento da classe

		Lutador l[] = new Lutador[6];

		//Objeto em um vetor
		l[0] = new Lutador("BRA happy", "Brasil", 31, 1.75f, 60.2f, 11, 3, 5);
		l[1]= new Lutador ("FRA cu", "França", 31, 1.75f, 58.3f, 4, 5, 3);
//		l[2]= new Lutador ("EUA tonto", "Estados Unidos", 31, 1.75f, 68.3f, 4, 9, 3);
//		l[3]= new Lutador ("URRS ice", "Russia", 31, 1.75f, 70.3f, 0, 0, 0);
//		l[4]= new Lutador ("COL coc", "Comlombia", 31, 1.75f, 78.3f, 1, 1, 1);
//		l[5]= new Lutador ("JAP tornado", "Japão", 31, 1.75f, 98.3f, 2, 2, 2);
		l[0].apresentar();
		l[0].ganharLuta();
		l[0].status();
		l[0].perderLuta();
		l[0].perderLuta();
		l[0].perderLuta();
		l[0].perderLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].ganharLuta();
		l[0].status();

		l[1].apresentar();
		l[1].ganharLuta();
		l[1].status();
		l[1].perderLuta();
		l[1].perderLuta();
		l[1].perderLuta();
		l[1].perderLuta();
		l[1].ganharLuta();
		l[1].ganharLuta();
		l[1].ganharLuta();
		l[1].ganharLuta();
		l[1].ganharLuta();
		l[1].status();
	}

}
