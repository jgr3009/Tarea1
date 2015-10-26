

import stanford.karel.*;

public class StoneMasonKarel extends KarelMejorada{

	public void run(){
		
		turnLeft();
		putBeeper();
		while (frontIsClear()){
			move();
		if (noBeepersPresent()){
			putBeeper();
		}
		
		}
		daLaVuelta();
		while (frontIsClear()){
			move();
			if (frontIsBlocked()){
				turnLeft();
				move();
				if (beepersPresent()){
					turnLeft();
				}
				
			}
		
		}
		
	
	
	}
	}
