/*
 * 				Autor: Jorge García Rojo
 * 
 * Conseguir que Karel salga de la "casa" por el hueco,
 * coger el "periódico" (beeper), volver a casa y
 * dejar el "periódico" (beeper) en el lugar de salida de Karel.
 *
 */
import stanford.karel.*;

public class CollectNewspaperKarelGigante extends KarelMejorada {

	public void run(){

		while (frontIsClear()){
			move();
			while (frontIsBlocked()){
				giraDerecha();
			}						
			if (leftIsClear()){
				turnLeft();
				while (frontIsClear()){
					move();
					if (beepersPresent()){
						pickBeeper();
						retornaAlInicio();
					}
				}
			}
		}
		putBeeper();
		giraDerecha();
	}
}

