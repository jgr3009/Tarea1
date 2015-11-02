
import stanford.karel.*;

public class Cruz extends KarelMejorada{

	public void run(){
		while (frontIsClear()){
			move();
		
			subeUnaFilaParaIzquierda();
			subeUnaFilaParaDerecha();
			encuentraBeeper();
			vuelveAlInicio();
	
		}
		
		
	}
	private void vuelveAlInicio(){
		
		if (frontIsBlocked()){
			turnRight();
		}
	}

	private void subeUnaFilaParaDerecha(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		
		if (facingWest()&&frontIsBlocked()){
			turnRight();
			move();
			turnRight();
		}
		}
	


	private void subeUnaFilaParaIzquierda(){
		//Hace que Karel suba una fila hacia su derecha cuando llega a la pared
		
		if (facingEast()&&frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		
	}
	}
	private void encuentraBeeper(){

		//while (frontIsClear()){
		//	move();
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

		//}


	}



}
