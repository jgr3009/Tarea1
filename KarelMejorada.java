
/*
 * Autor: Jorge García
 * 
 * Hace todo lo que hace Karel y además 
 * incluye algunos métodos extra
 * 
 * 
 */
import stanford.karel.*;

public class KarelMejorada extends SuperKarel{


	/*
	 * Gira a la derecha realizando tres giros a la izquierda
	 * para completar un giro a la derecha.
	 */

	public	void giraDerecha() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	/*
	 * Da media vuelta a Karel dando dos giros a la izquierda.
	 */

	public void daLaVuelta() {
		turnLeft();
		turnLeft();
	}

	/*
	 * Rellena agujero, lo que supone que Karel está mirando  
	 * hacia el Este, que tiene un hueco debajo y que va a poner
	 * un beeper en si
	 */

	public void rellenaAgujero(){
		giraDerecha();
		move();
		putBeeper();
		daLaVuelta();
		move();
		giraDerecha();
		}
}