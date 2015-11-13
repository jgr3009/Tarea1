
/*
 * Auto: JORGE GARCÍA ROJO
 * 
 * En este ejercicio Karel empieza en la esquina inferior izquierda, mirando al este, con infinitos beepers
 * y en un mundo de 10x10, y con un beeper en el 4x6. Karel tiene que buscar el beeper 
 * y dibujar una linea de beepers desde el propio beeper hasta la pared de la derecha, volver y dibujar
 * otra línea desde el beeper que había al inicio hasta el suelo. 
 * Después Karel debe volver al inicio quedándose en la esquina inferior izquierda y mirando al este.
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


	//Este método es para que Karel encuentre el beeper que hay en el mundo.
	private void encuentraBeeper(){
		if (facingWest()&&frontIsBlocked()){
			turnRight();
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
				while (frontIsClear()){
					move();}
				if (beepersPresent()&&facingSouth()){
					pickBeeper();
					turnLeft();
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
			move();
			turnRight();
		}
		if (facingEast()&&frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
		
	}

	//Este método es para que Karel, una vez encontrado el beeper,
	//empiece a dibujar las líneas de beepers.
	private void dibujaCruz(){

		if (beepersPresent()&&facingWest()){
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
		if (beepersPresent()&&facingEast()){
			pickBeeper();
			
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

	//Método para que Karel vuelva al inicio, quedándose en la esquina 
	//inferior izquierda y mirando al este.
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
