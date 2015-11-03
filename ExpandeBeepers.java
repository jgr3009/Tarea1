
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
			while (beepersInBag()){
				putBeeper();
				move();
				if (frontIsBlocked()){
					turnLeft();
					while (frontIsClear()){
						move();
					}
				}
				
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
		
	}
	
}
