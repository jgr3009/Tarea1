
/*
 * Auto: JORGE GARCÍA ROJO
 * 
 * En este ejercicio Karel empieza en la esquina inferior izquierda, mirando al este, con infinitos beepers
 * y en un mundo de 10x10, y con un beeper en el 4x6. Karel tiene que buscar el beeper 
 * y dibujar una linea de beeper desde el propio beeper hasta la pared de la derecha, volver y dibujar
 * otra línea desde el beeper que había al inicio hasta el suelo. 
 * Después de Karel debe volver al inicio quedándose en la esquina inferior izquierda y mirando al este.
 *
 */

import stanford.karel.*;

public class Cruz extends KarelMejorada{

	public void run(){

		while (frontIsClear()){
			move();

			encuentraBeeper();
			dibujaCruz();
		}
		vuelveAlInicio();
	}



	private void encuentraBeeper(){
		if (facingWest()&&frontIsBlocked()){
			turnRight();
			move();
			turnRight();
		}
		if (facingEast()&&frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
	}


	private void dibujaCruz(){

		if (beepersPresent()){
			pickBeeper();
			daLaVuelta();
			while (frontIsClear()){
				move();
				putBeeper();
			}
			if (frontIsBlocked()){
				daLaVuelta();
				while (beepersPresent()){
					move();
				}
				if (noBeepersPresent()){
					putBeeper();
					turnLeft();
				}
				while (frontIsClear()){
					move();
					putBeeper();
				}
			}
		}
	}

	private void vuelveAlInicio(){

		if (frontIsBlocked()){
			turnRight();
			while (frontIsClear()){
				move();
			}
			daLaVuelta();
		}
	}
}
