
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
				turnLeft();
			}
		}
		
	}
}
