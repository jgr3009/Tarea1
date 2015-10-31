/*
 * Autor: JORGE GARC�A ROJO
 * 
 * En este ejercicio Karel empiez en la esquina inferior izquierda 
 * y mierando al este. Tiene que saltar las agujas, de una en una, sin soltar la aguja que est� saltando.
 * Cuando llegue al final, debe subir hasta arriba, volver a bajar y quedarse mirando al este.
 * 
 */


import stanford.karel.*;

public class SaltaAgujas extends KarelMejorada{

	public void run(){
		saltaLasAgujas();
		llegaAlFinal();
	}

	//Este m�todo hace que Karel salte las agujas, de una en una, sin soltar la aguja que est� saltando.
	//Y que cuando llegue al final suba y baje la �ltima columna.
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

	//Este m�todo hace que Karel baje la �ltima columna y se quede mirando al este.
	private void llegaAlFinal(){
		while (frontIsClear()){
			move();
		}
		turnLeft();

	}
}
