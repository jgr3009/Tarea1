import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{



	public void run(){

		//subir a Karel a la segunda fila

		//limpia todos los beepers de una fila

		//Cuando llegue al final de la fila sube a la de arriba


		ponerBeeper();
	}


	private void ponerBeeper(){
		//Karel se mueve por toda la fila y recoge todos los beepers que haya
		while (frontIsClear()){
			if (facingEast()&&frontIsBlocked()){

				subeUnaFilaParaIzquierda();


			}
			if (facingWest()&&frontIsBlocked()){

				subeUnaFilaParaDerecha();

			}
			

		}
		move();
		putBeeper();
		move();
	}
	private void subeUnaFilaParaDerecha(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared

		turnRight();
		move();
		turnRight();
		/*if (rightIsBlocked()){
				turnLeft();
				while (frontIsClear()){
				move();

				}*/	
	}


	private void subeUnaFilaParaIzquierda(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		turnLeft();
		move();
		turnLeft();

	}

}
