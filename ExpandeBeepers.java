
/*
 * Autor: JORGE GARCÍA ROJO
 * 
 * 
 * 
 */


import stanford.karel.*;

public class ExpandeBeepers extends KarelMejorada{

	public void run(){

		while (frontIsClear()){
			move();
			while (beepersPresent()){
				pickBeeper();

			}
			turnLeft();
			expandeBeepers();
			bajaAbajo();


			if (frontIsBlocked()){
				turnLeft();
			}

		}

	}
	private void expandeBeepers(){
		while (beepersInBag()){
			putBeeper();
			move();
		}
	}

	private void bajaAbajo(){
		if (noBeepersInBag()){
			turnRight();
			move();
			turnRight();
			while (frontIsClear()){
				move();
			}
			turnLeft();

		}
	}

}
