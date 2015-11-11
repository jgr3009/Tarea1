

import stanford.karel.*;

public class MidpointFindingKarel extends KarelMejorada {
	
	public void run(){
		
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				daLaVuelta();
				move();
				putBeeper();
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
