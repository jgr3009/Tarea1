
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
						if (frontIsBlocked()){
							turnLeft();
							
						}
						
					}
					if (frontIsBlocked()&&facingSouth()){
						turnLeft();
					}
				}
				turnLeft(); 
					
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
	

