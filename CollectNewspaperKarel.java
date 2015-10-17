/*
 * 				Autor: Jorge García Rojo
 * 
 * Conseguir que Karel salga de la "casa" por el hueco,
 * coger el "periódico" (beeper), volver a casa y
 * dejar el "periódico" (beeper) en el lugar de salida de Karel.
 *
 */
import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {

	public void run(){

		// moverHastaPared
		// girar a la derecha
		// cuando no haya pared girar a la izquierda
		// cuando haya un beeper cogerlo y dar la vuelta

	
	private void pared() {
		move();
	}
		while (frontIsClear()){
			while (frontIsClear()){
				move();
			}
			turnLeft();
		}

	}
}