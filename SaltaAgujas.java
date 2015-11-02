/*
 * Autor: JORGE GARCÍA ROJO
 * 
 * En este ejercicio Karel empieza en la esquina inferior izquierda 
 * y mierando al este en un mundo de 9x10. Tiene que saltar las agujas, de una en una, sin soltar la aguja que está saltando.
 * Cuando salte la última aguja, debe subir hasta arriba, volver a bajar y quedarse en la esquina 
 * inferior derecha mirando al este.
 * 
 */


import stanford.karel.*;

public class SaltaAgujas extends KarelMejorada{

	public void run(){

		saltaLasAgujas();
		llegaAlFinal();
	}

	//Este método hace que Karel salte las agujas, de una en una, sin soltar la aguja que está saltando.
	private void saltaLasAgujas(){

		while (frontIsBlocked()){
			turnLeft();
			while (frontIsClear()){
				move();
				if (rightIsClear()){
					turnRight();
					move();
					turnRight();
				}
			}
			/*if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
			}*/
		}
	}

	//Este método hace que Karel baje la última columna y se quede mirando al este.
	private void llegaAlFinal(){
		if (frontIsBlocked()&&facingNorth()){
			daLaVuelta();
		}
		while (frontIsClear()){
			move();
		}
		turnLeft();
	}
}
