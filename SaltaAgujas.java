/*
 * Autor: JORGE GARCÍA ROJO
 * 
 * En este ejercicio Karel empiez en la esquina inferior izquierda 
 * y mierando al este. Tiene que saltar las agujas, de una en una, sin soltar la aguja que está saltando.
 * Cuando llegue al final, debe subir hasta arriba, volver a bajar y quedarse mirando al este.
 * 
 */


import stanford.karel.*;

public class SaltaAgujas extends KarelMejorada{

	public void run(){
		saltaLasAgujas();
		llegaAlFinal();
	}

	//Este método hace que Karel salte las agujas, de una en una, sin soltar la aguja que está saltando.
	//Y que cuando llegue al final suba y baje la última columna.
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
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
			}
		}

	}

	//Este método hace que Karel baje la última columna y se quede mirando al este.
	private void llegaAlFinal(){
		while (frontIsClear()){
			move();
		}
		turnLeft();

	}
}
