
import com.sun.org.apache.bcel.internal.generic.DADD;

/*
 * Autor: Jorge García
 * 
 * Hace todo lo que hace Karel y además 
 * incluye algunos métodos extra
 * 
 * 
 */
import stanford.karel.Karel;

public class KarelMejorada extends Karel{


	/*
	 * Gira a la derecha realiza tres giros a la izquierda
	 * para completar un giro a la derecha
	 */

	public	void giraDerecha() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	/*
	 * Da media vuelta a Karel dando dos giros a la izquierda
	 */

	public void dalaVuelta() {
		turnLeft();
		turnLeft();
	}

	/*
	 * Rellena agujero, lo que supone que Karel está mirando  
	 * hacia el Este, que tiene un hueco debajo y que va poner
	 * un beeper en si
	 */

	public void rellenaAgujero(){
		giraDerecha();
		move();
		putBeeper();
		dalaVuelta();
		move();
		giraDerecha();

	}
	public void retornaAlInicio(){
		dalaVuelta();
		while (frontIsClear()){
			move();
			
					
		}
		if (frontIsBlocked()){
		
	}
	}
	
	
		
}