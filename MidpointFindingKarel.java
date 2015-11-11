

import stanford.karel.*;

public class MidpointFindingKarel extends KarelMejorada {
	
	public void run(){
		
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				daLaVuelta();
			}
			if (frontIsBlocked()){
				daLaVuelta();
				putBeeper();
				
				
			}
		}
		if (beepersPresent()){
			daLaVuelta();
		}
		
	}

	

}
