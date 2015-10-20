
/*
 * Este ejercicio usa un mapa con beepers
 * Karel tiene que recogerlos todos
 * Parte de la esquina inferior izquierda mirando hacia el Este
 * y termina en el mismo sitio
 */

public class CosechadoraKarel extends KarelMejorada{

	public void run(){

		//subir a Karel a la segunda fila

		//limpia todos los beepers de una fila

		//Cuando llegue al final de la fila sube a la de arriba


		while (frontIsClear()){

			while (facingEast()||frontIsBlocked()){
				limpiaUnaFila();
				subeUnaFilaParaIzquierda();

			}
			while (facingWest()||frontIsBlocked()){
				limpiaUnaFila();
				if (frontIsBlocked()){
					daLaVuelta();
				}
				subeUnaFilaParaDerecha();
			}
			
			}
		retornaAlInicio();
	}
	private void retornaAlInicio(){
				if (frontIsClear()){
			move();
		}
		
	}
	private void subeUnaFilaParaDerecha(){
		turnRight();
		move();
		turnRight();
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
	private void subeUnaFilaParaIzquierda(){
		//Karel gira a la izquierda se mueve y gira a la derecha
		//Se queda mirando hacia el Este
		turnLeft();
		move();
		turnLeft();

	}


}
