import stanford.karel.*;

public class ExpandeBeepers extends KarelMejorada{

	public void run(){
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				turnLeft();
				
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
				daLaVuelta();
			}
			/*while (frontIsClear()){
				move();
			}*/
			turnLeft();
		}


	
		}
}
