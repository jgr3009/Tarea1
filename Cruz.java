
import stanford.karel.*;

public class Cruz extends KarelMejorada{

	public void run(){

		while (frontIsClear()){
			move();

			encuentraBeeper();
			dibujaCruz();
		}
		vuelveAlInicio();
	}



	private void encuentraBeeper(){
		if (facingWest()&&frontIsBlocked()){
			turnRight();
			move();
			turnRight();
		}
		if (facingEast()&&frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
	}


	private void dibujaCruz(){

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
				}
			}
		}
	}

	private void vuelveAlInicio(){

		if (frontIsBlocked()){
			turnRight();
			while (frontIsClear()){
				move();
			}
			daLaVuelta();
		}
	}
}
