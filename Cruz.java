
import stanford.karel.*;

public class Cruz extends KarelMejorada{

	public void run(){
		
		while (frontIsClear()||facingSouth()){

			if (facingEast()||frontIsBlocked()){
				encuentraBeeper();
				subeUnaFilaParaIzquierda();
			}
			if (facingWest()||frontIsBlocked()){
				encuentraBeeper();
				subeUnaFilaParaDerecha();
			}
		}
		daLaVuelta();
	}


	private void encuentraBeeper(){
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


	
	
}
