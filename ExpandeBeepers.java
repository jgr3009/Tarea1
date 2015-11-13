import stanford.karel.*;

public class ExpandeBeepers extends KarelMejorada
{

	public void run(){
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				turnLeft();
				pickBeeper();
				while (beepersPresent()){
					pickBeeper();

				}
			}
			
			
			
			while (beepersInBag()){
				putBeeper();
				move();
				if (frontIsBlocked()){
					turnRight();
				}

			}
			if (noBeepersInBag()){
				turnRight();
				move();
				turnRight();
			}
			while (frontIsClear()){
				move();
			}
			turnLeft();
		}


	}
}
