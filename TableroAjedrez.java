import stanford.karel.*;


public class TableroAjedrez extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			putBeeper();
			move();
			while (frontIsBlocked()){
				turnLeft();
				move();
				turnLeft();
			}
		}
		
		
		
		
	}	
	}