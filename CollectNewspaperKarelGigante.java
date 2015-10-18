/*
 * 				Autor: Jorge García Rojo
 * 
 * Conseguir que Karel salga de la "casa" por el hueco,
 * coja el "periódico" (beeper), volver a "casa" y
 * dejar el "periódico" (beeper) en el lugar de inicio de Karel.
 *
 */
import stanford.karel.*;

public class CollectNewspaperKarelGigante extends KarelMejorada {

	public void run(){

		/*
		 * mover a Karel hasta la pared y girar a la derecha.
		 */
		while (frontIsClear()){
			move();

			while (frontIsBlocked()){
				giraDerecha();
			}						
			/*
			 * Para que Karel salga de la "casa" girar
			 * a la izquierda cuando pase por el hueco y llegar
			 * hasta el beeper.
			 */
			if (leftIsClear()){
				turnLeft();
				while (frontIsClear()){
					move();
					/*
					 * Coger el beeper cuando Karel esté sobre él.		
					 */
					if (beepersPresent()){
						pickBeeper();
						/*
						 * Una vez cogido el beeper hacer que Karel de la vuelta
						 * hasta la casa y hacer que vuelva al lugar de inicio.				
						 */
						retornaAlInicio();
					}
				}
			}
		}
		/*
		 * Hacer que Karel deje el beeper y se quede en su posición inicial.
		 */
		putBeeper();
		giraDerecha();
	}
	/*
	 * Hace que Karel de la vuelta, se mueva y gire a la derecha.
	 * Este método es privado porque solo valdría para este ejercicio
	 * o uno similar.
	 */

	private void retornaAlInicio(){
		daLaVuelta();
		while (frontIsClear()){
			move();
		}
		giraDerecha();
	}
}

