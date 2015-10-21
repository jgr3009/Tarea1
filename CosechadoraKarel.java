import java.time.DayOfWeek;


/*
 * Este ejercicio usa un mapa con beepers
 * Karel tiene que recogerlos todos subiendo fila por fila
 * Parte de la esquina inferior izquierda mirando hacia el Este
 * y termina en el mismo sitio
 */

public class CosechadoraKarel extends KarelMejorada{

	public void run(){

		//subir a Karel a la segunda fila

		//limpia todos los beepers de una fila

		//Cuando llegue al final de la fila sube a la de arriba
		

		while (frontIsClear()){
			
			if (facingEast()||frontIsBlocked()){
				limpiaUnaFila();
				subeUnaFilaParaIzquierda();
				

			}
			if (facingWest()||frontIsBlocked()){
				limpiaUnaFila();
				subeUnaFilaParaDerecha();
				
			}
			if (rightIsBlocked()){
				turnLeft();
				while (frontIsClear()){
				move();
				
				}
				}
		}
		
	}
	private void limpiaUnaFila(){
		//Karel se mueve por toda la fila y recoge todos los beepers que haya
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
	}
	private void subeUnaFilaParaDerecha(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		
		turnRight();
		move();
		turnRight();
		
	}
	private void subeUnaFilaParaIzquierda(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		turnLeft();
		move();
		turnLeft();

	}
	/*private void retornaAlInicio(){
		if (rightIsBlocked()){
			turnLeft();
			while (frontIsClear()){
			move();
			
			}*/
			
		}
	}
	
	
}


/*	public void run(){



		while(frontIsClear()){
			limpiaColumnaDeSubida();
			limpiaColumnaDeBajada();
			move();
		}
		if(frontIsClear()){
			if(rightIsBlocked()){
				turnAround();
			}
			while (frontIsClear()){
				move();
			}
			turnLeft();
			//retornoAlInicio();
		}


	private void limpiaColumnaDeSubida(){
		turnLeft();
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
		while (frontIsBlocked()){
			turnRight();
			move();
			turnRight();
		}
	}

	private void limpiaColumnaDeBajada(){

		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
		while (frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
	}
}
private void retornoAlInicio(){
}	turnAround();
	while (frontIsClear()){

 */



