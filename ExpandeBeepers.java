
/*
 * Autor: JORGE GARC�A ROJO
 * 
 * 
 * 
 */


import stanford.karel.*;

public class ExpandeBeepers extends KarelMejorada{

	public void run(){
	
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
		
	}
}
