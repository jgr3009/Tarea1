/*
 * 				Autor: Jorge Garc�a Rojo
 * 
 * Conseguir que Karel salga de la "casa" por el hueco,
 * coger el "peri�dico" (beeper), volver a casa y
 * dejar el "peri�dico" (beeper) en el lugar de salida de Karel.
 *
 */
import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {

		public void run(){ 
		while (frontIsClear()){
			while (frontIsClear()){
				move();
			}
			turnLeft();
		}

	}
}