/*
 * Autor: JORGE GARCÍA ROJO
 * 
 * En este ejercicio Karel empiez en la esquina inferior izquierda 
 * y mierando al este. Tiene que saltar las agujas, de una en una, sin soltar la aguja que está saltando.
 * Cuando llegue al final, debe subir hasta arriba y volver a bajar.
 * 
 */


import stanford.karel.*;

public class SaltaAgujas extends KarelMejorada{

	public void run(){
		saltaLasAgujas();
		/*while (frontIsBlocked()){
			turnLeft();
			while (frontIsClear()){
				move();
				if (rightIsClear()){
					turnRight();
					move();
					turnRight();
				}
			}*/
			subeUltimaColumna();
			/*if (frontIsBlocked()&&facingNorth()){
				daLaVuelta();
			}*/
		
		llegaAlFinal();
		/*while (frontIsClear()){
			move();
			if (frontIsBlocked()&&facingNorth()){
				turnLeft();
			}
		}*/
		

	}
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
		}
		turnLeft();
	}
	
	private void subeUltimaColumna(){
		if (frontIsBlocked()&&facingNorth()){
			daLaVuelta();
		}
	}
	private void llegaAlFinal(){
		while (frontIsClear()){
			move();
			if (frontIsBlocked()&&facingNorth()){
				turnLeft();
			}
		}
		
	}
	}
