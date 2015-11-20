/*
 * Autor: JORGE GARC�A ROJO
 * 
 * En este ejercicio Karel empieza en la esquina inferior izquierda 
 * y mirando al este en un mundo de 9x10 (aunque tambi�n funciona en otros mundos).
 * Tiene que saltar las agujas, de una en una, sin soltar la aguja que est� saltando.
 * Cuando salte la �ltima aguja, debe subir hasta arriba, volver a bajar y quedarse en la esquina 
 * inferior derecha mirando al este.
 * 
 */


import stanford.karel.*;

public class SaltaAgujas2 extends KarelMejorada{

	public void run(){

		saltaLasAgujas();
		llegaAlFinal();
	}

	//Este m�todo hace que Karel salte las agujas, de una en una, sin soltar la aguja que est� saltando
	//Y llega hasta la esquina superior derecha y da la vuelta.
	private void saltaLasAgujas(){
		
		while (frontIsClear()){
			move();
		}
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
			//Cuando Karel llega la la esquina superior derecha, da la vuelta.
			if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
			}
		}
	}

	//Este m�todo hace que Karel baje la �ltima columna 
	//y se quede en la esquina inferior derecha y mirando al este.
	private void llegaAlFinal(){

		while (frontIsClear()){
			move();
		}
		turnLeft();
	}
}