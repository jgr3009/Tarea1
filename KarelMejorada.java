
import com.sun.org.apache.bcel.internal.generic.DADD;

/*
 * Autor: Jorge Garc�a
 * 
 * Hace todo lo que hace Karel y adem�s 
 * incluye algunos m�todos extra
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
		turnRight();
	}

	/*
	 * Da media vuelta a Karel dando dos giros a la izquierda.
	 */

	public void daLaVuelta() {
		turnLeft();
		turnLeft();
	}

	/*
	 * Rellena agujero, lo que supone que Karel est� mirando  
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