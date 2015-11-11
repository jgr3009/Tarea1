

import stanford.karel.*;

public class MidpointFindingKarel extends KarelMejorada {
	
	public void run(){
		
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				daLaVuelta();
				move();
				putBeeper();
				if (beepersPresent()){
					pickBeeper();
				}
			}
			if (frontIsBlocked()){
				daLaVuelta();
				putBeeper();
				
				
			}
		}
		
		
	}

	

}
