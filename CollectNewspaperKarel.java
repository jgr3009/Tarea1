/*
 * 				Autor: Jorge García Rojo
 * 
 * Conseguir que Karel salga de la "casa" por el hueco,
 * coger el "periódico" (beeper), volver a casa y
 * dejar el "periódico" (beeper) en el lugar de salida de Karel.
 *
 */
import stanford.karel.*;

public class CollectNewspaperKarel extends KarelMejorada {

	public void run(){

		// moverHastaPared
		// girar a la derecha
		// si no hay pared a la izquierda girar a la izquierda
		// cuando haya un beeper cogerlo y dar la vuelta


		while (frontIsClear()){
			while (frontIsClear()){
				move();				
				if (leftIsClear()){
					turnLeft();
				
						if (beepersPresent()){
							pickBeeper();
							retornaAlInicio();
							putBeeper();
							
						
						}
					
						
			}

			

		}
		giraDerecha();
		}
		}
	}
		
	

