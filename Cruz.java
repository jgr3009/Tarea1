
import stanford.karel.*;

public class Cruz extends KarelMejorada{

	public void run(){
		while (frontIsClear()){
			move();
		//while (frontIsClear()||facingSouth()){

			//if (facingEast()||frontIsBlocked()){
			//encuentraBeeper();
			
		
		//if (facingWest()||frontIsBlocked()){
			//encuentraBeeper();
			
	}
		subeUnaFilaParaDerecha();
		subeUnaFilaParaIzquierda();
	}



	private void encuentraBeeper(){

		while (frontIsClear()){
			move();
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
						while (frontIsClear()&&facingWest()){
							move();
						}
					}

				}
			}

		}


	}
	private void subeUnaFilaParaDerecha(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		while (frontIsClear()){
			move();
		if (facingWest()&&frontIsBlocked()){
			turnRight();
			move();
			turnRight();
		}
		}
	}


	private void subeUnaFilaParaIzquierda(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		while (frontIsClear()){
			move();
		if (facingEast()&&frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
	}
	}



}
